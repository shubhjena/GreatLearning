package Week10_Strings;

public class IsAnagram {
    static boolean isAnagram(String str1, String str2){
        int[] count = new int[26];
        if (str1.length()!=str2.length()) return false;
        for (char s: str1.toCharArray())
            count[Character.toLowerCase(s) -'a']++;
        for (char s: str2.toCharArray())
            count[Character.toLowerCase(s) -'a']--;
        for (int i : count)
            if (i!=0) return false;
        return true;
    }

    public static void main(String[] args) {
        String str1 = "Demo";
        String str2 = "Mode";
        if (isAnagram(str1,str2)) System.out.println("The given strings are anagrams.");
        else System.out.println("The given strings are not anagrams of each other.");
    }
}
