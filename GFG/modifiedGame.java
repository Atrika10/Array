// This is GFG POTD(20-12-2023)
import java.util.*;
public class modifiedGame {

    // Time Complexity => O(n) (for loop), n is the length of the array
   public static int findWinner(int n, int A[]){
        int xor = 0; // taking a variable to store the result of xor operation
        for (int i : A) {
            xor ^= i; 
        }
        if (xor == 0) {
            return 1; // p1 is the winner
        }
        // if the size of the array is odd then p2 will win

        if(n % 2 != 0){
            return 2;
        }else{
            return 1;   // if size is even then p1 will win, as p1 start first
        }
    
    }
    public static void main(String[] args) {
        int A[] = {3,3,2};
        int n = 3;
        System.out.println(findWinner(n, A));
    }
}
