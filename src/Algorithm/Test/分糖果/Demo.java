package Algorithm.Test.分糖果;

public class Demo {
    static int sum = 0;
    public static void main(String[] args) {
        dfs(1, 9, 16);
        System.out.println(sum);
    }
    static void dfs(int x,int a,int b) {
        if (x == 8) {
            if (a == 0 && b == 0) {
                sum++;
            }
            return;
        }

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (i + j >=2 && i + j <=5) {
                    dfs(x + 1, a - i, b - j);
                }
            }
        }
    }
 }