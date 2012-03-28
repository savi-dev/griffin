// Copyright (C) 2012, The SAVI Project.
package ca.savi.authentication.keystone.operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.client.ProxyFactory;
import ca.savi.authentication.keystone.model.KSUserCred;
import ca.savi.authentication.keystone.model.KeystoneResp;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
public class KeyStoneAPI {
  private static String KeyStone_URL;
  private final KeyStoneClient keystone;

  /**
   * 
   * @param path
   *          is the absolute or relative path to configuration file
   * @throws FileNotFoundException
   * @throws IOException
   */
  public KeyStoneAPI(String path) throws FileNotFoundException, IOException {
    Properties prop = new Properties();
    prop.load(new FileInputStream("app.config"));
    KeyStone_URL = prop.getProperty("keystone.url");
    System.out.println("Configuration is loaded into the object... \n");
    keystone = ProxyFactory.create(KeyStoneClient.class, KeyStone_URL);
    System.out.println("Object is loaded into the memory... \n");
  }

  /**
   * This method is used to perform a password-based authentication
   * 
   * @param username
   * @param password
   */
  public void authenticate(String username, String password) {
    KSUserCred credential = new KSUserCred(username, password);
    ClientResponse<KeystoneResp> response = keystone.authenticate(credential);
    response.releaseConnection();
  }
}
