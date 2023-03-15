package Week12_Stacks_and_Queues.Practice_Problems;
//1209. Remove All Adjacent Duplicates in String II
/*
You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and
equal letters from s and removing them, causing the left and the right side of the deleted substring
to concatenate together.
We repeatedly make k duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It is guaranteed that the
answer is unique.
 */
public class RemoveAllAdjacentDuplicatesInStringII {
    public String removeDuplicates(String s, int k) {
        char[] stk = new char[s.length()];
        int top = -1;
        char temp;
        char[] arr = s.toCharArray();
        for(int i=0; i<s.length();i++){
            if (top>-1 && arr[i] == stk[top]){
                int matchCount = 0;
                temp = arr[i];
                //count the matching element in the character array
                while(i<s.length() && arr[i] == stk[top]){
                    matchCount++;
                    i++;
                } i--;
                //count the matching elements in stack
                while(top>-1 && temp == stk[top]){
                    stk[top--]=' ';
                    matchCount++;
                }
                //add back elements more than k to the stack
                for(int j = 0; j < matchCount%k;j++)
                    stk[++top] = temp;
            }
            //adding non matching elements to stack
            else stk[++top] = arr[i];
        }
        return String.valueOf(stk).trim();
    }
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInStringII obj = new RemoveAllAdjacentDuplicatesInStringII();
        String str = "deeedbbcccbdaa";
        int k= 3;
        System.out.println("Input String: "+str);
        System.out.println("Output String: "+obj.removeDuplicates(str,k));
    }
}
