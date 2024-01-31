import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class hi {
    public static void main(String[] age) {
        Scanner sc=new Scanner(System.in);
        Car[]arr=new Car[3];
        for (int i = 0; i <arr.length; i++) {
            Car c=new Car();
            System.out.println("请输入车的品牌名");
            String brand=sc.next();
            c.setBrand(brand);
            System.out.println("请输入车的价格");
            int price=sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入车的颜色");
            String color=sc.next();
            c.setColor(color);
            arr[i]=c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car c=arr[i];
            System.out.println(c.getBrand()+","+c.getPrice()+","+c.getColor());
        }


    }
}
