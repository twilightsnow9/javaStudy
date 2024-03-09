package java基础.二维数组test;

public class ARR2 {
    public static void main(String[] args) {
        int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int ji = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(ASum(arr[i]));
            for (int j = 0; j < arr[i].length; j++) {

                ji += arr[i][j];
            }
        }
        System.out.print(ji);
    }
//    定义一个方法计算一维数组的和
    public static int ASum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
