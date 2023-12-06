package OOP;

public class Fighting {
    private String name;
    private int blood;

    public Fighting(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Fighting() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

//    定义一个方法用于攻击别人
//    方法的调用者去攻击参数
}
