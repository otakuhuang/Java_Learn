import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

import java.net.*;

public class Test {

    String name;

    public static void main(String[] args) {

        Test[] t = new Test[3];
        int z = 0;

        while (z < 3) {
            t[z] = new Test();
            t[z].name = "bilbo";
            if (z == 1) {
                t[z].name = "frodo";
            }
            if (z == 2) {
                t[z].name = "sam";
            }
            System.out.print(t[z].name + " is a ");
            System.out.println("good Hobbit name");
            z = z + 1;
        }
    }
}
