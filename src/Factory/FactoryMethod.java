package Factory;

public class FactoryMethod {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        // 父类 对象名 = new 子类名();
        Product productA = factoryA.createProduct();
        productA.info();

        Factory factoryB = new FactoryB();

        Product productB = factoryB.createProduct();
        productB.info();
    }
}

//定义工厂
interface Factory {
    public Product createProduct();
}

//实现接口
class FactoryA implements Factory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

class FactoryB implements Factory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}

// ## 第一步
interface Product {
    public void info();
}

class ProductA implements Product {

    @Override
    public void info() {
        System.out.println("ProductA");
    }
}

class ProductB implements Product {

    @Override
    public void info() {
        System.out.println("ProductB");
    }
}