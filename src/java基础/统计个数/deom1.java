package java基础.统计个数;

public class deom1 {
    //统计能被3整除的数字有多少个
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
                sum++;
            }
        }
        System.out.println(sum);
    }
}
