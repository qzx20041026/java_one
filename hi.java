import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class hi  {
    public static void  main(String[]age){
        Girl girl1=new Girl();
        girl1.name="萌萌";
        girl1.age=18;
        girl1.gender="萌妹子";
        System.out.println(girl1.name);
        System.out.println(girl1.age);
        System.out.println(girl1.gender);
        girl1.eat();
        girl1.sleep();




        Girl girl2=new Girl();
        girl2.name="lisa";
        girl2.age=20;
        girl2.gender="御姐";
        System.out.println(girl2.name);
        System.out.println(girl2.age);
        System.out.println(girl2.gender);
        girl1.eat();
        girl1.sleep();
    }
}
