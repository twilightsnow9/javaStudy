package Algorithm.Test.迷宫;

public class MiGong {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++) {
            arr[0][i] = 1;
            arr[arr.length - 1][i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[i][arr.length - 1] = 1;
        }
        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[2][2] = 1;//测试回溯
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println("===============");
        To v = new To();
        v.mouse(arr,1,1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//定义一个类用于操作小人
class To {
//    定义一个规则如果为0就是没有经过的
//    public boolean mouse(int[][] arr,int i, int j) //用于确定迷宫的路径
//    如果找到返回true 没有返回false
//    如果为1就是不能通过
//    如果为2就是正常的点
//    如果为3就是已经走过的点
    public boolean mouse(int[][] arr,int i, int j) {
        if (arr[6][6] == 2) { // 说明已经到达
            return true;
        } else {
            if (arr[i][j] == 0) { // 当这个位置是0是说明这个点可以走
                arr[i][j] = 2;
//            查询找路策略下-右-上-左
                if (mouse(arr,i + 1,j)) {
//                    arr[i + 1][j];
                    return true;
                } else if (mouse(arr,i,j + 1)) {
                    return true;
                } else if (mouse(arr, i - 1, j)) {
                    return true;
                } else if (mouse(arr, i , j - 1)) {
                    return true;
                } else {
                    arr[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }

    }
}
