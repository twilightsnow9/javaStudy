package method;

import java.util.Scanner;

public class helloworld {
    // main方法 程序中最小的执行单元
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        方法调用时参数的数量与类型必须与方法定义中的小括号里面的变量一一对应
        System.out.println("请输入长方形的长与宽");
//        int a = input.nextInt(); //定义长方形的长
//        int b = input.nextInt(); //定义长方形的宽
//        调用方法
        int Area1 = getArea(5,4);
        int Areab = getArea(32,22);

        playGame();
        int m = mianji(Area1,Areab);
        System.out.println("a与b之间最大的是"+ m);
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
    };
//    获取面积
    public static int getArea(int a,int b) {
        int Area = (a + b) * 2;
        return Area;
    }
    public static int mianji(int a, int b) {
        if ( a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return 0;
        }
    }

}