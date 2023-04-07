package Week5_Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static int step=0; //step count variable

    public static void main(String[] args) { //UI
        Scanner sc = new Scanner(System.in);
        System.out.println("Tower of Hanoi Solver");
        char source='A',destination='B',assistant='C';
        System.out.print("Enter the number of rings:");
        int num = sc.nextInt();
        System.out.print("Move the disks in following order:");
        towerOfHanoi(source,destination,assistant,num);
    }
    //tower of hanoi - step generator
    public static void towerOfHanoi(char source, char destination, char assistant, int numberOfRings){
        if(numberOfRings !=0){
            towerOfHanoi(source,assistant,destination,numberOfRings-1);
            System.out.printf("\nStep %d: Disk %d from tower %c to tower %c",++step,numberOfRings,source,destination);
            towerOfHanoi(assistant,destination,source,numberOfRings-1);
        }
    }
}
