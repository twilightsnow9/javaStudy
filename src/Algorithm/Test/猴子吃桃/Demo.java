package Algorithm.Test.猴子吃桃;

public class Demo {
    public static void main(String[] args) {
        System.out.println(fn(1));
    }

    public static int fn(int num) {
//        求第一天的桃子数
        int a = 0;
        if (num == 10) {
            return 1;
        } else {
//            要求第一天的桃子数需要下一天的桃子数 + 1 / 2
            a = (fn(num + 1) + 1 ) * 2;
        }
        return a;
    }
}
