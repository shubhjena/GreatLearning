package Week10_Strings;

public class KMPAlgorithm {
    public static int KMPSearch(String str, String pat){
        int m = pat.length();
        int n = str.length();
        int[] lps = new int[m];
        int i=0, j=0; //i for str & j for pat
        computeLPSArray(pat,m,lps);
        while(i<n){
            if(str.charAt(i)== pat.charAt(j)){
                i++;
                j++;
                if (j==m)
                    return (i-j); //pattern found
            }
            else{
                if (j>0)
                    j = lps[j-1]; //mismatch moving to previous matched index
                else i++; //mismatch & no previous match
            }
        }
        return -1;
    }
    static void computeLPSArray(String pat,int m, int[] lps){
        int i = 1, j=0;
        lps[0] = 0;
        while(i<m){
            if (pat.charAt(i)==pat.charAt(j)){
                lps[i] = j+1;
                i++;
                j++;
            }
            else{
                if (j>0)
                    j = lps[j-1];
                else
                    lps[i++] = 0;
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcabcabcdefgh";
        String pat = "abcf";
        int res = KMPSearch(str,pat);
        if (res != -1) System.out.println("Pattern found at index "+res);
        else System.out.println("Pattern not found!");
    }
}
