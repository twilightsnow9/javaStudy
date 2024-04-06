package lqb;

public class Age1 {
    public static void main(String[] args) {
        for (int i = 11; i < 100; i++) {
            int m = i;
            String a = (int)Math.pow(m, 3) + "";
            String b = (int)Math.pow(m, 4) + "";

            if (a.length() == 4 && b.length() == 6) {
                if (bi(a,b)) {
                    System.out.println(i);
                }
            }
        }
    }
    public static boolean bi(String a,String b) {
        String c = "";
        String d = "";
//        判断自身是否相同
        int l = 0;
        for (int j = 0; j < a.length(); j++) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(j) != a.charAt(i)) {
                    l++;
                }
            }
        }
        if (l == (a.length() * a.length()) - a.length()) {
            c = a;
        }
        int r = 0;
        for (int k = 0; k < b.length(); k++) {
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(k) != b.charAt(i)) {
                    r++;
                }
            }
        }
        if (r == (b.length()* b.length()) - b.length()) {
            d = b;
        } else {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < c.length(); i++) {
            for (int j = 0; j < d.length(); j++) {
                if (c.charAt(i) != d.charAt(j)) {
                    sum++;
                }
            }
        }
        if (sum == c.length() * d.length()) {
            return true;
        }
        return false;
    }

}
