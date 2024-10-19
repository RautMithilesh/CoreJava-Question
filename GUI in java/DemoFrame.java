
/* 
// By using class object .

import javax.swing.JFrame;

class DemoFrame
{
      JFrame frame = new JFrame();
      frame.setVisible(true);
      frame.setSize(500,500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocation(100,100);
      frame.SetTitle("Login Frame");
      frame.getContentPane().setBackground(java.awt.Color.CYAN);
}

*/

import javax.swing.JFrame;

class DemoFrame extends JFrame
{

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
        javax.swing.JLabel lbl1 = new javax.swing.JLabel("Username: ");
        add(lbl1);
        lbl1.setBounds(100,20,100,30);

        javax.swing.JLabel lbl2 = new javax.swing.JLabel("Password: ");
        add(lbl2);
        lbl2.setBounds(200,70,100,30);

        javax.swing.JTextField txt1 = new javax.swing.JTextField();
        add(txt1);
        txt1.setBounds(350,20,100,30);

        javax.swing.JPasswordField txt2 = new javax.swing.JPasswordField();
        add(txt2);
        txt2.setBounds(350,70,100,30);

        javax.swing.JButton btn1 = new javax.swing.JButton("Login");
        add(btn1);
        btn1.setBounds(230,200,100,30);

        javax.swing.JButton btn2 = new javax.swing.JButton("Cancle");
        add(btn2);
        btn2.setBounds(350,200,100,30);


    }

      public static void main (String args[])
      {
          DemoFrame frame = new DemoFrame();
      }
}
