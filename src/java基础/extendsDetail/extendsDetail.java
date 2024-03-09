package java基础.extendsDetail;

public class extendsDetail {
    public static void main(String[] args) {
        // 创建对象并调用方法
        Boou b = new Boou();
        b.eat();
        b.drink();
        b.hehe();
    }

}

abstract class Cat {
//    public cat.eat;
//    public cat.sleep;
    public static void  eat () {
        System.out.println("猫猫要吃饭了");
    }
    public static void  drink () {
        System.out.println("猫猫要喝水了");
    }
    public abstract void hehe();
}

class Boou extends Cat {
    @Override
    public void hehe() {
        System.out.println("猫猫要打豆豆");
    }

    public static void  zhua () {
        System.out.println("抓老鼠");
    }

}
