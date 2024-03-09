package java基础.SimpleFactoryremanber;

public class SoutFactory {
    public static void main(String[] args) {
        Product product = Factory.createFactory("A");
        product.info();

    }
}

//建立一个工厂
class Factory  {
    public static Product createFactory(String type) {
        Product product = null;
        if (type == "A") {
            product = new ProductA();
        } else if(type == "B") {
            product = new ProductA();
        }
        return  product;
    }
}

//定义一个产品的抽象诶
abstract class Product {
    public abstract void info();
}
//继承抽象类
class ProductA extends Product {

    @Override
    public void info() {
        System.out.println("生产产品A");
    }
}

class ProductB extends Product {

    @Override
    public void info() {
        System.out.println("生产产品B");
    }
}
