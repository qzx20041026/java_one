import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.StringJoiner;

public class hi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student>list=new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            Student s=new Student();
            System.out.println("请输入名字");
            String name=sc.next();
            System.out.println("请输入年龄");
            int age=sc.nextInt();
            s.setAge(age);
            s.setName(name);
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println(stu.getName()+", "+stu.getAge());
        }
    }
}




