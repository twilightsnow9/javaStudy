package java基础.switchDemo;
// import java.lang.Math;

public class switch1 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 10) + 1;
        System.out.println(num);
        switch (num) {
            case 1:
                System.out.println("一等奖");
                break;
            case 2:
                System.out.println("二等奖");
                break;
            case 3:
                System.out.println("三等奖");
                break;
            default:
                System.out.println("没拿奖");
                break;
        }
    }
}
