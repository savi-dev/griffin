package ca.savi.aaa.keystone.API;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ResourceBundle;
import org.jboss.resteasy.client.ProxyFactory;
import com.sun.jersey.api.client.Client;

public class KjerseyAPI {
  
  private static String serviceEndpoint;
  private KSRestAPIs keystone;
  private String servicToken;
 
   public KjerseyAPI() throws FileNotFoundException, IOException {
     ResourceBundle rb = ResourceBundle
         .getBundle("ca.savi.griffin.keystone.config");
     serviceEndpoint = rb.getString("SERVICE_ENDPOINT");
     servicToken = rb.getString("SERVICE_TOKEN");
     System.out
         .println(String.format("KeyStone URL: %s... \n", serviceEndpoint));
    Client client = Client.create();
     System.out.println("KeyStone is connected... \n");
  }
}
