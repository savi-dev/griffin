package ca.savi.aaa.keystone.API;

import javax.ws.rs.core.MediaType;
import ca.savi.aaa.keystone.model.KSUserAuthResp;
import ca.savi.aaa.keystone.model.KSUserCred;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 *
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 *
 */
public class KSDriver {

  private String serviceToken;
  private Client client;
  private WebResource tokenEndpoint=null;
  private WebResource credentialEndpoint=null;
  private static KSDriver instance=null;

  public String getServiceToken() {
    return serviceToken;
  }
  public void setServiceToken(String serviceToken) {
    this.serviceToken = serviceToken;
  }
  public String getTokenEndpoint() {
    return tokenEndpoint.toString();
  }
  public void setTokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = client.resource(tokenEndpoint);
  }
  public String getCredentialEndpoint() {
    return credentialEndpoint.toString();
  }
  public void setCredentialEndpoint(String credentialEndpoint) {
    this.credentialEndpoint = client.resource(credentialEndpoint);
  }

  protected KSDriver()
  {
    System.out.println("Configuration is loaded into the object... \n");
    ClientConfig config=new DefaultClientConfig();
   config.getClasses().add(JSONProvider.class);
    client=Client.create(config);
    System.out.println("Object is loaded into the memory... \n");
  }
/**
 * This method is used to create singleton pattern
 * @return an instance of keystone client
 */
  public static KSDriver getInstance()
  {
    if(instance==null)
    {
      instance = new KSDriver();
    }

    return instance;
  }



  /**
   * This method validates the token
   *
   * @param token
   * @return user information in successful authentication otherwise failure
   */
  public KSUserAuthResp validateToken(String token) {
    try
    {
      KSUserAuthResp reponse = tokenEndpoint.path(token)
          .header("X-Auth-Token",serviceToken).accept("application/json")
          .get(new GenericType<KSUserAuthResp>(){});
      return reponse;
    }catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  /**
   * This method is used to perform a password-based authentication
   *
   * @param username
   * @param password
   */
  public KSUserAuthResp authenticateUser(String username, String password) {
    KSUserCred cred=new KSUserCred(username,password);
    try{
      KSUserAuthResp response = credentialEndpoint.accept("application/json").type(MediaType.APPLICATION_JSON)
          .post(KSUserAuthResp.class,cred);
      System.out.println(response);
      return response;
    }catch(Exception e)
    {
      //e.printStackTrace();
      return null;
    }
  }
}