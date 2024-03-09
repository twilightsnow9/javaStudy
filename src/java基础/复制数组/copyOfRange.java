package java基础.复制数组;

public class copyOfRange {
    public static void main(String[] args) {
        int[] arr = {1,2,34,4,66,33};
        int[] a = copyOfRange(arr,3,5);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to-from];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= from && i < to) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }

}
