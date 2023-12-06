package OOP;

public class role {
    public static void main(String[] args) {
        Fighting A = new Fighting();
        A.setName("乔峰");
        A.setBlood(100);
        Fighting B = new Fighting();
        B.setName("徐志摩");
        B.setBlood(300);
//        存储剩余血量
        int fig;
        int booldyu;

            if(A.getBlood() > B.getBlood()) {
                fig = A.getBlood() - B.getBlood();
                System.out.println(A.getName() + "打了" + B.getName() + "造成了" + fig + "点伤害");
            } else if (A.getBlood() < B.getBlood()) {
                fig = B.getBlood() - A.getBlood();
                System.out.println(B.getName()  + "打了" + A.getName() + "造成了" + fig + "点伤害");
            }
        }

//    }
}
