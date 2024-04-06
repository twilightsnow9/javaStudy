package Algorithm.DataStructur.Group.DFS;

public class Suger {
    static int sum = 0;
    public static void main(String[] args) {
        dfs(1,9,16);
        System.out.println(sum);
    }

    public static void dfs(int num,int a, int b) {
//        如果给七个孩子分完糖果就退出函数
        if (num >= 8) {
            if (a == 0 && b == 0 ) {
                sum++;
            }
            return;
        }
//        开始分糖果
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
//                只有满足2-5的条件才可以算作一种
                if (i + j >= 2 && i + j <= 5) {
                    dfs(num + 1, a - i,b - j);
                }
            }
        }
    }

}
