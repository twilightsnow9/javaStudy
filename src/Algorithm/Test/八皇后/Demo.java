package Algorithm.Test.八皇后;

public class Demo {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];
        queen(arr,1,1);
    }
//一个8*8的二维数组
//    前后的点不能出现横竖斜连起来
    public static boolean queen(int[][] arr,int i,int j) {
        if (arr[7][j] == 1) {
            return true;
        }
        if (arr[i][j] != arr[i + 1][j]) {
            arr[i][j] = 1;
            if (queen(arr,i + 1,j)) {
                System.out.println(i + " " + j);
            } else if (queen(arr,i + 1,j - 1)) {
                System.out.println(i + " " + j);
                return true;
            } else if (queen(arr,i + 1,j + 1)) {
                System.out.println(i + " " + j);
                return true;
            } else if (queen(arr,i - 1,j)) {
                System.out.println(i + " " + j);
                return true;
            } else if (queen(arr,i - 1,j - 1)) {
                System.out.println(i + " " + j);
                return true;
            } else if (queen(arr,i - 1,j + 1)) {
                System.out.println(i + " " + j);
                return true;
            } else {
                return false;
            }
        } else {
            return false;

        }
        return false;
    }
}
