
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

class DemoFrame extends JFrame implements ActionListener
{

    private javax.swing.JButton loginbutton ;
    private javax.swing.JButton cancelbutton ;
    private javax.swing.JTextField num1text;
    private javax.swing.JTextField num2text ;
     
    DemoFrame()    // the methods we are using are non-static 
           //so we can't use them in main function because main function is static function .
    {
      setVisible(true);
      setSize(500,500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocation(100,100); 
      setTitle("Login Frame");
      getContentPane().setBackground(java.awt.Color.CYAN);
      setLayout(null);

      setComponent();
    }

    void setComponent()
    {
        javax.swing.JLabel num1label = new javax.swing.JLabel("Number 1 : ");
        add(num1label);
        num1label.setBounds(100,50,100,30);

        javax.swing.JLabel num2label = new javax.swing.JLabel("Number 2 : ");
        add(num2label);
        num2label.setBounds(100,90,100,30);

        num1text = new javax.swing.JTextField();
        add(num1text);
        num1text.setBounds(250,50,100,30);

        num2text = new javax.swing.JTextField();
        add(num2text);
        num2text.setBounds(250,90,100,30);

        loginbutton = new javax.swing.JButton("Login");
        add(loginbutton);
        loginbutton.setBounds(100,200,100,30);
        loginbutton.addActionListener(this);

        cancelbutton = new javax.swing.JButton("Cancle");
        add(cancelbutton);
        cancelbutton.setBounds(250,200,100,30);
        cancelbutton.addActionListener(this);
    } 

    public void actionPerformed(ActionEvent ae)
    {
        int addition ;

        if(ae.getSource() == loginbutton)
        {
            String num1 = num1text.getText();
            String num2 = num2text.getText();
            
            int Number1 = Integer.parseInt(num1);
            int Number2 = Integer.parseInt(num2);

            addition = Number1 + Number2 ;
            cancelbutton.setText(String.valueOf(addition));

            num1text.setText("");
            num2text.setText("");

        }
        else if(ae.getSource() == cancelbutton)
        { 
             //System.out.println("Cancel button pressed ");
             setVisible(false);
        }

    }

    public static void main (String args[])
    {
        DemoFrame frame = new DemoFrame();
    }
}
