package Week11_Hashing_and_Bit_manipulation.Hashing;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        //Boyer–Moore majority vote algorithm
        int major = nums[0];
        int count = 0;
        for(int n:nums){
            if(count==0)
                major = n;
            if(n == major)
                count++;
            else
                count--;
        }
        return major;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println("Majority Element is: "+majorityElement(nums));
    }
}
