package java基础.yanghui;

public class YangHui {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                arr[0][0] = 1;
                if (j == 0) {
                    arr[i][j] = 1;
                }
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
//                System.out.print(arr[i][j] + " ");
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
//            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.println(arr[i][i1]);
            }
        }
    }
}
