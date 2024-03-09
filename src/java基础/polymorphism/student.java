package java基础.polymorphism;

public class student extends Person {
    @Override
    public void show(){
        System.out.println("学生的信息为:" + getName() + getAge());
    }
}
