// package Dhruv_Java;
// import java.util.*;
// import java.io.File;
// import java.io.*;
// public class filehandling{
// public static void main(String[] args) {

//     //creating a file
//     File file=new File("Dhruv_Java/test1.txt");//path name
//     try {
//         file.createNewFile();
//     } catch (IOException e) {
//         System.out.println("Unable to create a file");
//     }
 

//     //writing to a file
//     try {
//         FileWriter fileWriter=new FileWriter("Dhruv_Java/test1.txt");//filename 
//         fileWriter.write("Hello guys how are you\n what are you doing now?");
//         fileWriter.close(); 
//     } catch (IOException e) {
//         System.out.println("Unable to write to the file");
//     }

//     //reading a file
//     File myfile=new File("Dhruv_Java/test1.txt");//path name
//     try {
//         Scanner sc=new Scanner(myfile);
//         while (sc.hasNextLine()) {
//             String line=sc.nextLine();
//             System.out.println(line);
//         }
//     } catch (FileNotFoundException e) {
//         System.out.println("File not found");
//     }
    
   
// }
 
// }

package Dhruv_Java;
import java.util.*;
import java.io.File;
import java.io.*;
public class filehandling{
public static void main(String[] args) {

    //creating a file
    File file=new File("Dhruv_Java/test1.txt");//path name
    try {
        file.createNewFile();
    } catch (IOException e) {
        System.out.println("Unable to create a file");
    }
 

    //writing to a file
    try {
        FileWriter fileWriter=new FileWriter("Dhruv_Java/test1.txt");//filename 
        fileWriter.write("Hello guys how are you\n what are you doing now?");
        fileWriter.close(); 
    } catch (IOException e) {
        System.out.println("Unable to write to the file");
    }
// java execep myfile.txt yourfile.txt 
    //reading a file
    File myfile=new File(args[0]);//path name
    try {
        FileWriter writefile=new FileWriter(args[1]);
        Scanner sc=new Scanner(myfile);
        String line="";
        while (sc.hasNextLine()) {
            line+=sc.nextLine();
            // System.out.println(line);
            // writefile.write(line);
            // writefile.close();
        }
        String toadd="";
        for (int i = 0; i < line.length(); i++) {
            if (line.toLowerCase().charAt(i)=='a' || line.toLowerCase().charAt(i)=='e'||line.toLowerCase().charAt(i)=='i'||line.toLowerCase().charAt(i)=='o'||line.toLowerCase().charAt(i)=='u' ) {
                continue;
            }
            else{
                toadd+=line.charAt(i);
                writefile.write(toadd);
                writefile.close();
            }
        }

    } catch (FileNotFoundException e) {
        System.out.println("File not found");
    }
    catch(IOException e){
        System.out.println("File cannot be written");
    }
    
   
}
 
}