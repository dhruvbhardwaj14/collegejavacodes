package Dhruv_Java;
import java.util.*;
import java.io.*;
import java.io.File;
public class pracsix{
public static void main(String[] args) {
    //give reading file first and writing file after that
//Creating a textfile from command line
// File writingfile=new File(args[1]);
// try {
//     writingfile.createNewFile();
// } catch (IOException e) {
//     System.out.println("Unable to create a file");
// }
//reading the first file and writing to second
try {
    //creating a file writer
    FileWriter wfWriter=new FileWriter(args[1]);
    //reading first file
    File readfile=new File(args[0]);
    Scanner sc=new Scanner(readfile);
    while (sc.hasNextLine()) {
        String contentOfFile=sc.nextLine();
        //writing to the file
        wfWriter.write(contentOfFile);
        // System.out.println(contentOfFile);
    }
    wfWriter.close();
} catch (FileNotFoundException e) {
    System.out.println("Unable to Find the file");
}
catch (IOException e) {
    System.out.println("Unable to write to the file");
}
}
}