/**
 * 简单工厂模式
 */

package SimpleFactory;

public class SimpleFactory {
    public static void main(String[] args) {
        Product productA = Factory.createProduct("A");
        productA.info();
        productA.go();
        Product productB = Factory.createProduct("B");
        productB.info();
        Product productC = Factory.createProduct("C");
        productC.info();
    }
}

//定义工厂
class Factory {
    public static Product createProduct(String type) {
        //定义product
        Product product = null;
//        if (name == "A") {
//            product = new ProductA();
//        } else if (name == "B") {
//            product = new ProductB();
//        } else {
//            System.out.println("没有该产品");
//        }
        //用switch实现
        switch (type) {
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            case "C":
                product = new ProductC();
                break;
            default:
                System.out.println("没有"+ type +"产品");
                break;
        }
        return product;
    }
}
//定义抽象方法
abstract class Product {
    public abstract void info();

    public abstract void go();
}

//定义具体产品
class ProductA extends Product {
    //重写
    @Override
    public void info() {
        System.out.println("产品的信息A");
    }

    @Override
    public void go() {
        System.out.println("A出去玩了");
    }
}

class ProductB extends Product {

    @Override
    public void info() {
        System.out.println("产品的信息B");
    }

    @Override
    public void go() {
        System.out.println("B出去玩了");
    }
}

class ProductC extends Product {

    @Override
    public void info() {
        System.out.println("产品的信息C");
    }

    @Override
    public void go() {
        System.out.println("C出去玩了");
    }
}
