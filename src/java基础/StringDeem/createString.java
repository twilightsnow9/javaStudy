package java基础.StringDeem;

public class createString {
    public static void main(String[] args) {
//        创建字符串
        String strn = "hello";
        String hello = new String("hello");
        System.out.println(strn == hello);
        boolean equals = strn.equals(hello);
        System.out.println(equals);
        System.out.println(strn);

//        创建字符串的时候传递一个字符数组
        char[] cha = {'1','2','3','4'};
        String str = new String(cha);

        System.out.println(str);

//        传递字节数组
        byte[] bytes = {97,98,99,100};
        String str1 = new String(bytes);
        System.out.println(str1);
    }

}
