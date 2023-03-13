package Week12_Stacks_and_Queues.Practice_Problems;
//387. First Unique Character in a String
/*
Given a string s, find the first non-repeating character in it and return its index.
If it does not exist, return -1.
 */
public class FirstUniqueCharacterInString {
    public int firstUniqueChar(String s) {
        //to get the count of each character in the String
        int[] count = new int[26];
        char[] sArr = s.toCharArray();
        for(char ch : sArr){
            count[ch - 'a']++;
        }
        //if the character appears only once then return index value
        for(int i=0; i< sArr.length; i++){
            if (count[sArr[i]-'a']==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInString obj = new FirstUniqueCharacterInString();
        String str= "loveleetcode";
        System.out.println(obj.firstUniqueChar(str));
    }
}