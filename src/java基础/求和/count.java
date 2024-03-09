package java基础.求和;

public class count {
    public static void main(String[] args) {
//        int num = 0;
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) {
//                num += i;
//            }
//
//        }
//        System.out.println(num);

//        珠穆拉玛峰折纸
//       折叠次数
        int i = 0;
        double paper = 0.1;
        while ( paper <= 8844430) {
            paper = paper * 2;
            i++;
        }
        System.out.println(i);
    }
}
