package tcs.com;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//@Path here Identifies the URI path that a resource class will serve requests for.
@Path("PostExampleService")
public class PostExampleService {
    //To process HTTP POST requests.
    @POST
    // To identifies the URI path that a resource class method will serve requests for.
    @Path("/empInfo")
    //@Produces here defines the media type(s) that the methods of a resource class can produce.
    @Produces(MediaType.TEXT_HTML)
    //@FormParam is to retrieve the Form parameter.
    public String getEmpInfo(@FormParam("name") String name, @FormParam("age") String age) {
        return name + " and " + age;
    }
}
