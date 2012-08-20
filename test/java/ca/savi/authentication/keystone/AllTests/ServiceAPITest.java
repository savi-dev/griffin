package ca.savi.authentication.keystone.AllTests;

<<<<<<< HEAD
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.junit.BeforeClass;
import org.junit.Test;
import ca.savi.aaa.keystone.API.KSDriver;
import ca.savi.aaa.keystone.model.KSUserAuthResp;
import ca.savi.aaa.keystone.model.KSUserCred;
=======
import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Test;
import ca.savi.aaa.keystone.API.KSServiceAPI;
import ca.savi.aaa.keystone.model.KSUserAuthResp;
>>>>>>> 2af70600eb7843d1f87e5c3a4912942c8de8610f

/**
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 * @version 0.2
 */
public class ServiceAPITest {
  private static final String username = "admin";
  private static final String password = "secret";
  private static KSDriver ksapi;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
      ksapi = KSDriver.getInstance();
      ksapi.setServiceToken("ADMIN");
      ksapi.setCredentialEndpoint("http://localhost:35357/v2.0/tokens");
      ksapi.setTokenEndpoint("http://localhost:35357/v2.0/tokens");
  }

  @Test
  public void testValideUser() {
    JAXBContext jaxbContext;
    javax.xml.bind.Marshaller marshaller;
    KSUserCred cred=new KSUserCred(username,password);
    try
    {
        jaxbContext = JAXBContext.newInstance(KSUserCred.class);
        marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(cred, System.out);
    }
    catch (JAXBException e)
    {
        e.printStackTrace();
    }
    System.out.println(ksapi.getCredentialEndpoint());
    KSUserAuthResp resp = ksapi.authenticateUser(username, password);
    assertNotNull(resp.getAccess());
  }

  @Test
  public void testInvalidUser() {
    KSUserAuthResp resp = ksapi.authenticateUser(username.concat("asdasd"),
        password);
    assertNull(resp);
  }

  @Test
  public void testValidToken() {
    KSUserAuthResp resp = ksapi.authenticateUser(username, password);
    KSUserAuthResp tokenValidation = ksapi.validateToken(resp.getAccess()
        .getToken().getId());
    assertNotNull(tokenValidation.getAccess().getUser());
  }
}
