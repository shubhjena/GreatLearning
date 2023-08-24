package Week11_Hashing_and_Bit_manipulation.Bit_Manipulation;

public class BitManipulation {
    int setBit(int num,int pos){
        int bitMask = 1<<pos;
        num  =num | bitMask;
        return num;
    }
    int clearBit(int num, int pos){
        int bitMask = 1<<pos;
        num = num & (~bitMask);
        return num;
    }
    int updateBit(int num, int pos){
        int bitMask = 1<<pos;
        if((num & bitMask) > 0)
            num = num & (~bitMask);
        else
            num = num | bitMask;
        return num;
    }
    int extractLastSetBit(int num){
        return num & (num-1);
    }

    public static void main(String[] args) {
        BitManipulation obj = new BitManipulation();
        int num = 100, pos = 3;
        System.out.println(obj.setBit(num,pos));
        System.out.println(obj.clearBit(num,pos));
        System.out.println(obj.updateBit(num,pos));
        System.out.println(obj.extractLastSetBit(num));

    }
}
