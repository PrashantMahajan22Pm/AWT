  
  //  we can print Daily today_Fast
  
  import java.awt.*;
 import java.awt.event.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  


   
  // extending Frame class to our class AWTExample


  class AWTEXP {
    public static void main(String []  Arg)
    {
  AWTEXP1 aobj = new AWTEXP1();
    }
 }



 class AWTEXP1 extends Frame implements ActionListener{
    TextField Text1;
    
   public AWTEXP1 ()
    {

        Frame Frame1 = new Frame();

        Label LB = new Label("Welcome");
        
        // Create Componets
        Text1 = new TextField();
        Button ButtoN = new Button("Time_Date Checker");
        
        Text1.setBounds(60,100,150,20);
        ButtoN.setBounds(60,150,150,30);
        LB.setBounds(250,30,70,30);
      
        // register listner

        ButtoN.addActionListener(this); // passing currunt instance

        // add add compponents and set size,layOut and visibility
        Frame1.add(ButtoN);
        Frame1.add(LB);
        Frame1.add(Text1);

       
        Frame1.setTitle("RanDom_Choser");

        Frame1.setSize(500,300);

        Frame1.setLayout(null);
  

        // Frame is by Default is not visible so we send true para for visible
        Frame1.setVisible(true);
      
    }

    public void actionPerformed(ActionEvent e)
    {
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");  
      LocalDateTime now = LocalDateTime.now();  
  
     Text1.setText(dtf.format(now));
    }
}




//   if it press then open this Frame or Exit form here
