import java.util.*;
public class MaxConsecutiveOnes{

    /*  Time complexity will be O(n)
     where n is the length of the input array nums 
     space complexity will be O(1)  = >  This is because we are using a constant amount of extra space to store the max and count variables, regardless of the size of the input array. we are not using any additional data structures here*/
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i< nums.length; i++){
            int count =0;
            int j =i;

            while (j<nums.length && nums[j] != 0) {
                count++;
                j++;
            }

            if(max <= count){
                max = count;
            }
            
        }
        return max;
    }

    public static int findMaxConsecutiveOnes_optimal(int[] nums){
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            }else{
                count = 0;
            }
        }
        return max;
        
    }

    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes_optimal(nums));
    }
} 