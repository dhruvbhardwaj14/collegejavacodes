package Dhruv_Java;
import java.util.*;
import java.io.*;
import java.io.File;
public class pracseven{
public static void main(String[] args) {
    //reading file
    try{
    File readfile=new File("Dhruv_Java/test1.txt");
    Scanner sc=new Scanner(readfile);
    while (sc.hasNextLine()) {
        String text=sc.nextLine();
        if (text.substring(0, 2)=="\\"+"\\") {
            System.out.println(text);
        }
    }
} catch (FileNotFoundException e) {
    System.out.println("Unable to Find the file");
}
}
}
