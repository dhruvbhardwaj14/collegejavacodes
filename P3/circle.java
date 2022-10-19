package Dhruv_Java.P3;
import java.util.*;
import Dhruv_Java.P1.*;
public class circle extends shape{
    private int radius;
    public circle(){};
    public circle(int r){
        this.radius=r;
    }
    public void display(){ 
        System.out.println("Radius:"+radius);
    }
    public void area(){ 
        System.out.println("Area is:"+(2*Math.PI*radius*radius));
}
}