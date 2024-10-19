
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

class DemoFrame extends JFrame implements ActionListener
{

    private javax.swing.JButton loginbutton ;
    private javax.swing.JButton cancelbutton ;
    private javax.swing.JTextField nametext;
    private javax.swing.JPasswordField passwordtext ;
     
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
        javax.swing.JLabel namelabel = new javax.swing.JLabel("Username: ");
        add(namelabel);
        namelabel.setBounds(100,50,100,30);

        javax.swing.JLabel passwordlabel = new javax.swing.JLabel("Password: ");
        add(passwordlabel);
        passwordlabel.setBounds(100,90,100,30);

        nametext = new javax.swing.JTextField();
        add(nametext);
        nametext.setBounds(250,50,100,30);

        passwordtext = new javax.swing.JPasswordField();
        add(passwordtext);
        passwordtext.setBounds(250,90,100,30);

        loginbutton = new javax.swing.JButton("Login");
        add(loginbutton);
        loginbutton.setBounds(100,200,100,30);
        loginbutton.addActionListener(this);

        cancelbutton = new javax.swing.JButton("Cancle");
        add(cancelbutton);
        cancelbutton.setBounds(250,200,100,30);
        cancelbutton.addActionListener(this);
    } 

    
    passwordtext.addKeyListener(loginEvent le)

    public class loginEvent extends KeyAdapter
    {
            public void KeyReleased(KeyEvent ke)
            {
                loginbutton = new javax.swing.JButton("Login");
                add(loginbutton);
                loginbutton.setBounds(100,200,100,30);
                loginbutton.addActionListener(loginEvent);
            }
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == loginbutton)
        {
            String username = nametext.getText();
            String password = passwordtext.getText();

            if(username.equalsIgnoreCase("Sangamner") && password.equals("422605"))
            {
                System.out.println("Login Successful ");
            }
            else
            {
                System.out.println("Username or Password are incorrect");
            }
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
