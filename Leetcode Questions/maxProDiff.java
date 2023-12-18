// This is leetcode POTD(18-12-2023)
// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description/?envType=daily-question&envId=2023-12-18

import java.util.*;
public class maxProDiff{

    public static int  maxProductDifference(int[] nums) {
        int n = nums.length;
        //Can't choose 4 distinct indices
        if(n < 4){
            return -1;
        }
        // sort in decending order
        Arrays.sort(nums);
        // pick 4 distinct indices
        int diff =Math.abs ((nums[0]*nums[1] ) - (nums[n-2]*nums[n-1]));
        return diff;
    }

    public static void main(String args[]){
        int nums[] = {5,7,6,4,2};
        System.out.println("Maximum product Difference : " + maxProductDifference(nums));
    }
}