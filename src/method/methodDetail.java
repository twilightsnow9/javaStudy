package method;
//方法重载
public class methodDetail {
//    在同一个类中定义了多个同名方法,这些同名方法具有相同的功能
//    方法名相同形参不同
//    public static void heihei(int a,double m) {
//
//    }
//    public static void heihei(int b) {
//
//    }
//    public static void heihei(int a,int b) {
//
//    }
    public static void main(String[] args) {
        num(3,10);
        num(1,3);
    }

    public static void num( byte a,byte b ) {
        if (a == b) {
            System.out.println("相同");
        }
    }

    public static void num( byte a,int b ) {
        if (a == b) {
            System.out.println("相同");
        }
    }

    public static void num( byte a,short b) {
        if (a == b) {
            System.out.println("相同");
        }
    }

    public static void num( int a,int b) {
        if (a == b) {
            System.out.println("相同");
        }
    }
}
