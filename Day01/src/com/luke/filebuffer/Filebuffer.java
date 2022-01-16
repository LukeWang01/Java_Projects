package com.luke.filebuffer;

import java.io.*;

public class Filebuffer {

    public static void main(String[] args) {

        // import file
        File file = new File("src/com/luke/filebuffer/fileBufferTest.txt"); //file path should be from content

        // introduce buffer area and file reader tool
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Reading file error: " + file.getName() + "\n" + "File Path: " + file.getPath());
        }

        // finally can be replaced by the try( resource )  with an autocloseable method
//        finally {
//            try {
//                assert bufferedReader != null;
//
//
//
//            } catch (IOException e) {
//                //e.printStackTrace();
//                System.out.println("unable to close file" + file.getName());
//            }
        // catch (NullPointerException ex) {
        //    System.out.println("File was not opened.");
        //}
        }
    }


