
 
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  



class RanDomGUI
{
 public static void main(String [] Arg)
 {
  Number nobj = new Number();
  int iGs = nobj.NumberGentor();
  AWTEXP1 aobj = new AWTEXP1(iGs);

 }
  }

  class Number
  {
     public int NumberGentor()
   {
    int iNum=0;
    Scanner sobj2 = new Scanner(System.in);
    iNum = (int)((Math.random() + Math.random()+ Math.random()) * 40);
    return iNum;
   }
  }

 class AWTEXP1 extends Frame implements ActionListener
 {
    TextField Text1;   // Aceept User Input
    public int GetGesser;
    Label LBHelper; 
    
   public AWTEXP1 (int XNum)
    {
        GetGesser = XNum;
        Frame Frame1 = new Frame();
        LBHelper= new Label(" Lets Gess magic Number ");
        Label LB = new Label("Welcome ");
       
        // Create Componets
        Text1 = new TextField();
        
        Button ButtoN = new Button("Check");
        
        LB.setBounds(250,30,70,30);
        Text1.setBounds(90,150,150,20);
        ButtoN.setBounds(90,200,150,30);
       
        LBHelper.setBounds(90,100,200,30);
       
        // register listner

        ButtoN.addActionListener(this); // passing currunt instance

        // add add compponents and set size,layOut and visibility
        Frame1.add(ButtoN);
        Frame1.add(LB);
        Frame1.add(Text1);
        Frame1.add(LBHelper);
       
        
       
        Frame1.setTitle("RanDom_Choser");

        Frame1.setSize(500,300);

        Frame1.setLayout(null);
  

        // Frame is by Default is not visible so we send true para for visible
        Frame1.setVisible(true);
        LB.setBackground(Color.green);

        ButtoN.setBackground(Color.ORANGE);
        Text1.setBackground(Color.yellow);

    }

    public void actionPerformed(ActionEvent e)
    {
        try{
        int No1 =Integer.parseInt(Text1.getText());
        if (No1 == GetGesser) 
        {
          LBHelper.setText(" Great ,You Win ");
          LBHelper.setBackground(Color.PINK);
        }
        else if(No1 > GetGesser)
        {
          LBHelper.setText(" OPPS , Big number is Entered ");
          LBHelper.setBackground(Color.red);
        }
          else if(No1 < GetGesser)
        {
          LBHelper.setText(" OPPS , Small number is Entered ");
           LBHelper.setBackground(Color.red); 
        }
  
        Text1.setText("");
        }
        catch(Exception eobj)
        {}
    }

}




//   if it press then open this Frame or Exit form here