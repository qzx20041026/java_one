import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class hi  {
    public static void main(String[] args) {
        int i=add(1,5);
        int z=add(1,2,3);
        double n=add(1.1,1.1);
        System.out.println(i);
        System.out.println(z);
        System.out.println(n);
    }
    //java中方法名可以相同，但需要参数的类型，参数个数存在差异
    public static int add(int x,int y){
        return x+y;
    }
    //参数个数差异
      public static int add(int x,int y,int z){
        return x+y+z;
      }
      //参数类型差异
      public static double add(double x,double y){
        return x+y;
      }
}


