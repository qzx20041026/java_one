import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class hi {
    public static void main(String[] age) {
        Girl girl1 = new Girl();
        girl1.getName("杭杭");
        girl1.getAge(18);
        girl1.getgender("女");
        System.out.println(girl1.putName());
        System.out.println(girl1.putAge());
        System.out.println(girl1.putgender());
        girl1.eat();
        girl1.sleep();


    }
}
