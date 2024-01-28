public class Girl {

    //private私有关键字只能在该类里修改
    private String name;
    private int age;
    private String gender;

    //getName 获得名字
    public void getName(String n){
        name=n;

    }
    //putName 返回名字
    public String putName(){
        return name;
    }
    //getAge 获得年龄
    public void getAge(int a){
        if (a>=10&&a<30)
            age=a;
        else
            System.out.println("非法数据");
    }
    //putAge 返回年龄

    public int putAge(){
        return age;
    }
    //性别
    public void getgender (String a) {
        gender=a;
    }
    public String putgender () {
        return gender;
    }



    public void sleep() {
          System.out.println("女朋友在睡觉");
     }
     public void eat(){
               System.out.println("女朋友在吃饭");
     }
}
