import java.util.ArrayList;
import java.util.List;

public class Response {

    private ArrayList<Message> data;
    private String resp;

    public Response(){

    }

    public Response makeData(ArrayList<Message> data, String resp){
            this.data = data;
            this.resp = resp;
            return this;
    }

    public List<Message> getData() {
        return data;
    }

    public void setData(ArrayList<Message> data) {
        this.data = data;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

}
