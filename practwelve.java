package Dhruv_Java;
import java.util.*;
import java.awt.*;    
import java.awt.event.*;    
public class practwelve {    
public static void main (String[] args) {   
  
    // create instance of frame with the label   
    Frame f = new Frame("Details"); 
    
    // create instance of frame with the label   
     final TextArea tf=new TextArea();    
     final TextArea tf1=new TextArea();    
    tf.setBounds(50,50, 160,200);  
    tf1.setBounds(230,50, 160,200);  
  
    // create instance of button with label  
    Button name = new Button("Name");   
    Button cgpa = new Button("Cgpa");   
    String ne="Dhruv Bhardwaj"+"\n"+"B.sc.Hons.(Comp. Sci)"+"\n"+"18072"+"\n"+"ARSD COLLEGE"+"\n";
    String cg="CGPA: 9.99"+"\n";
    // set the position for the button in frame   
    name.setBounds(80,250,80,30);    
    cgpa.setBounds(260,250,80,30); 
    name.addActionListener(new ActionListener() {    
        public void actionPerformed (ActionEvent e) {    
                tf.append(ne);
                // tf.setText("Dhruv Bhardwaj");    
            }    
        });     
    cgpa.addActionListener(new ActionListener() {    
        public void actionPerformed (ActionEvent e) {    
            tf1.append(cg);
            }    
        });     
  
    // add button to the frame  
    f.add(name);    
    f.add(cgpa);    
    f.add(tf);
    f.add(tf1);
    // set size, layout and visibility of frame  
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);     
}    
}