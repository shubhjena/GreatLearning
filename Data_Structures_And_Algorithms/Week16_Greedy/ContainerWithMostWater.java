package Week16_Greedy;
//11. Container With Most Water
/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int water = 0;
        while(l<r){
            int curr = Math.min(height[l],height[r])*(r-l);
            water = Math.max(water,curr);
            if(height[l] > height[r]) r--;
            else l++;
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum water that can be stored is: "+maxArea(height));
    }
}
