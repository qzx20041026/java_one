import java.util.ArrayList;

public class StudentUilt {
    private StudentUilt() {}
    public static  int 测试(ArrayList<Student>list){
         int max=list.get(0).getAge();
        for (int i = 1; i < list.size() ; i++) {
            int x=list.get(i).getAge();
            max=max>x?max:x;
        }
        return max;
    }
}
