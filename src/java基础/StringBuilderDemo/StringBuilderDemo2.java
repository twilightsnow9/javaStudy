package java基础.StringBuilderDemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        添加支付宝
        sb.append("sss");
        sb.append("bbb");
        sb.append("ccc");
        System.out.println(sb);
//          将StringBuilder转成String
        String a = sb.toString();
        System.out.println(a.length());
    }
}
