package Week10_Strings;

public class ReverseWordsInString {
    static String reverseWords(String sentence){
        if(sentence == null) return null;
        String[] words = sentence.split("\\s+");
        int l=0, r=words.length-1;
        while(l<r){
            swap(words,l,r);
            l++;
            r--;
        }
        return String.join(" ",words).trim();
    }
    static void swap(String[] words, int l, int r){
        String temp = words[l];
        words[l] = words[r];
        words[r] = temp;
    }

    public static void main(String[] args) {
        String sentence = " This is    a sample    sentence ";
        System.out.println(reverseWords(sentence));
    }
}
