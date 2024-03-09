package Algorithm.Search;

import java.util.ArrayList;

public class BasicSearchDemo {
    public static void main(String[] args) {
        int[] arr = {131,127,147,81,103,23,7,79,81,81};
        ArrayList<Integer> list1 = basicSearch(arr,81);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
    }
    public static ArrayList<Integer> basicSearch(int[] arr,int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                list.add(i);
            }
        }
        return list;
    }
}
