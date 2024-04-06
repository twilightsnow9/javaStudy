package Algorithm.SortCode;

public class BubbleDemo {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13};
        Bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static int[] Bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
