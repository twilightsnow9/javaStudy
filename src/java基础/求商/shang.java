package java基础.求商;

public class shang {
    public static void main(String[] args) {
        int num1 = 300;
        int num2 = 30;
        int i = 0;
        for ( ; i < num1; i++) {
            num1 = num1 - num2;
            if (num1 <= num2) {
                System.out.println(num1);
                System.out.println(i);
                break;
            }
        }

    }
}
