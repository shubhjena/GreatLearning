package Week6;

import java.util.Arrays;

public class RotateImage {
    static void rotateImage(int[][] image){ //modifies matrix in place so no return type
        int left=0,right= image.length-1;
        while(left<right){
            for (int i = 0; i < right - left; i++) { //for each roe number of element to be rotated are row length -1
                int top = left, bottom = right;
                //saving the top left element
                int topLeft = image[top][left+i];

                //move bottom left to top left
                image[top][left+i] = image[bottom-i][left];

                //moving bottom right to bottom left
                image[bottom-i][left] = image[bottom][right-i];

                //moving top right to bottom right
                image[bottom][right-i] = image[top+i][right];

                //moving top left to top right
                image[top+i][right] = topLeft;
            }
            left++; right--;
        }
    }

    public static void main(String[] args) {
        int[][] image = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Before Rotation");
        for (int[] ints : image) {
            System.out.println(Arrays.toString(ints));
        }
        rotateImage(image);
        System.out.println("After Rotation");
        for (int[] ints : image) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
