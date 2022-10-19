package Dhruv_Java;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class awtbutton{
    awtbutton(){ 
        Frame frame=new Frame("Button awt");
        Button btn=new Button();
        btn.setLabel("Blue");
        btn.setBounds(120,120,100,20);
        btn.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){ 
                frame.setBackground(Color.blue);
            }
        });
        frame.add(btn);

        Button btn1=new Button();
        btn1.setLabel("Red");
        btn1.setBounds(120,220,100,20);
        btn1.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){ 
                frame.setBackground(Color.red);
            }
        });
        frame.add(btn1);
        
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){ 
            @Override
            public void windowClosing(WindowEvent e){ 
                frame.dispose();
            }
        });

    }
public static void main(String[] args) {
new awtbutton();

 
}
 
}