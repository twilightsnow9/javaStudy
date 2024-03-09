package java基础.abstractDetail;

public class abstractDetail {
    public static void main(String[] args) {
        ConcreteClass C = new ConcreteClass();
        C.fn();
        C.fu();
    }
}

//定义一个抽象类
abstract class AbstractClass {
    public void fu(){
        System.out.println("fu");
    }
    public abstract void fn();
}

class ConcreteClass extends AbstractClass{
    @Override
    public void fn(){
        System.out.println("这里是fn");
    }
}