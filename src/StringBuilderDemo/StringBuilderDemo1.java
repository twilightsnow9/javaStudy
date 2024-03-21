package StringBuilderDemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("toubi");
//        添加方法
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
//        反转方法
        sb.reverse();
        System.out.println(sb);
//          获取长度
        System.out.println(sb.length());
    }
}
