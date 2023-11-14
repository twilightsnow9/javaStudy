package method;

import java.util.Scanner;

public class helloworld {
    // main方法 程序中最小的执行单元
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        方法调用时参数的数量与类型必须与方法定义中的小括号里面的变量一一对应
        int a = input.nextInt();
        int b = input.nextInt();
//        调用方法
        playGame();
        playGame();
        playGame();
        gfInfo();
        sum(a,b);
    }
    // 方法的定义
    public static void playGame() {
        System.out.println("选角色");
        System.out.println("准备开局");
        System.out.println("开始战斗");
        System.out.println("崩盘");
        System.out.println("=====================================");
    };
    //
    public static void gfInfo () {
        System.out.println("小慧慧");
        System.out.println("80");
        System.out.println("萌妹子");
    }
    public static void sum(int a,int b) {
        System.out.println("a + b =" + (a+b));
    }

}