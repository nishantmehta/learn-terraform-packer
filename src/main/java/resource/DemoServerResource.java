package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;

@Path("/api/")
public class DemoServerResource {
    @GET
    @Path("/time/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTime() {
        LocalDateTime time = LocalDateTime.now();
        return Response.ok().entity(time.toString()).build();
    }
}
