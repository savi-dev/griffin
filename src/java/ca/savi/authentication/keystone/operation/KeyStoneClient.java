// Copyright (C) 2012, The SAVI Project.
package ca.savi.authentication.keystone.operation;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import ca.savi.authentication.keystone.model.KSUserCred;
import ca.savi.authentication.keystone.model.KeystoneResp;
import org.jboss.resteasy.client.ClientResponse;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@Path("/tokens")
public interface KeyStoneClient {
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  public ClientResponse<KeystoneResp> authenticate(KSUserCred cred);
}
