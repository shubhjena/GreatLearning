package Week8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    Sort obj = new BubbleSort();
//    Sort obj = new InsertionSort();
//    Sort obj = new SelectionSort();
    @Test
    void nullArray() {
        assertArrayEquals(new int[] {},obj.sort(new int[]{}));
    }
    @Test
    void oneElement(){
        assertArrayEquals(new int[] {1},obj.sort(new int[]{1}));
    }
    @Test
    void case1(){
        assertArrayEquals(new int[] {3,6,8,9},obj.sort(new int[]{9,6,3,8}));
    }
    @Test
    void negativeNumbers(){
        assertArrayEquals(new int[] {-5,-3,-1},obj.sort(new int[]{-1,-5,-3}));
    }
    @Test
    void negativeAndPositiveNumbers(){
        assertArrayEquals(new int[] {-5,-3,-1,0,5,6,8,9},obj.sort(new int[]{0,-1,-5,-3,8,5,6,9}));
    }
}