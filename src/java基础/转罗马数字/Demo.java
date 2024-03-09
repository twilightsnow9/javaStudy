package java基础.转罗马数字;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() > 9) {
            System.out.println("您输入的数字长度大于9，不符合规范，请重新输入");
        }
        String[] arr = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (s.charAt(i) == j) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
