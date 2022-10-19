package Dhruv_Java;
import java.util.*;
import Dhruv_Java.*;
public class exceptionDemo{
    public static void test(int age) throws UnderAge{ 
        if (age<18) {
            throw new UnderAge(age);
        }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    try{
        test(age);
        System.out.println("Test successfull");
    }
    catch(UnderAge e){ 
        System.out.println(e.getMessage());
        System.out.println("Test unsucessfull");
    }
    finally{ 
        System.out.println("Code ended.");
    }
}
 
}