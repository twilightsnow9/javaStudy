package java基础.StringDeem;

public class arr {
    public static void main(String[] args) {
        int[] arr = {2,0,6,1,77,0,52,0,25,7};
        int j = 0;
        int[] newArr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                newArr[j] = arr[i];
                j++;
            }
        }
        for (int m = 0; m < newArr.length; m++) {
            System.out.println(newArr[m]);
        }
    }
}
