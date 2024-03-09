package StringDeem;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("hehe");
        String s2 = "heHe";
        System.out.println(s1 == s2);
//        全部相等，字符串比较
        System.out.println(s1.equals(s2));
//        忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
