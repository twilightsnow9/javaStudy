package java基础.OOP;

public class projectText {
    public static void main(String[] args) {
        // 创建手机的对象
        Phone p = new Phone("你好",100);
        p.setBrand("iphone");
        p.setPrice(111);
        System.out.println(p.getBrand());;
        System.out.println(p.getPrice());;
        p.call();
        p.playGames();
        Phone c = new Phone();
        c.setPrice(12);
    }
}
