package lqb;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class Pj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println(biji(text));
    }

    public static int biji(String text) {
        int count = 0;
        for (int i = 0; i + 1 < text.length(); ) {
            if (text.charAt(i) == '?' || text.charAt(i + 1) == '?') {
                count++;
                i += 2;
                continue;
            }
            if (text.charAt(i) == text.charAt(i + 1)) {
                count++;
                i += 2;
                continue;
            }
            i++;
        }
        return count;
    }
}
