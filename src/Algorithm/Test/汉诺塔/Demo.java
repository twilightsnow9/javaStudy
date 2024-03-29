package Algorithm.Test.汉诺塔;

public class Demo {
    public static void main(String[] args) {
        han(4,'A','B','C');
    }
//    定义一个方法用来执行圆盘的移动
    public static void han(int n,char a,char b,char c) {
        if (n == 1) {
            System.out.println(a + " ->" + c);
        } else {
            han(n - 1,a,c,b);
            System.out.println(a + " ->" + c);
            han(n - 1,b,c,a);
        }
    }
}
