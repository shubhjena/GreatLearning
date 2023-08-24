package Week9_Searching_and_Sorting.DiscussionProblems;
//output array shall mae a wave of-ve +ve numbers excess numbers to be added to back

import java.util.Arrays;

public class WaveArrayII {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3,-1,-2,-3};
        waveArrayII(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void waveArrayII(int[] arr){
        int station = 0;
        boolean flag = false;
        while (station< arr.length-1) { //outer loop to check if each element is at correct place; if not find correct element
            if (station%2 == 0 && arr[station] > 0)
            {
                for (int finder = station+1; finder <= arr.length; finder++) { //finder loop to find the correct element current station
                    if (finder== arr.length) flag=true;
                    else if (arr[finder]<0) {
                        shift(arr, station++, finder); //shift the element to station without disturbing order of elements
                        break;
                    }
                }
                //repeat same for the even places
            } else if (station%2 == 1 && arr[station] < 0) {
                for (int finder = station+1; finder <= arr.length; finder++) {
                    if (finder== arr.length) flag=true;
                    else if (arr[finder]>0) {
                        shift(arr, station++, finder);
                        break;
                    }
                }
            }
            if (flag) break;
            station++;
        }
    }
    //to shift elements without disturbing order
    private static void shift(int[] arr, int station, int finder) {
        int store = arr[finder];
        while (finder!=station){
            arr[finder] = arr[finder-1];
            finder--;
        }
        arr[station] = store;
    }

}
