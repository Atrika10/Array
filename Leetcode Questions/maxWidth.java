// This is GFG POTD(21-12-2023)
import java.util.*;

public class maxWidth {
    public static int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;
        // step - 1 sort on the basis of x axis
        Arrays.sort(points, Comparator.comparingDouble(o -> o[0])); //on the basis of 0th column
        // step - 2 comparison
        for (int i = 0; i < points.length-1; i++) {
            int diff =Math.abs(points[i][0] - points[i+1][0]) ; 
            if(max < diff){
                max = diff;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][] = {{3,1},{9,0},{1,0},{1,4},{5,3}, {8,8}};
        System.out.println(maxWidthOfVerticalArea(arr));;
    }
}
