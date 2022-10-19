package Dhruv_Java;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class awtframe /*method 1-extends Frame*/{
    //method 1 to create
    // public awtframe(){
    //      setSize(400,400);
    //      setVisible(true);
    // }

    //method 2-creating frames
    public awtframe(){
    Frame frame =new Frame("Hi i am a frame");

    //here add any buttons or anything


    //note these two lines must be at end only 
    frame.setSize(500,500);
    frame.setLocation(1000,100);
    frame.setVisible(true);


    frame.setBackground(Color.BLUE);
    frame.addWindowListener(new WindowAdapter(){ 
        @Override
        public void windowClosing(WindowEvent e){ 
            frame.dispose();
        }

    });
    }
public static void main(String[] args) {
    // method 1 to call
    // new awtframe();

    //method 2
    awtframe f=new awtframe();

 
}
 
}


