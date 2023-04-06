package Week11_Hashing_and_Bit_manipulation.Bit_Manipulation;

public class FindPosOfSetBit {
    static int findPosition(int N) {
        if(N==0) return -1;
        int count = 0;
        int temp = N;
        //to check is there are more than 1 set bit
        while(temp!=0){
            temp = temp & (temp-1);
            count++;
            if(count>1) return -1;
        }
        //calculates the position of the set bit from LSB
        return (int)(Math.log(N)/Math.log(2))+1;
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println("Position of set bit = "+ findPosition(num));
    }
}
