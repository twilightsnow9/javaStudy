package java基础.StringDeem;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        请输入密码

        String s2 = "123456";
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            if (s1.equals(s2)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登录失败，请重试");
            }
        }

    }
}
