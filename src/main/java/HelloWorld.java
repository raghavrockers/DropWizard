import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("hello")
public class HelloWorld
{
    //“http://localhost:8080/RestfulExample/rest/hello/JavaInterviewPoint/999/22”
    //Username : JavaInterviewPoint ID : 999 Age : 22
    @GET
    @Path("{username}/{id}/{age}")
    public Response getUserDetails(
            @PathParam("username")String name,
            @PathParam("id")int id,
            @PathParam("age")int age)
    {
        return Response.status(200).
                entity("Username : "+name+" ID : "+id+" Age : "+age).build();
    }
}

@Path("/QueryParamExample")
class QueryParam_Example
{
    //http://localhost:8080/RESTful_Example/rest/QueryParamExample?parameter1=”Java”&parameter2=”Interview”&parameter2=”Point”
    //Parameter1 :"Java" Parameter2 : ["Interview", "Point"]
    @GET
    public Response getQueryParameters(
            @QueryParam("parameter1")String parameter1,
            @QueryParam("parameter2") List<String> parameter2)
    {
        String output = "Parameter1 :"+parameter1+" Parameter2 : "+parameter2.toString();
        return Response.status(200).entity(output).build();
    }
}