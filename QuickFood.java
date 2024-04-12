
package quickfood;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 class MenuWindow{
 JFrame menuframe;
 Label itemslabel,pizzalabel,sushlabel,buggerlabel;
 MenuWindow(){
     menuframe=new JFrame();
     itemslabel=new Label("Menu Items");
     pizzalabel=new Label("Pizza");
     sushlabel=new Label("Sush");
     buggerlabel=new Label("Bugger");
      menuframe.add(itemslabel);
         itemslabel.setBounds(100, 20, 150, 30);
         pizzalabel.setBounds(150, 42, 50, 30);
         sushlabel.setBounds(150, 62, 100, 30);
                  buggerlabel.setBounds(150, 85, 100, 30);
         menuframe.add(sushlabel);
           menuframe.add(pizzalabel);
            menuframe.add(buggerlabel);
         menuframe.setSize(350,210);
    menuframe.setTitle("Menu");
    menuframe.setLayout(null);
    menuframe.setVisible(true);
   menuframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    menuframe.setLocation(500,300);
 }
 }
class Orders{
   JFrame frame;
   Label l1;
   TextField tf;
   Button btn;
   String get;
Orders(){
 frame=new JFrame();
 tf=new TextField();
 l1=new Label("enter your Order");
 btn=new Button("SubmitOrder");
    frame.add(l1);
         l1.setBounds(20, 50, 150, 30);
        tf.setBounds(20, 85, 100, 30);
        btn=new Button("Submit Order");
   btn.setBounds(20, 120, 100, 30);
   btn.setBackground(Color.blue);
  frame.add(tf);
 frame.add(btn);
  btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btn){
        get=tf.getText();
    if(!"".equals(tf.getText())){
    tf.setText(" ");
     JOptionPane.showMessageDialog(frame, "Your Order is Received");
       
   }
    }    
            }
 });
      frame.setSize(350,210);
    frame.setTitle("Enter Your Order");
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setLocation(500,300);
}}
public class QuickFood extends WindowAdapter implements ActionListener {
    Button btn1,btn2;
    Frame frame;
    QuickFood(){
     frame=new Frame();
     Label l1=new Label("Welcome to QuickFood!");
     btn1=new Button("View Menu");
     btn2=new Button("Place Order");
      frame.add(l1);
      frame.add(btn1);
      btn1.setBackground(Color.LIGHT_GRAY);
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      btn2.setBackground(Color.LIGHT_GRAY);
      frame.add(btn2);
      frame.setLocation(350,200);
      frame.setSize(600,400);
      frame.setTitle("QuickFood Orders");
      frame.setLayout(new FlowLayout());
      frame.setVisible(true);
      frame.addWindowListener(this);
    }
  
    public static void main(String[] args) {
        
          new QuickFood();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==btn1){
        new MenuWindow();
        }
    if(e.getSource()==btn2){
      new Orders();
    } 
    }
        @Override
    public void windowClosing(WindowEvent ex){
          if(ex.getWindow()==frame){
    System.exit(0);
        }
    }
}