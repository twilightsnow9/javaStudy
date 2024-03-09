package StringDeem;

public class StringDemo8 {
    public static void main(String[] args) {
        String a = "abc";
        System.out.println(zuan(a));
    }

    public static String zuan(String a) {
        char[] word = new char[a.length()];
        int j = a.length() -1;
        for (int i = 0; i < a.length(); i++) {
            if (j >= 0) {
                word[j] = a.charAt(i);
                j--;
            }
        }
        String str = new String(word);
        return str;
    }
}
