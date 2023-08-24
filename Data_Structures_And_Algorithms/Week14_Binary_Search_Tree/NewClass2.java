package Week14_Binary_Search_Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewClass2 {

    public static List<int[]> sumPair(int[] nums){
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i <nums.length; i++){
            if (nums[i]+nums[i-1] == 0){
                list.add(new int[]{nums[i-1],nums[i]});
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[]  nums = new int[]{4, -6, 3, -1, 4, 2, 7};
        List<int[]> list1 = new ArrayList<>();
        list1 = sumPair(nums);
        if (list1.isEmpty()) System.out.println("No pairs Exist");
        for (int[] arr: list1){
            System.out.println(Arrays.toString(arr));
        }
    }
}
