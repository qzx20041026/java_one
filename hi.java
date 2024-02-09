import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
import java.util.StringJoiner;

public class hi {
    public static void main(String[] age) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String str;
        while (true) {
            System.out.println("输入数字");
            str = sc.next();
            boolean flag = TF(str);
            if (flag) {
                break;
            } else{
            System.out.println("数据错误");
                continue;
            }
        }
            for (int i = 0; i < str.length(); i++) {
                int c=str.charAt(i)-48;
                String x=LuoMa(c);
                sb.append(x);
            }
        System.out.println(sb);
    }
    public static boolean TF(String str){
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if (c<'0'||c>'9') {
                return false;
            }
        }
        return true;
    }
    public static String LuoMa(int c){
        String[]arr={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[c];
    }
}




