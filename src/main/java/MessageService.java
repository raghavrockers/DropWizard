import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {

    public Map<Integer,Message> mp = (new Database()).sending();

    public MessageService(){
     mp.put(1,new Message(1,"this is my first message"));
     mp.put(2,new Message(2,"this is my second message"));
     mp.put(3,new Message(3,"this is my third message"));
    }

    public Response getMessages(){
        return new Response().makeData(new ArrayList<Message>(mp.values()),"Found");
    }

    public Response getMessage(Integer id){
        ArrayList<Message> re = new ArrayList<Message>();
        if(id>mp.size() || id<=0)
            return new Response().makeData(re,"Not Found");
        re.add(mp.get(id));
        return new Response().makeData(re,"Found");
    }

    public Response updateMessage(Integer id, String content){
        ArrayList<Message> re = new ArrayList<Message>();
        mp.put(id,new Message(id,content));
        return new Response().makeData(re,"Updated");
    }

    public Response deleteMessage(Integer id){
        ArrayList<Message> re = new ArrayList<Message>();
        if(id>mp.size() || id<=0)
            return new Response().makeData(re,"Not Found");
        mp.remove(id);
        return new Response().makeData(re,"Deleted");
    }

    public Response createMessage(String content){
        ArrayList<Message> re = new ArrayList<Message>();
        Integer newSize = mp.size()+1;
        mp.put(newSize,new Message(newSize,content));
        return new Response().makeData(re,"Created");
    }
}
