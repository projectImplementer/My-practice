package softvisionProject.framework;

import com.google.errorprone.annotations.Var;

import java.util.HashMap;

public class JavaMap {

     public static HashMap <String, String> getNameEmail() {

        HashMap <String, String> nameEmail = new HashMap <String, String>();
        nameEmail.put("first", "bogdan_bogdan@mail.com");
        nameEmail.put("Second", "adrian_adrian@mail.com");
        nameEmail.put("Three", "java_java@mail.com");

        return nameEmail;
    }

    public static HashMap <Integer, String> getDropList() {

         HashMap <Integer, String> dropList = new HashMap <Integer, String>();
        dropList.put(1, "General");
        dropList.put(2, "Work With Us");
        dropList.put(3, "Business");
        dropList.put(4, "Press");
        dropList.put(5, "Microsoft");

         return dropList;
    }
}
