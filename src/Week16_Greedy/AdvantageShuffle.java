package Week16_Greedy;

import java.util.Arrays;

public class AdvantageShuffle {
    public static int[] advantageCount(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int[] indArr = new int[len];
        for(int i=0; i<len; i++){
            indArr[i] = i;
        }
        Arrays.sort(nums1);

        //sorting nums 2 and indArr according to nums2
        for (int i = 1; i <= len-1; i++) {
            for (int j = 0; j <= len-1-i; j++) { //compares adjacent pairs for smaller number
                if(nums2[j]>nums2[j+1]){
                    swap(nums2,j,j+1);
                    swap(indArr,j,j+1);
                }
            }
        }

        int[] num1Ind = new int[len];
        int ptr=0, ptr2 = len-1;
        for(int i = 0; i<len; i++){
            if(nums1[i] > nums2[ptr]){
                num1Ind[ptr] = nums1[i];
                ptr++;
            }
            else{
                num1Ind[ptr2] = nums1[i];
                ptr2--;
            }
        }
        int[] res = new int[len];
        for(int i = 0; i<len; i++){
            res[indArr[i]] = num1Ind[i];
        }
        return res;
    }

    private static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2,7,11,15};
        int[] nums2 = new int[]{1,10,4,11};
        System.out.println(Arrays.toString(advantageCount(nums1, nums2)));
    }
}
