import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class hi {
    public static void main(String[] age) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //reverse反转
        String a = new StringBuilder().append(str).reverse().toString();
        boolean flag=str.equals(a);
        if (flag)
            System.out.println("是对称字符串");
        else System.out.println("不是");
    }
}




