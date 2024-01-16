import java.util.Scanner;
public class hi  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt(),j;
        for(j=0;j<3;j++)
        {
            System.out.print(i%10);
            System.out.println('\t');
            i/=10;
        }

    }
}
