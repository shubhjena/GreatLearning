package Week9_Searching_and_Sorting.DiscussionProblems;


import java.util.Arrays;

public class TeamEqualSkill {
    public static void main(String[] args) {
        int[] skill = {1,2,3,4};
        System.out.println("Team Chemistry:"+divideSkill(skill));
    }
    public static int divideSkill(int[]skill){
        Arrays.sort(skill);
        int size = skill.length;
        int res=0;
        int sum = skill[0]+skill[size-1];
        for (int i = 0; i < skill.length/2; i++) {
            if (skill[i]+skill[size-1-i] !=sum ) return -1;
            res += skill[i]*skill[size-1-i];
        }
        return res;
    }
}
