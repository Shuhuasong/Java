package test;

import java.util.Arrays;

public class SplitNumString {
    public static void main(String[] args) {
        String str = "11 22 33 44 55 66";
        String[] strs = str.split(" ");
        int[] nums = new int[strs.length];
        for(int i=0; i<strs.length; i++){
            nums[i] = Integer.parseInt(strs[i]);
        }

        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for(int a : nums){
            sb.append(a + " ");
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
