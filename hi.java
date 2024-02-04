import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class hi {
    public static void main(String[] age) {
       Scanner sc=new Scanner(System.in);
        int x;
        while (true) {
            System.out.println("输入数字");
            x=sc.nextInt();
            if(x>=0&&x<=9999999){
            break;
            }
            else{
                System.out.println("输入错误，请重新输入");
            }
        }
            //变成中文.
            String str="";
            while (x!=0){
            int i=x%10;
            String cr=big(i);
            str=cr+str;
            x/=10;
                }
            //补零
            int n=str.length();
        for ( ; n< 7; n++) {
            str="零"+str;
        }
        String putst="";
        //获得单位
        for (int i = 0; i < str.length(); i++) {
            String[]arr={"佰","拾","万","仟","佰","拾","元"};
            char c=str.charAt(i);
            putst=putst+c+arr[i];
        }
        System.out.println(putst);
        }

        public static String big(int i){
            String[]arr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[i];
        }
    }




