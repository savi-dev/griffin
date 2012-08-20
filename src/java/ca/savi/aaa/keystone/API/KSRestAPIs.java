// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.API;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.jboss.resteasy.client.ClientResponse;
import ca.savi.aaa.keystone.model.KSUser;
import ca.savi.aaa.keystone.model.KSUserAuthResp;
import ca.savi.aaa.keystone.model.KSUserCred;

/**
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 * @version 0.2
 */

public interface KSRestAPIs {
  @POST
  @Path("/tokens")
  @Produces("application/json")
  @Consumes("application/json")
  public ClientResponse<KSUserAuthResp> authCredential(KSUserCred cred);

  @GET
  @Path("/tokens/{id}")
  @Produces("application/json")
  @Consumes("application/json")
  public ClientResponse<KSUserAuthResp> authToken(
      @PathParam("id") String token,
      @HeaderParam("X-Auth-Token") String authToken);

  @GET
  @Path("users/{id}")
  @Produces("application/json")
  @Consumes("application/json")
  public ClientResponse<KSUser> getUserInfo(@PathParam("id") String user_id,
      @HeaderParam("X-Auth-Token") String authToken);
}
