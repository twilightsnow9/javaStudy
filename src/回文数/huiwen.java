package 回文数;

public class huiwen {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int num1 = 0;
//    回环数
        while (num > 0) {
//            1.获取该数字的个位
            int ge = num % 10;
//            重新设定未知数
            num /= 10;
//            定义一个变量存放数字
            num1 = num1 * 10 + ge;

        }
        System.out.println(num1);


        if (num1 == temp) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
