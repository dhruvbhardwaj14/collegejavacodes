package Dhruv_Java;
import java.util.*;
public class theory{
    public static void segment(String p1,String p2){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the password: ");
        String s=sc.next();
        System.out.println();
        while (true) {
            if (s.compareTo(p1)==0 || s.compareTo(p2)==0) {
                System.out.println("WELCOME USER");
                break;
            }
            System.out.print("Enter the password: ");
            s=sc.next();
            System.out.println();
        }

    }
    public static void main(String[] args) {
    String p1,p2;
    p1="abcd@123";
    p2="efgh@123";
    segment(p1, p2);
}
 
}
