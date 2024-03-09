package lqb;

public class jifen {
    public static void main(String[] args) {
        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                for (int c = 0; c < 100; c++) {
                    if (8 * a + 6 * b + 4 * c == 600 && a + 3 * b + 4 * c == 280 && a + b + c == 100) {
                        System.out.println(b);
                    }
                }
            }
        }
    }
}
