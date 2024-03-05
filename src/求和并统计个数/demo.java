package 求和并统计个数;

public class demo {
    public static void main(String[] args) {
//        生成10个10-100的随机数存入数组，统计有多少个数据比随机数小
//        random()：随机产生一个数 random()，随机数范围为 0.0 =< Math.random < 1.0
        System.out.println((int)(Math.random()*100) + 1);
        int num[] = new int[10];
        int sum = 0;
        int num1 = (int)(Math.random()*100);
        for (int i = 0; i < 10; i++) {
            num[i] = (int)((Math.random()*100) + 1);
        }
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double avg = sum / num.length;
        System.out.println(avg);
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < avg ) {
                n++;
            }
        }
        System.out.println(n);
    }
}
