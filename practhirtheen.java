package Dhruv_Java;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class practhirtheen {
    JLabel l;
    practhirtheen() {
        JFrame f = new JFrame("Swing Frame");
        l = new JLabel("", SwingConstants.CENTER);
        l.setBounds(15, 110, 260, 30);
        f.add(l);
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l.setText("Mouse Clicked");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                l.setText("Mouse Entered");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                l.setText("Mouse Exited");
            }
        });
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new practhirtheen();
            }
        });
    }
}

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// public class practhirtheen {
//     JLabel l;
//     practhirtheen() {
//         JFrame f = new JFrame("Swing Pink");
//         l = new JLabel("This is some text", SwingConstants.CENTER);
//         l.setBounds(15, 15, 260, 30); 
//         f.add(l);
//         f.getContentPane().setBackground(Color.PINK);
//         f.setSize(300, 100);
//         f.setLayout(null);
//         f.setVisible(true);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             public void run() {
//                 new practhirtheen();
//             }
//         });
//     }
// }

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// public class practhirtheen {
//     JButton btnRed, btnBlue;
//     practhirtheen() {
//         JFrame f = new JFrame("Swing Buttons");
//         btnRed = new JButton("Red");
//         btnRed.setBounds(16, 20, 250, 30);
//         btnRed.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 f.getContentPane().setBackground(Color.RED);
//             }
//         });
//         f.add(btnRed);
//         btnBlue = new JButton("Blue");
//         btnBlue.setBounds(16, 65, 250, 30);
//         btnBlue.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 f.getContentPane().setBackground(Color.BLUE);
//             }
//         });
//         f.add(btnBlue);
//         f.setSize(300, 160);
//         f.setLayout(null);
//         f.setVisible(true);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
 
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             public void run() {
//                 new practhirtheen();
//             }
//         });
//     }
// }

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// class KbdAdapter extends KeyAdapter {
//     JLabel l;
//     KbdAdapter(JLabel l) {
//         this.l = l;
//     }
//     @Override
//     public void keyTyped(KeyEvent e) {
//         l.setText("Typed character is: " + e.getKeyChar());
//     }
//     @Override
//     public void keyPressed(KeyEvent e) {
//         System.out.println("Pressed character is: " + e.getKeyChar());
//     }
//     @Override
//     public void keyReleased(KeyEvent e) {
//         System.out.println("Released character is: " + e.getKeyChar());
//     }
// }
// public class practhirtheen {
//     JLabel l;
//     practhirtheen() {
//         JFrame f = new JFrame("AWT Keyboard");
//         l = new JLabel("", SwingConstants.CENTER);
//         l.setBounds(15, 20, 250, 30);
//         f.addKeyListener(new KbdAdapter(l));
//         f.add(l);
//         f.setSize(300, 110);
//         f.setLayout(null);
//         f.setVisible(true);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             public void run() {
//                 new practhirtheen();
//             }
//         });
//     }
// }

// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// public class practhirtheen implements ActionListener {
//     JButton btnInfo, btnCGPA;
//     practhirtheen() {
//         JFrame f = new JFrame("Student Details");
//         btnInfo = new JButton("A");
//         btnInfo.setBounds(18, 100, 450, 100);
//         btnInfo.addActionListener(this);
//         f.add(btnInfo);
//         btnCGPA = new JButton("B");
//         btnCGPA.setBounds(18, 270, 450, 100);
//         btnCGPA.addActionListener(this);
//         f.add(btnCGPA);
//         f.setSize(500, 500);
//         f.setLayout(null);
//         f.setVisible(true);
//         f.setLocationRelativeTo(null);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             public void run() {
//                 new practhirtheen();
//             }
//         });
//     }
//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == btnInfo) {
//             new Information(
//                 "Dhruv Bhardwa", 
//                 "BSc (Hons) Computer Science", 
//                 "221/18072", 
//                 "ARSD College"
//             );
//         } else if (e.getSource() == btnCGPA) {
//             new CGPA("9.99");
//         }
//     }
// }
 
// /** Information.java **/
