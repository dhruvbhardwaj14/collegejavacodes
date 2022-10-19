package Dhruv_Java;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
//method-1
// class KbdAdapter extends KeyAdapter {
//     Label l;
//     KbdAdapter(Label l) {
//     this.l = l;
//     }
    
//     @Override
//     public void keyTyped(KeyEvent e) {
//     l.setText("Typed character is: " + e.getKeyChar());
//     }
// }
public class awtkeytyped{
    awtkeytyped(){
        Frame frame =new Frame("key typed");
    //typed character 
    Label key=new Label("");
    key.setAlignment(Label.CENTER);
    // frame.addKeyListener(new KbdAdapter(key));

    //method 2
    frame.addKeyListener(new KeyAdapter(){ 
        @Override
        public void keyTyped(KeyEvent e){ 
            key.setText("Entered Character is"+e.getKeyChar());
        }
    });
    frame.add(key);

    frame.setSize(500,500);
    frame.setLocation(1000,100);
    frame.setLayout(new BorderLayout());
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
new awtkeytyped();
}
}