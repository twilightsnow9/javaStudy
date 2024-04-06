package lqb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        solution.frequencySort(nums);

    }
    public int[] frequencySort(int[] nums) {
//        寻找有多少个不同的值 1代表他本身
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
//        先循环找出每个数字对应有多少个
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int a : list) {
            int l = 0;
            for (int i = 0; i < nums.length; i++) {
                if (a == nums[i]) {
                    l++;
                }
            }
            System.out.println(a + " " + l);
            list1.add(a);
            list1.add(l);
        }
        System.out.println(list1);
        return null;

    }
}
