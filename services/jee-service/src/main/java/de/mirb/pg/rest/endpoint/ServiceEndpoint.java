package de.mirb.pg.rest.endpoint;

import de.mirb.pg.rest.data.Health;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.UUID;

@Path("service")
@Produces(MediaType.APPLICATION_JSON)
public class ServiceEndpoint {

  private static final UUID SERVICE_ID = UUID.randomUUID();
  private static Health health = new Health(true);

  @GET
  @Path("id")
  public Response getServiceId() {
    return Response.ok().entity("Service ID: " + SERVICE_ID.toString()).header("x-health", health.getHealth()).build();
  }

  @GET
  @Path("health")
  public Response getHealth() {
    return Response.ok().entity(health).build();
  }

  @PUT
  @Path("health")
  @Consumes(MediaType.APPLICATION_JSON)
  public Response updateHealth(Health healthUpdate) {
    health = healthUpdate;
    return Response.noContent().build();
  }

  @POST
  @Path("health/{path}")
  public Response newHealth(@PathParam("path") String healthUpdate) {
    if("OK".equals(healthUpdate) || Boolean.parseBoolean(healthUpdate)) {
      health = new Health(true);
    } else {
      health = new Health(false);
    }
    return Response.created(URI.create("/health/" + health.getHealth())).build();
  }
}
