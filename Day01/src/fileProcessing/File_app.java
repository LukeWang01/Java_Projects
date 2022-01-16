package fileProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_app {
    public static void main(String[] args) throws FileNotFoundException {
        // option 1: throw the exception
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some Text Here: ");
        String inputtedText = input.nextLine();
        System.out.println("This is the output: " + inputtedText);


        try {
            File file = new File("src/fileProcessing/test.txt");  // IO file path should from the src root
            Scanner input1 = new Scanner(file);
            while (input1.hasNextLine()) {
                String line = input1.nextLine();
                System.out.println(line);
                input1.close();
            }
        } catch (FileNotFoundException e){
            // option 2: catch the exception
            // e.printStackTrace();
            // or just print error:
            System.out.println("file not found");
        }

        try {
            System.out.println(numberOperation(15));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int numberOperation(int number) throws Exception {
        if (number < 10){
            throw new Exception("number input is too small");
        }
        return number -10;
    }
}
