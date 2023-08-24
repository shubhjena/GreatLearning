package Week12_Stacks_and_Queues.Practice_Problems;
//1700. Number of Students Unable to Eat Lunch
/*
The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively.
 All students stand in a queue. Each student either prefers square or circular sandwiches.

The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack.
At each step:
If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
Otherwise, they will leave it and go to the queue's end.
This continues until none of the queue students want to take the top sandwich and are thus unable to eat.

You are given two integer arrays students and sandwiches where sandwiches[i] is the type of the
ith sandwich in the stack (i = 0 is the top of the stack) and students[j] is the preference of the jth student
in the initial queue (j = 0 is the front of the queue). Return the number of students that are unable to eat.
 */
import java.util.*;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        //to simulate the act of moving back in line
        Queue<Integer> q = new LinkedList<>();
        for(int s: students) q.offer(s);

        //top for the current sandwich
        //flag to indicate that no one wants the top sandwich
        int top = 0, flag = 0;

        //while students are in queue
        while(!q.isEmpty()){

            //if desired sandwich is at top
            if(sandwiches[top] == q.peek()){

                q.poll(); //student leaves the queue

                top++; //next sandwich
                flag=0;
            }
            //if desired sandwich not at top
            else {
                //student moves to back of the queue
                q.offer(q.poll());

                //keeps track of students who rejected the current top sandwich
                flag++;

                //if all remaining students have rejected then break
                if(q.size()<flag) break;
            }
        }
        return q.size(); //return the remaining number of students
    }

    public static void main(String[] args) {
        NumberOfStudentsUnableToEatLunch obj = new NumberOfStudentsUnableToEatLunch();
        int[] students = new int[]{1,1,0,0};
        int[] sandwiches = new int[]{0,1,0,1};
        System.out.println(obj.countStudents(students, sandwiches));
    }
}
