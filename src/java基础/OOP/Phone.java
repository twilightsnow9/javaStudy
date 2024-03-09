package java基础.OOP;

public class Phone {
    // 属性
    private String brand;
    private double price;

//    构造方法(构造器)
//    无参数
    public Phone() {
        System.out.println("构造器");
    }
//    带参数
    public Phone (String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

//    set方法:给成员变量赋值
    public void setBrand(String brand) {
//    brand 局部变量表示测试类中调用方法传递过来的数据
//        this.brand 表示属性位置的name
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // get方法:获取成员变量的值
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    // 方法
    public void call() {
        System.out.println("打电话");
    }

    public void playGames() {
        System.out.println("玩游戏");
    }

}
