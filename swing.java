package Dhruv_Java;
import java.awt.Color;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swing{
swing(){
    JFrame frame=new JFrame("hello world");
    
    // ImageIcon a=new ImageIcon("markoknow.png");
    frame.setVisible(true);
    //click cross to exit
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //setting image icon of frame
    ImageIcon icon1=new ImageIcon("Dhruv_Java/markoknow.png");
    frame.setIconImage(icon1.getImage());
    //setsize of frame
    // frame.setSize(500,500);
    frame.setBounds(100,100,500,500);
    //make it not resizable
    // frame.setResizable(false);

    //background colour
    Container c=frame.getContentPane();
    c.setBackground(Color.pink);

    //LABEL
    // JLabel label=new JLabel("Username:");
    // label.setBounds(100,50,1000,40);//set bounds for null layout
    c.setLayout(null);//first remove flowlayout
    // c.add(label);//add to container pane

    //set text of label manually
    // label.setText("Password:");

    //creating fonts for our label
    // Font font=new Font("Arial",Font.BOLD,30);//font name,type and size
    // label.setFont(font);

    //adding images to the Jlabel
    // ImageIcon icon=new ImageIcon("Dhruv_Java/markoknow.png");
    // JLabel label1=new JLabel(icon);
    // label1.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
    // c.add(label1);


    //TExtfield
    // JTextField field=new JTextField();
    // field.setBounds(100,100,200,50);
    // field.setText("ENter your name");
    // field.setEditable(false);//cannot be edited text
    // c.add(field);

    //Button
    JButton red=new JButton("Red");
    red.setBounds(100,100,100,30);
    red.setForeground(Color.red);
    red.setBackground(Color.pink);
    red.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            c.setBackground(Color.red);
        }
    });
    c.add(red);
    
    
    
    
    JButton blue=new JButton("Blue");
    blue.setBounds(100,150,100,30);
    blue.setForeground(Color.blue);
    blue.setBackground(Color.black);
    blue.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            c.setBackground(Color.blue);
        }
    });
    c.add(blue);
    
}

public static void main(String[] args) {
    new swing();

 
}
 
}