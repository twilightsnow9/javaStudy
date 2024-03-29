package java基础.Enum;

public class Demo2 {
//    使用Enum关键字
    public static void main(String[] args) {

    }
}

enum Season2 {
    SPRING("春天","温暖"),
    WINTER("冬天","冷"),
    AUTUMN("秋天","炎热"),
    SUMMER("夏天","制热");
    private String name;
    private String desc;//描述

    Season2() {
    }

    private Season2(String name, String desc) {
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
