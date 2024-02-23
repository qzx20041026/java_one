public class shapi extends Dog{
    @Override
    public void eat(){
        super.eat();
        System.out.println("狗吃骨头");
    }
    @Override
    public void show() {
        System.out.println("沙皮狗的岁数"+getAge());
    }
}
