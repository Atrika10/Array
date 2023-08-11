import java.util.*;
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){
        HashSet<Integer> hm = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hm.add(nums[i]);
        }
        int uni = hm.size();
        return uni;
        
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    
}
