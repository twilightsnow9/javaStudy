package Algorithm.Test.约瑟夫环;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo3  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> coll = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            coll.add(i);
        }

        for (int i = 0; i < coll.size(); i++) {
            if (k == coll.get(i)) {
                coll.remove(i);
                for (int j = 0; j < coll.size(); j++) {
                    if (coll.size() == 1) {
                        System.out.println(coll.get(j));
                    } else {
                        remove(coll, k);
                    }
                }
            }
        }
    }

    public static void remove(ArrayList<Integer> coll, int k) {
        for (int i = 0; i < coll.size(); i++) {
            if (k == i) {
                coll.remove(i);
            }
        }
    }
}
