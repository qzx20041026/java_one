import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.StringJoiner;

public class hi {
    public static void main(String[] args) {

        ArrayList<Student>list=new ArrayList();
        Student ss1=new Student(20,"zhangsan","01","sanghai");
        Student ss2=new Student(19,"lishi","02","sanghai");
        Student ss3=new Student(52,"wangwu","05","sanghai");
        list.add(ss1);
        list.add(ss2);
        list.add(ss3);
        int max=StudentUilt.测试(list);
        System.out.println(max);
    }
}



