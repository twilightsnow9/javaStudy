package BuilderModel;


import java.util.ArrayList;
import java.util.List;

//public class main {
////    public static void main(String[] args) {
////        Director director = new Director();
////        Builder builder = new ConcreteBuilder1();
////        director.Construct();
////        Product product = director.getResult();
////    }
//}

class Director {
    Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void Construct(){
        builder.BuildPart();
    }
    public Product getResult(){
        return builder.getResult();
    }
}


abstract class Builder {
    public abstract void BuildPart();
    public abstract Product getResult();
}

class ConcreteBuilder extends Builder {
    Product product = new Product();
    @Override
    public void BuildPart() {
        product.Add("PartA");
        product.Add("PartB");
        product.Add("PartC");
    }
    @Override
    public Product getResult() {
        return product;
    }
}

class Product {
    List<String> parts = new ArrayList<String>();

    public void Add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品的组成");
        for (String part : parts)
            System.out.println(part + " ");
        System.out.println("\n");
    }
}
