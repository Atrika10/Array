// This is leetcode POTD(20-12-2023)
import java.util.*;

public class chocolates{

    // Time Complexity => O(logn) ; n is the length of the array
    public static int buyChoco(int[] prices, int money) {
        int m = money;
        // step -1 sort arrays in accending order as we have to minimize the sum of 2 choco
        Arrays.sort(prices);
        // step - 2 
        int count = 2, i=0;
        int itr =0;        // number of iteration, it should 2
        while(count > 0){
            if(prices[i] <= m){
                m = m - prices[i];
                itr++;
            }
            count--; i++;
        }
        // if it is negative after buying 2 choco, that means we should return original value
        if(m < 0 || itr < 2){
            return money;
        }
        return m;
    }

    public static void main(String[] args) {
        int price[] = {3,2,3};
        int money = 3;
        System.out.println("leftover : " + buyChoco(price, money));
    }
}