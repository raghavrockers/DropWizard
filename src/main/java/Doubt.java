import com.google.common.collect.ImmutableList;
import java.util.*;

public class Doubt {
    public static void main(String[] args) {
        List<String> old = new ArrayList<String>();
        old.add("raghav");
        old.add("biyani");
        List<String> st= ImmutableList.copyOf(old);
        System.out.println(st);
        //st.add("sdds");
        old.add("werew");
    }
}
