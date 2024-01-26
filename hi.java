import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class hi  {
    public static void  main(String[]age){
        //产生随机球  红球1~33号  蓝球1~16号
        int arr[]=qiu();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
       int[] arr1=buy();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]+" ");
        }
        int i=0,j=0,k=0,z=0;
        for (i=0;i<arr.length-1;i++) {
            for (j=0;j<arr1.length-1;j++)
                if(arr[i]==arr1[j]){
                    k++;
                    break;//找到了就下一组
                }
        }
        if(arr[arr.length-1]==arr1[arr1.length-1])
            z++;
        if(k==6&&z==1)
            System.out.println("恭喜你，获得1000万");
        else if (k==6&&z==0)
            System.out.println("恭喜你，获得500万");
        else if (k==5&&z==1)
            System.out.println("恭喜你，获得3000元");
        else if ((k==4&&z==1)||(k==5&&z==0))
            System.out.println("恭喜你，获得200元");
        else if ((k==4&&z==0)||(k==3&&z==1))
            System.out.println("恭喜你，获得10元");
        else if ((k==2&&z==1)||(k==1&&z==1)||(k==0&&z==1))
            System.out.println("恭喜你，获得5元");


    }


    //选择输入球
    public static int[]buy(){
        Scanner n=new Scanner(System.in);
        int arr[]=new int[7];
        //红球
        for (int i = 0; i < arr.length-1 ; ) {
            System.out.print("请输入当前要买"+(i+1)+"个的球号");
            int x=n.nextInt();
            if(x>=1&&x<=33){
                boolean flag=TF(arr,x);
                if(!flag){
                    arr[i]=x;
                    i++;
                }
                else
                    System.out.println("已存在请重新输入");
            }
            else
                System.out.println("已超出范围请重新输入");

        }
        //蓝球
        while(true){
            System.out.println("请输入您要购买蓝球号");
            int y=n.nextInt();
            if(y>=1&&y<=16){
                arr[arr.length-1]=y;
                break;
            }
            else
                System.out.println("已超出范围请重新输入");
        }
        return arr;
    }







    //获取球
  public static int[] qiu(){
        int arr[]=new int[7];
        Random r=new Random();
      for (int i = 0; i <arr.length-1 ; i++) {
          int n=r.nextInt(33)+1;
          boolean flag=TF(arr,n);
          if(!flag)
              arr[i]=n;
      }
       int i=r.nextInt(16)+1;
      arr[arr.length-1]=i;
        return arr;
  }



  //判断
public static boolean TF(int[]arr,int n) {
    for (int i = 0; i < arr.length - 1; i++)
        if (n == arr[i])
            return true;
    return false;
}
}
