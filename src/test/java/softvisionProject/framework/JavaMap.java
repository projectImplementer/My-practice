package softvisionProject.framework;

import com.google.errorprone.annotations.Var;

import java.util.HashMap;

public class JavaMap {

     public static HashMap<String, String> getNameEmail() {

        HashMap<String, String> nameEmail = new java.util.HashMap<String, String>();
        nameEmail.put("first", "bogdan_bogdan@mail.com");
        nameEmail.put("Second", "adrian_adrian@mail.com");
        nameEmail.put("Three", "java_java@mail.com");

        return nameEmail;
    }
}
