
public class HelloWorld {


    static String hello(String name) {
        if ((name == "") || (name == null)) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }
}
