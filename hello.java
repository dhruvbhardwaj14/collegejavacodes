package Dhruv_Java;
import java.util.*;
public class hello{
    public static void printSquare(int n) {
        String s="";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                s+="* ";
            }
            s+="\n";
        }
        System.out.println(s);
    }
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
ArrayList<Integer> a=new ArrayList<Integer>();
a.add(1);
a.add(2);
System.out.println(a);

}
 
}