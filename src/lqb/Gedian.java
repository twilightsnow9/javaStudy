package lqb;

public class Gedian {
    public static void main(String[] args) {
//        x * y <= 2021;
        int i = 1;
        int count = 0;
//        while (true) {
            for (int j = 1; j < 2021/i; i++,j++ ) {
                if (2021 % i== 0) {
                    count++;
                }
            }
            i++;
//        }
        System.out.println(count);
    }
}
