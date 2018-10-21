import org.junit.jupiter.api.Test;
import sun.tools.java.SyntaxError;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    @Test
    public void listExample(){
        List<String> names = new ArrayList<String>();
        names.add("Ksenija");
        names.add("Viktorija");
        names.add("Ieva");

        //can choose amount of elements to check/use
        for (int i = 0; i < names.size(); i++) {


        System.out.println(names.isEmpty());
        System.out.println(names.size());
        System.out.println(names.get(i));

        }

        //only for all list
        for (String name : names) {
            System.out.println("Blame " + name);
        }

    }
}
