package Week10_Strings;

public class RabinKarpAlgorithm {
    public static void main(String[] args) {
        String str = "abcabcabcdefgh";
        String pat = "abcf";
        int res = robinKarpSearch(str,pat);
        if (res != -1) System.out.println("Pattern found at index "+res);
        else System.out.println("Pattern not found!");
    }

    private static int robinKarpSearch(String str, String pat) {
        if (str ==null || str.equals("")|| str.length()<pat.length()) return -1;
        int patternVal=0, textVal=0;
        int n = pat.length()-1;
        // to be completed
        return -1;
    }
}
