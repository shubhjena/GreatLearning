package Week11_Hashing_and_Bit_manipulation.Hashing;

import java.util.HashSet;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> box = new HashSet<>();
        for (int i = 0; i<jewels.length(); i++)
            box.add(jewels.charAt(i));
        int count=0;
        for (int i = 0; i<stones.length(); i++){
            if(box.contains(stones.charAt(i)))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println("The number of jewels among the stones are "+ numJewelsInStones(jewels,stones));
    }
}
