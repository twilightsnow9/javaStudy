package ArrayDemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
     // 静态初始化 数据类型 数组名[] = {元素1,元素2,元素3}
        int a[] = {1,2,3,4,5,6,7};
        a[1] = 100;
        String b[] = {"张三","李四","王五"};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            System.out.println(b[i]);
        }
//        System.out.println(a[0]);
//        /*把数据存储在数组当中*/

    }
}
