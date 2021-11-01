import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
    MessageService messageService = new MessageService();
    @GET
    public Response getmessagelist(){
        System.out.println("i am insideeeeeeeeeeeeeeeeeeeeeeeeee");
        return messageService.getMessages();
    }

    @GET
    @Path("/{messageId}")
    public Response getmessage(@PathParam("messageId") Integer messageId){
        return messageService.getMessage(messageId);
    }

    @PUT
    @Path("/{messageId}/{messageContent}")
    public Response updatemessage(@PathParam("messageId") Integer messageId ,
                                  @PathParam("messageContent") String messageContent){
        return messageService.updateMessage(messageId,messageContent);
    }

    @POST
    @Path("/{messagecontent}")
    public Response createmessage(@PathParam("messagecontent") String messagecontent){
        return messageService.createMessage(messagecontent);
    }

    @DELETE
    @Path("/{messageId}")
    public Response deletemessage(@PathParam("messageId") Integer messageId){
        return messageService.deleteMessage(messageId);
    }

    @GET
    @Path("/person")
    public List<person> personList(){
        return Collections.singletonList(new person("raghv",1));
    }

}
