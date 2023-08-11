package Backend_Week2.javaio;

import java.io.*;
import java.util.Scanner;

public class BufferedIOExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file;
        try{
            System.out.println("Enter the input file address:");
            file= sc.nextLine();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("Enter the output file address:");
            file= sc.nextLine();
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
