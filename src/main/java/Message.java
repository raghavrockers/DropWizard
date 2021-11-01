import java.util.List;
import java.util.Map;

public class Message {
    private int id;
    private String content;

    public Message(){

    }
    public Message(int id, String content){
       this.id = id;
       this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
