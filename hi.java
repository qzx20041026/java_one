import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class hi {
    public static void main(String[] age) {
        //字符串的比较
        String a="abc";
        String b=new String("abc");

        System.out.println(a==b);
        boolean d=a.equals(b);
        System.out.println(d);
        //equals不无视大小，equalsIgnoreCase无视大小
        String c="Abc";
        boolean e=a.equalsIgnoreCase(c);

        System.out.println(e);
    }
}
