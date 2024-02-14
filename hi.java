import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.StringJoiner;

public class hi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> studentlist=new ArrayList<>();
        look : while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请选择");
            String a=sc.next();
           switch (a) {
                case"1"->{
                    System.out.println("1.添加学生");
                    studentlist=addStuent(studentlist);
                }
                case"2"->{
                    System.out.println("2.删除学生");
                    System.out.println("请输入需要删除的学生id");
                    String id=sc.next();
                    deleteStudent(studentlist,id);
                }
                case"3"->{
                    System.out.println("3.修改学生");
                    System.out.println("请输入需要修改的学生id");
                    String id=sc.next();
                    updatStuednt(studentlist,id);
                }
                case"4"->{
                    System.out.println("4.查询学生");
                    queryStudent(studentlist);
                }
                case"5"->{
                    System.out.println("5.退出");
                        break look;
                }
                default -> {
                    System.out.println("没有这个选项");
                }
            }
        }
    }

    //添加学生
    public static ArrayList<Student> addStuent(ArrayList<Student>Studentlist){
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入名字");
        s.setName(sc.next());
        System.out.println("请输入年龄");
        s.setAge(sc.nextInt());
        while (true) {
            System.out.println("请输入id");
            String id= sc.next();
            boolean flag=TF(Studentlist,id);
            if (flag){
                System.out.println("已存在id");
            }
            else {
                s.setId(id);
                break;
            }
        }
        System.out.println("请输入住址");
        s.setAddress(sc.next());
        Studentlist.add(s);
        return Studentlist;
    }


    //删除学生
    public static void deleteStudent(ArrayList<Student>Studentlist,String id) {
        int i=id_sub(Studentlist,id);
            if(i>=0)
                Studentlist.remove(i);
            else
                System.out.println("不存在该学生");

        }



    //修改学生
    public static void updatStuednt(ArrayList<Student>Studentlist,String id){
        int i=id_sub(Studentlist,id);
            if (i>=0) {
                Scanner sc=new Scanner(System.in);
                Student s = Studentlist.get(i);
                System.out.println("请输入名字");
                s.setName(sc.next());
                System.out.println("请输入年龄");
                s.setAge(sc.nextInt());
                System.out.println("请输入id");
                s.setId(sc.next());
                System.out.println("请输入住址");
                s.setAddress(sc.next());
        }
            else
                System.out.println("不存在该学生");
    }
    //查询学生
    public static void queryStudent(ArrayList<Student>Studentlist){
        for (int i = 0; i < Studentlist.size(); i++) {
            Student s=Studentlist.get(i);
            System.out.println("姓名： "+s.getName()+"  年龄： "+s.getId()+"  id：  "+s.getAge()+"  住址：  "+s.getAddress());
        }
    }

//判断该学生是否存在
    public static boolean TF(ArrayList<Student>list,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id))
                return true;
        }
        return false;
    }
    //返回该id的学生下标
    public static int id_sub(ArrayList<Student>list,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id))
                return i;
        }
        return -1;
    }
}


