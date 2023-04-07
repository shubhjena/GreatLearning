package Week11_Hashing_and_Bit_manipulation.Hashing;
//953. Verifying an Alien Dictionary
/*
In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order.
The order of the alphabet is some permutation of lowercase letters.
Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only
if the given words are sorted lexicographically in this alien language.
 */
import java.util.HashMap;
public class VerifyingAlienDictionary {
    public static boolean isAlienSorted(String[] words, String order) {
        if(words.length == 1) return true;
        HashMap<Character, Integer> dict = new HashMap<>();
        for(int i = 0; i<order.length(); i++){
            dict.put(order.charAt(i),i);
        }
        for(int i = 1; i< words.length; i++){
            int l=0;
            while(l<words[i-1].length() && l<words[i].length()){
                if(words[i-1].charAt(l) == words[i].charAt(l))
                    l++;
                else if(dict.get(words[i].charAt(l))-dict.get(words[i-1].charAt(l)) < 0)
                    return false;
                else break;
            }
            if(l == words[i].length() && l < words[i-1].length()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        String[] words = new String[]{"word","world","row"};
        System.out.println(isAlienSorted(words,order));
    }
}
