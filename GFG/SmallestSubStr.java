// GFG problem of the day 03-01-2024
// problem link :  https://www.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1
import java.util.*;
public class SmallestSubStr {

    public static int smallestSubstring(String S) {
        // edge case
        if(S.length() < 3){
            return -1;      
        }
        int min = Integer.MAX_VALUE; // track for final result
        int i=0;        // starting index
        int j=2;        // ending index

        while(j< S.length()){
            int zero = 0;   // declare 3 variable to track the count of each variable
            int one = 0;
            int two = 0;

            for(int k=i; k<=j; k++){    // looping in range (i to j)
                if(S.charAt(k) == '0'){
                    zero++;
                }else if(S.charAt(k) == '1'){
                    one++;
                }else {
                    two++;
                }
            }

            if(zero >0 && one >0 && two >0 && i <j){    // found 3 value atleast once
                // update min
                min = Math.min(min, j-i+1); 
                i++;

            }else if(j < S.length()){      //if any of the value is still zero tahole j++ korbo
                j++;
                
            }else{
                return -1;
            }
        }
        return min!=Integer.MAX_VALUE?min:-1;
    }
    public static void main(String[] args) {
        String str = "1002110";
        System.out.println(smallestSubstring(str));
    }
}
