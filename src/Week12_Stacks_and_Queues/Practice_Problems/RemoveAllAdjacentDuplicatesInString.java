package Week12_Stacks_and_Queues.Practice_Problems;
//1047. Remove All Adjacent Duplicates In String
/*
You are given a string s consisting of lowercase English letters.
A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.
Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
 */
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        char[] stk = new char[s.length()];
        int top = -1;
        char[] arr = s.toCharArray();
        for(int i=0; i<s.length();i++){
            if (top>-1 && arr[i] == stk[top])
                stk[top--]=' ';
            else stk[++top] = arr[i];
        }
        return String.valueOf(stk).trim();
    }

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString obj = new RemoveAllAdjacentDuplicatesInString();
        String str = "abbacdefgghi";
        System.out.println("Input String: "+str);
        System.out.println("Output String: "+obj.removeDuplicates(str));
    }
}
