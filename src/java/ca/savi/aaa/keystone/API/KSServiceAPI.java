// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.API;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
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
  private static String KeyStone_URL;
  private final KSRestAPIs keystone;

  /**
   * This constructor reads configuration from a local file on the disk
   * 
   * @param path
   *          is the absolute or relative path to configuration file
   * @throws FileNotFoundException
   * @throws IOException
   */
  public KSServiceAPI(String path) throws FileNotFoundException, IOException {
    Properties prop = new Properties();
    prop.load(new FileInputStream(path));
    prop.getProperty("URL");
    System.out.println(String.format("KeyStone URL: %s... \n", KeyStone_URL));
    keystone = ProxyFactory.create(KSRestAPIs.class, KeyStone_URL);
    System.out.println("KeyStone is connected... \n");
  }

  /**
   * This constructor receives the configuration in the input arguments
   * 
   * @param url
   *          : the IP address of DNS of the machine hosting KeyStone
   * @param port
   *          number
   */
  public KSServiceAPI(String url, String port) {
    KeyStone_URL = String.format("http://%s:%s/v2.0/", url, port);
    System.out.println("Configuration is loaded into the object... \n");
    keystone = ProxyFactory.create(KSRestAPIs.class, KeyStone_URL);
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
    try{
        ClientResponse<KSUserAuthResp> response = keystone.authCredential(credential);
        return response.getEntity();
    }catch(Exception e)
    {
      return null;
    }
    
  }
  public KSUserAuthResp authenticateToken(String token) {
    try{
        ClientResponse<KSUserAuthResp> response = keystone.authToken(token);
        return response.getEntity();
    }catch(Exception e)
    {
      return null;
    }
    
  }
  public KSUser getUserInfo(String user_id)
  {
    try
    {
      ClientResponse<KSUser> reponse=keystone.getUserInfo(user_id);
      return reponse.getEntity();
    }catch(Exception e)
    {
      return null;
    }
  }
}
