package ca.savi.authentication.keystone.AllTests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Test;
import ca.savi.aaa.keystone.API.KSServiceAPI;
/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca>
 * @version 0.2
 */
public class ServiceAPITest {
  private static final String username = "adminUser";
  private static final String password = "secretword";
  private static KSServiceAPI ksapi;
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    try {
      ksapi=new KSServiceAPI("resources/config");
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testValideUser() {
    ksapi.authenticateCred(username, password);
  }

}
