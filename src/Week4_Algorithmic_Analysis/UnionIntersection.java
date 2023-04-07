package Week4_Algorithmic_Analysis;

import java.util.Arrays;
/*
Given two sorted arrays, find their union and intersection.
 */
public class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        union(arr1, arr2);
        intersection(arr1, arr2);
    }
    static void union(int[] arr1, int[] arr2){
        System.out.print("UNION\n{");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if (arr2[j]<arr1[i]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;j++;
            }
        }
        if (i<arr1.length){
            while (i<arr1.length) {
                System.out.print(arr1[i]+" ");
                i++;
            }
        }
        else
            while (j<arr2.length){
                System.out.print(arr2[j]+" ");
                j++;
            }
        System.out.println("}");
    }
    static void intersection(int[] arr1, int[] arr2){
        System.out.print("INTERSECTION\n{");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j])
                i++;
            else if (arr2[j]<arr1[i])
                j++;
            else {
                System.out.print(arr1[i] + " ");
                i++;j++;
            }
        }
        System.out.println("}");
    }
}
