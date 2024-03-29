package Algorithm.Test.迷宫;

public class Demo {
    public static void main(String[] args) {
//        1.d定义一个迷宫
//        1代表墙体
        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[i][7] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[0][i] = 1;
            arr[7][i] = 1;
        }
        arr[3][1] = 1;
        arr[3][2] = 1;
//        arr[3][2] = 1;
        Mig(arr,1,1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//    迷宫问题
//    i,j 代表起始坐标
//    如果这个点的数字变成2代表可以走
//    数字变成3代表走过但是死路
    public static boolean Mig(int[][] arr,int i,int j) {
        if (arr[6][6] == 2) {//末尾点变成2的时候证明是代码执行成功
            return true;
        } else {
            if (arr[i][j] == 0) {
                arr[i][j] = 2;
                if (Mig(arr,i + 1,j)) {//向下走
                    return true;
                } else if (Mig(arr,i,j + 1)) {//右
                    return true;
                } else if (Mig(arr,i - 1,j)) {
                    return true;
                } else if (Mig(arr, i, j - 1)) {
                    return true;
                } else {
                    arr[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }

}
