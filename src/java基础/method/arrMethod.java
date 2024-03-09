package java基础.method;

public class arrMethod {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5};
//        printArray(arr);
//        System.out.println("abc"); //先打印再换行
//        System.out.print("abc"); //只打印不换行
//        System.out.println(); //不打印任何数据只换行
        int[] ints = copyOfRange(arr, 1, 4);
        System.out.println(copyOfRange(arr,2,4));
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    //    遍历数组的方法
    //    我要干嘛 :遍历数组
    //    我需要什么才能完成 : 定义好的数组
    //    调用后的方法是否要继续使用

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            System.out.print(arr[i]);
            System.out.print("], ");
        }
    }
//    我要什么 : java基础.复制数组
//    我需要什么才能完成 : int[] arr,int from,int to
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int newarr[] = new int[to - from];
//        遍历原数组
//        伪造索引
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i >= from && i < to) {
                newarr[index] = arr[i];
                index++;
            }

        }
        return newarr;
//        声明一个新数组
    }
}
