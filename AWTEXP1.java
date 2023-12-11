 
 import java.awt.*;
 import java.awt.event.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

class AWTEXP1 extends Frame implements ActionListener{
    TextField tf;
    AWTEXP1 ()
    {
        
        // Create Componets
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button ButtoN = new Button(" Time_Date Checker");
        ButtoN.setBounds(70,120,150,30);

        // register listner

        ButtoN.addActionListener(this); // passing currunt instance

        // add add compponents and set size,layOut and visibility
        add(ButtoN);
        add(tf);

        setSize(1000,800);
        setLayout(null);

         setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");  
      LocalDateTime now = LocalDateTime.now();  
  
    tf.setText(dtf.format(now));
    }

   public static void main(String [] Arg)
   {
    
    new AWTEXP1();
   
   }
}




//   if it press then open this Frame or Exit form here