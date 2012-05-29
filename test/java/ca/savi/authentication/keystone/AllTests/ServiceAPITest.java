package ca.savi.authentication.keystone.AllTests;

import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Test;
import ca.savi.aaa.keystone.API.KSServiceAPI;
import ca.savi.aaa.keystone.model.KSUserAuthResp;

/**
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 * @version 0.2
 */
public class ServiceAPITest {
  private static final String username = "admin";
  private static final String password = "secret";
  private static KSServiceAPI ksapi;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    try {
      ksapi = new KSServiceAPI();
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
    KSUserAuthResp resp = ksapi.authenticateCred(username, password);
    assertNotNull(resp.getAccess());
  }

  @Test
  public void testInvalidUser() {
    KSUserAuthResp resp = ksapi.authenticateCred(username.concat("asdasd"),
        password);
    assertNull(resp.getAccess());
  }

  @Test
  public void testValidToken() {
    KSUserAuthResp resp = ksapi.authenticateCred(username, password);
    KSUserAuthResp tokenValidation = ksapi.authenticateToken(resp.getAccess()
        .getToken().getId());
    assertNotNull(tokenValidation.getAccess().getUser());
  }
}
