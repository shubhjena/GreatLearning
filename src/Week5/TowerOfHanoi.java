package Week5;

import java.util.Scanner;

public class TowerOfHanoi {
    public static int step=0; //step count variable

    public static void main(String[] args) { //UI
        Scanner sc = new Scanner(System.in);
        System.out.println("Tower of Hanoi Solver");
        char source='A',destination='B',assistant='C';
        System.out.print("Enter the number of rings:");
        int num = sc.nextInt();
        System.out.print("Follow the following steps:\nMove a ring:");
        towerOfHanoi(source,destination,assistant,num);
    }
    //tower of hanoi solving step generator
    public static void towerOfHanoi(char source, char destination, char assistant, int numberOfRings){

        if(numberOfRings ==1){
            System.out.printf("\n%d. From tower %c to tower %c",++step,source,destination);
        }
        else {
            towerOfHanoi(source,assistant,destination,numberOfRings-1);
            towerOfHanoi(source,destination,assistant,1);
            towerOfHanoi(assistant,destination,source,numberOfRings-1);
        }
    }
}
