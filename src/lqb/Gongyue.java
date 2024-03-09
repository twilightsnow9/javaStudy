package lqb;

public class Gongyue {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 2020; i++) {
            if (2020 % i == 0 && 3030 % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
