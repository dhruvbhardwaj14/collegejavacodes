package Dhruv_Java;
import java.util.*;
class Rectangle{ 
public int length;
public int breadth;
Rectangle(){}
Rectangle(int l,int b){
    this.length=l;
    this.breadth=b;
}
public void area(){
    System.out.println("Area:"+(this.length*this.breadth));
}
}
class Cuboid extends Rectangle{ 
public int height;
Cuboid(){};
Cuboid(int l,int b,int h){
    this.length=l;
    this.breadth=b;
    this.height=h;
}
public void area(){
    System.out.println(" Surface Area:"+(2*(this.length*this.breadth + this.length*this.height +this.breadth*this.height)));
}
}
public class test{
public static void main(String[] args) {
Rectangle r=new Rectangle(4,5);
 r.area();
 Cuboid c=new Cuboid(1,2,3);
 c.area();
}
 
}