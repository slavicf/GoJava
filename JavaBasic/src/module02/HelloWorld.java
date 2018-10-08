package module02;

/**
 * Created by Intellij IDEA.
 * User: Jaroslav Frunt
 * Date: 08.10.2018
 */
public class HelloWorld {

    public static void main(String[] args) {
        String s = "Hello World";
        String s0 = "!!!!!!!!!!!!";
        String s1 = s + s0;
        String s2 = s + s1;

        String hello = "Привет мир!";
        String Hello = "ПРИВЕТ МИР";

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        hello(hello);
        String s3 = Hello(Hello, s0);
        System.out.println(s3);
    }

    public static void hello(String s) {
        System.out.println(s);
    }

    public static String Hello(String s, String s1) {
        return s + s1;
    }
}
