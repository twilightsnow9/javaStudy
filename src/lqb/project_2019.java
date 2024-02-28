package lqb;

public class project_2019 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 2019; i++) {
            if (i / 1000 == 2 || i / 100 % 10 == 2 || i / 10 % 10 == 2 || i % 10 == 2 ) {
                System.out.println(i);
                count = count + i;

            } else if (i / 1000 == 1 || i / 100 % 10 == 1 || i / 10 % 10 == 1 || i % 10 == 1) {
                System.out.println(i);
                count = count + i;

            }  else if (i / 100 % 10 == 9 || i / 10 % 10== 9 || i % 10 == 9 ) {
                System.out.println(i);
                count = count + i;

            }  else if (i / 100 % 10 == 0 || i / 10 % 10 == 0 || i % 10 == 0) {
                if (i > 100) {
                    System.out.println(i);
                    count = count + i;

                }

            }
        }

        count = count + 30 + 40 + 50 + 60 + 70 + 80;
        System.out.println(count);
    }
}
