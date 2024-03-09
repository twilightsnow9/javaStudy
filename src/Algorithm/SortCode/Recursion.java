package Algorithm.SortCode;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(method(100));
    }
//    书写递归的核心
    /*
        1.找出口：方法在什么时候不再调用
        2.找规则：如何把大问题变成规模较小的问题
     */

    public static int method(int sum) {
        if (sum ==1){}
        return 1;
    }

}
