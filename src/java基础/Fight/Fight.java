package java基础.Fight;

public class Fight {

//    确定游戏角色的姓名，血量，都不相同，在选定人物的时候。这些信息就应该被确定下来
    private String name;
    private int blood;

    public Fight() {
    }

    public Fight(String name, int blood) {
        this.name = name;
        this.blood = blood;
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
    @Override
    public String toString() {
        return "fight{" +
                "name='" + name + '\'' +
                ", blood=" + blood +
                '}';
    }

//    public static int attack(int a,int b) {
//        System.out.println("");
//    }
}
