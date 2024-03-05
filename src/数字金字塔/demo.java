package 数字金字塔;

public class demo {
    public static void main(String[] args) {
        int[][] arr = new int[20][20];
//        1.建立一个三角形
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    arr[i][j] = 1;
                }
                if (i > 0 && j > 0) {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
//               arr[i + 1][j + 1] = arr[i][j] + arr[i + 1][j];

               if (i == j) {
                   arr[i][j] = 1;
               }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
