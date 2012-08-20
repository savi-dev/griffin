// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.API;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ResourceBundle;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.client.ProxyFactory;
import ca.savi.aaa.keystone.model.KSUser;
import ca.savi.aaa.keystone.model.KSUserAuthResp;
import ca.savi.aaa.keystone.model.KSUserCred;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca>
 * @version 0.1
 */
public class KSServiceAPI {
  private static String serviceEndpoint;
  private final KSRestAPIs keystone;
  private String servicToken;

  /**
   * This constructor reads configuration from a local file on the disk
   *
   * @throws FileNotFoundException
   * @throws IOException
   */
  public KSServiceAPI() throws FileNotFoundException, IOException {
    ResourceBundle rb = ResourceBundle
        .getBundle("ca.savi.griffin.keystone.config");
    serviceEndpoint = rb.getString("SERVICE_ENDPOINT");
    servicToken = rb.getString("SERVICE_TOKEN");
    System.out
        .println(String.format("KeyStone URL: %s... \n", serviceEndpoint));
    keystone = ProxyFactory.create(KSRestAPIs.class, serviceEndpoint);
    System.out.println("KeyStone is connected... \n");
  }

  /**
   * This constructor receives the configuration in the input arguments
   *
   * @param serviceEndpoint
   *          : the URI that data should data be submitted to
   * @param serviceToken
   *          : This token verifies the authenticity of the service that
   *          requesting user authentication
   */
  public KSServiceAPI(String serviceEndpoint, String serviceToken) {
    serviceEndpoint = String.format("http://%s:%s/v2.0/", serviceEndpoint,
        serviceToken);
    System.out.println("Configuration is loaded into the object... \n");
    keystone = ProxyFactory.create(KSRestAPIs.class, serviceEndpoint);
    System.out.println("Object is loaded into the memory... \n");
  }

  /**
   * This method is used to perform a password-based authentication
   *
   * @param username
   * @param password
   */
  public KSUserAuthResp authenticateCred(String username, String password) {
    KSUserCred credential = new KSUserCred(username, password);
    try {
      ClientResponse<KSUserAuthResp> response = keystone
          .authCredential(credential);
      response.getStatus();
      return response.getEntity();
    }
    catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  /**
   * This method validates the token
   *
   * @param token
   * @return user information in successful authentication otherwise failure
   */
  public KSUserAuthResp authenticateToken(String token) {
    try {
      ClientResponse<KSUserAuthResp> response = keystone.authToken(token,
          this.servicToken);
      return response.getEntity();
    }
    catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  /**
   * This method retrieves the detail user information
   *
   * @param user_id
   *          : each user is identified by an id
   * @return
   */
  public KSUser getUserInfo(String user_id) {
    try {
      ClientResponse<KSUser> reponse = keystone.getUserInfo(user_id,
          this.servicToken);
      return reponse.getEntity();
    }
    catch (Exception e) {
      return null;
    }
  }
}
