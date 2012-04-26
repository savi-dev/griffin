// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.API;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.jboss.resteasy.client.ClientResponse;
import ca.savi.aaa.keystone.model.KSUser;
import ca.savi.aaa.keystone.model.KSUserAuthResp;
import ca.savi.aaa.keystone.model.KSUserCred;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca>
 * @version 0.2
 */
@Path("/tokens")
public interface KSRestAPIs {
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  public ClientResponse<KSUserAuthResp> authCredential(KSUserCred cred);

  @GET
  @Path("/{id}")
  @Produces("application/json")
  public ClientResponse<KSUserAuthResp> authToken(@PathParam("id") String token); 

  @GET
  @Path("/{id}")
  @Produces("application/json")
  public ClientResponse<KSUser> getUserInfo(@PathParam("id") String user_id);
}
