package Dhruv_Java.P2;
import java.util.*;
import Dhruv_Java.P1.*;
public class Rectangle extends shape{
    private int length;
    private int breadth;
    public Rectangle(){};
    public Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public void display(){ 
        System.out.println("Length:"+length+"Breadth:"+breadth);
    }
    public void area(){ 
        System.out.println("Area is:"+(length*breadth));
}
}