// Leetcode Problem of the day 03/01/2024
// Link of the problem :https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/?envType=daily-question&envId=2024-01-03

import java.util.*;
public class LaserBeam {

    // Time Complexity => O(m*n);  where m = row & n = column of the matrix
    // Space Complexity => O(1); As we haven't took any extra space
    public static int numberOfBeams(String[] bank) {
        int ans = 0;    // track  answer
        int prev =0;    // previous row te kota 1 chilo
        int count =0;   // track count of each row
        
        for (int i = 0; i < bank.length; i++) {
            if (count != 0) {   // if count comes zero we will not update prev variable
                prev = count; // 2
            }

            count =0;
            for (int j = 0; j < bank[0].length(); j++) {
                // count number of 1
                if(bank[i].charAt(j) == '1'){
                    count++;
                }
            }
            // count = 1,prev =2
            // update ans
            if(i != 0){     //we will not update ans for first row
                ans += prev*count;
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String bank[] = {"0101", "0000","0111","1001"};
        System.out.println(numberOfBeams(bank));
    }
}
