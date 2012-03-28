// Copyright (c) 2012, The SAVI Project.
package ca.savi.authentication.keystone.AllTests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import ca.savi.authentication.keystone.operation.KeyStoneAPI;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
public class KeyStoneAPITest {
  @Test
  public void authenticateTest() {
    String username = "adminUser";
    String password = "secretword";
    try {
      new KeyStoneAPI("resources/config").authenticate(username, password);
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

}
