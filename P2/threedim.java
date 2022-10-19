package Dhruv_Java.P2;
import Dhruv_Java.P1.*;
import java.util.*;
public class threedim extends twodim{
private int z;
public threedim()
{
    super(0,0);
    this.z=0;
};
public threedim(int x,int y,int z){ 
    super(x,y);
    this.z=z;
}
public String toString(){ 
    return(super.toString()+" z:"+z);
}
public void display(){
    System.out.println("hi three dim");
}
}