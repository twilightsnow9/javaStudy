package interfaceDetail;

public class Wawa extends Animal implements eat{
//    @Override
    public void eat() {
        System.out.println("吃虫子");
    }
    @Override
    public void swim() {
        System.out.println("游泳");
    }
}
