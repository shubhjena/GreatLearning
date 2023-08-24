package Week6_Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {

    @Test
    void Array2X2() {
        int[][] image = {{1,2},{3,4}};
        int[][] rotatedImage = {{3,1},{4,2}};
        RotateImage.rotateImage(image);
        assertArrayEquals(rotatedImage,image);
    }
    @Test
    void Array3X3() {
        int[][] image = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] rotatedImage = {{7,4,1},{8,5,2},{9,6,3}};
        RotateImage.rotateImage(image);
        assertArrayEquals(rotatedImage,image);
    }
    @Test
    void Array4X4() {
        int[][] image = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] rotatedImage = {{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}};
        RotateImage.rotateImage(image);
        assertArrayEquals(rotatedImage,image);
    }
    @Test
    void voidArray() {
        int[][] image = {};
        int[][] rotatedImage = {};
        RotateImage.rotateImage(image);
        assertArrayEquals(rotatedImage,image);
    }
}