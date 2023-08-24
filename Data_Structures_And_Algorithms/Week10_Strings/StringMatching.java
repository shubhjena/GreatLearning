package Week10_Strings;

public class StringMatching {
    public static void main(String[] args) {
        String strMain = "abcdefgh", str = "abnc";
        System.out.println(bruteForceStringMatching(strMain,strMain.length(),str,str.length()));
    }

    private static boolean bruteForceStringMatching(String strMain, int m, String str, int n) {
        for (int i=0;i<m-n;i++){
            int j = 0;
            while(j<n && strMain.charAt(i+j)==str.charAt(j)){
                j++;
            }
            if(j==n) return true;
        }
        return false;
    }

}
