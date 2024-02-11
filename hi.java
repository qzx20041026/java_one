import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.StringJoiner;

public class hi {
    public static void main(String[] age) {
        ArrayList<String>list=new ArrayList<>();
        //添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //删除元素
        /*boolean result1=list.remove("aaa");
        System.out.println(result1);*/


        /*String str=list.remove(2);
        System.out.println(str);*/

        //修改元素 返回被修改元素
        /*String str=list.set(1,"ddd");
        System.out.println(str);*/


        //查询元素    size返回长度
        /*String s=list.get(0);
        System.out.println(s);*/
        for (int i = 0; i < list.size(); i++) {
            String a=list.get(i);
            System.out.println(a);
        }

    }
}




