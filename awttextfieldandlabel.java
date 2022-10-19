package Dhruv_Java;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class awttextfieldandlabel{
    awttextfieldandlabel(){
    Frame frame =new Frame("key typed");

    // //label
    // Label label=new Label("This is a label");
    // label.setForeground(Color.black);
    // label.setAlignment(Label.CENTER);
    // frame.add(label);

    //textfield
    TextField textfield=new TextField();
    // textfield.setBackground(Color.BLACK);
    // textfield.setForeground(Color.red);
    textfield.setSize(100,100);
    textfield.setLocation(250,100);
    frame.add(textfield);

    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setBackground(Color.PINK);
    frame.addWindowListener(new WindowAdapter(){ 
        @Override
        public void windowClosing(WindowEvent e){ 
            frame.dispose();
        }

    });
}
public static void main(String[] args) {
awttextfieldandlabel tf=new awttextfieldandlabel();
}
 
}
