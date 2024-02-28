package lqb;

public class test {
//需求：0-100内含0的值
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i / 10 % 10 == 0 || i % 10 == 0) {
                System.out.println(i);
            }
        }
//        int i = 2312;
//        System.out.println(i / 1000 );
//        System.out.println(i / 100 % 10);
//        System.out.println(i / 10 % 10);
//        System.out.println(i % 10 );
    }
}
