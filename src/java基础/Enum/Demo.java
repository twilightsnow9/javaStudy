package java基础.Enum;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.WINTER);
    }
}
//自定义枚举
class Season {
    //将构造器私有化防止直接new
//    2.去掉set相关方法，防止属性被修改
//    在类的内部创建固定对象
//    可以加入final修饰
    private String name;
    private String desc;//描述

    public final static Season SPRING = new Season("春天","温暖");
    public final static Season WINTER = new Season("冬天","冷");
    public final static Season AUTUMN = new Season("秋天","炎热");
    public final static Season SUMMER = new Season("夏天","制热");

    public Season() {
    }
//枚举
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

}

