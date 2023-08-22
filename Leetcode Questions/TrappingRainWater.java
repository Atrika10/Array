public class TrappingRainWater {


    // Time & space complexity will be O(n)
    public static int trap(int[] height) {
        int n = height.length;
        // Edge case
        if(n <= 2){
            return 0;
        }

        // leftMax of each bar
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) { // O(n)
            // compare current height with leftMax
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // rightMax of each bar
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];  // last height will be same because I don't have anything in my right side
        for (int i = n-2; i >= 0; i--) {
             // compare current height with rightMax
            rightMax[i] = Math.max(height[i], rightMax[i+1]); 
        }

        int trapwater = 0;
        //run a loop to calcualate my trapwater
        for (int i = 0; i < n; i++) {
            //  I need waterlevel = min of leftMax, rightMax
            int waterlevel = Math.min(leftMax[i], rightMax[i]);   // I've to take min height otherwise it will overflow on the smaller side
            trapwater += (waterlevel - height[i]);  // subtract the bar height from waterlevel
                                                /*  we should multiply the width of each height with  { (waterlevel - height[i]) * width }
                                                * as we have width = 1, that's why we're not multiply for now
                                                 */
        }
        return trapwater;
    }


    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        // int width = 1;
        System.out.println(trap(height));
    }
    
}
