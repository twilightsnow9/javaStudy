package interfaceDetail;

public class Dog extends Animal implements eat{
//    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
    @Override
    public void swim() {
        System.out.println("游泳");
    }
}
