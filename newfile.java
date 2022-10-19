package Dhruv_Java;
import java.util.*;//--mandatory
import java.awt.*;//--mandatory
import java.awt.event.*;//--mandatory
public class newfile{
    newfile(){ 
        //step-1 
        //f is capital
        Frame f=new Frame("Friends practical");


        //step-2
        //L is capital
        // Label l=new Label("Name");
        // l.setAlignment(Label.CENTER);//alignment??--Label.Center
        // f.add(l);


        //step-3
        //T and A is capital
        // TextArea ta=new TextArea(s);
        // ta.setSize(200,50);
        // ta.setLocation(100,100);
        // f.add(ta);


        // //step-4
        // //T and F is capital
        // TextField tf=new TextField(20);
        // tf.setSize(200,50);
        // tf.setLocation(100,100);
        // f.add(tf);

        //STEP-5
        // b is capital
        // Button btn1=new Button("Red");
        // btn1.setSize(100,100);
        // btn1.setForeground(Color.red);
        // btn1.setLocation(100,150);
        // btn1.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e){ 
        //         f.setBackground(Color.red);
        //     }
        // });
        // f.add(btn1);
        // Button btn2=new Button("Blue");
        // btn2.setSize(100,100);
        // btn2.setLocation(250,150);
        // btn2.setForeground(Color.blue);
        // btn2.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e){ 
        //         f.setBackground(Color.blue);
        //     }
        // });
        // f.add(btn2);

        //STEP-6
        // String details="""
        //         Name:-Dhruv Bhardwaj
        //         Class-Bsc. Hons. Comp sci.
        //         Roll no.-18072
        //         COllege-ARSDC
        //         """;
        // TextArea ta1=new TextArea();
        // ta1.setSize(200,150);
        // ta1.setLocation(70,150);
        // f.add(ta1);
        // Button name=new Button("Details");
        // name.setSize(100,30);
        // name.setLocation(125,320);
        // name.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e){
        //         ta1.append(details);
        //     }
        // });
        // f.add(name);
      

        // String cgpa= "CGPA:9.09\n";
        // TextArea ta2=new TextArea();
        // ta2.setSize(200,150);
        // ta2.setLocation(350,150);
        // f.add(ta2);
        // Button cg=new Button("CGPA");
        // cg.setSize(100,30);
        // cg.setLocation(425,320);
        // cg.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e){
        //         ta2.append(cgpa);
        //     }
        // });
        // f.add(cg);



        //Step-7
        // Label typedchar=new Label("Type a key.....");
        // typedchar.setAlignment(Label.CENTER);
        // typedchar.setForeground(Color.black);
        // f.addKeyListener(new KeyAdapter(){ 
        //     @Override
        //     public void keyTyped(KeyEvent e){ 
        //         typedchar.setText("Entered Text is: "+e.getKeyChar()); 
        //     }
        // });
        // f.add(typedchar);

        // Step-8
        // Label text=new Label("Put mouse in....");
        // text.setAlignment(Label.CENTER);
        // text.setForeground(Color.black);
        // f.addMouseListener(new MouseAdapter(){ 
        //     @Override
        //     public void mouseClicked(MouseEvent e){ 
        //         text.setText("Mouse clicked");
        //     }
        //     @Override
        //     public void  mouseEntered(MouseEvent e){ 
        //         text.setText("Mouse Entered");
        //     }
        //     @Override
        //     public void mouseExited(MouseEvent e){ 
        //         text.setText("Mouse Exited");
        //     } 
        //     @Override
        //     public void mousePressed(MouseEvent e){ 
        //         text.setText("Mouse Pressed");
        //     } 
        // });
        // f.add(text);




        f.setSize(100,100);
        f.setLayout(new CardLayout());
        f.setVisible(true);
        f.setLocation(250,250);
        f.setBackground(Color.PINK);//Color.red q9
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){ 
                f.dispose();
                //this will dispose my frame when i will click on red button
            }
        });//window m cross minimize ya maximize button p jo work hota h  use khte h windowlistener
    }
public static void main(String[] args) {
newfile obj=new newfile();
}
}