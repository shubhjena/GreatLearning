package Week9_Searching_and_Sorting.DiscussionProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaveArrayTest {

    @Test
    void positiveArray(){
        int[] arr = {6,1,4,5,2,3};
        WaveArray.waveArray(arr);
       assertArrayEquals(new int[] {2,1,4,3,6,5},arr);
    }
    @Test
    void oddNumbers(){
        int[] arr = {6,1,4,5,2,3,7};
        WaveArray.waveArray(arr);
       assertArrayEquals(new int[] {2,1,4,3,6,5,7},arr);
    }
    @Test
    void positiveNegativeArray(){
        int[] arr = {1,2,3,0,-1,-2,-3};
        WaveArray.waveArray(arr);
       assertArrayEquals(new int[] {-2,-3,0,-1,2,1,3},arr);
    }
    @Test
    void oneElement(){
        int[] arr = {-1};
        WaveArray.waveArray(arr);
       assertArrayEquals(new int[] {-1},arr);
    }

}