public class Dog {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog() {
    }

    public void 看家(){
        System.out.println("狗看家");
    }
    public void eat(){
        System.out.println("狗吃狗粮");
    }
    public void drink(){
        System.out.println("狗喝水");
    }
    public void show(){
        System.out.println(age);
    }
}
