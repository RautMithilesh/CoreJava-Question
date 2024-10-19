

import javax.swing.JFrame;

class Student extends JFrame
{

    Student()    // the methods we are using are non-static 
           //so we can't use them in main function because main function is static function .
    {
      setVisible(true);
      setSize(500,500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocation(100,100); 
      setTitle("Student Registration form");
      getContentPane().setBackground(java.awt.Color.WHITE);
      setLayout(null);

      setComponent();
    }

    void setComponent()
    {
        javax.swing.JLabel lbl1 = new javax.swing.JLabel("Name: ");
        add(lbl1);
        lbl1.setBounds(100,50,100,30);

        javax.swing.JLabel lbl2 = new javax.swing.JLabel("Email: ");
        add(lbl2);
        lbl2.setBounds(100,90,100,30);

        javax.swing.JLabel lbl3 = new javax.swing.JLabel("Password: ");
        add(lbl3);
        lbl3.setBounds(100,130,100,30);

        javax.swing.JLabel lbl4 = new javax.swing.JLabel("Age: ");
        add(lbl4);
        lbl4.setBounds(100,170,100,30);

        javax.swing.JLabel lbl5 = new javax.swing.JLabel("Blood Group: ");
        add(lbl5);
        lbl5.setBounds(100,210,100,30);

        javax.swing.JLabel lbl6 = new javax.swing.JLabel("Highest Education : ");
        add(lbl6);
        lbl6.setBounds(100,250,200,30);


        javax.swing.JTextField txt1 = new javax.swing.JTextField();
        add(txt1);
        txt1.setBounds(250,50,100,30);

        javax.swing.JTextField txt2 = new javax.swing.JTextField();
        add(txt2);
        txt2.setBounds(250,90,100,30);

        javax.swing.JPasswordField txt3 = new javax.swing.JPasswordField();
        add(txt3);
        txt3.setBounds(250,130,100,30);

        javax.swing.JTextField txt4 = new javax.swing.JTextField();
        add(txt4);
        txt4.setBounds(250,170,100,30);

        javax.swing.JTextField txt5 = new javax.swing.JTextField();
        add(txt5);
        txt5.setBounds(250,210,100,30);

        javax.swing.JTextField txt6 = new javax.swing.JTextField();
        add(txt6);
        txt6.setBounds(250,250,100,30);


        javax.swing.JButton btn1 = new javax.swing.JButton("Submit");
        add(btn1);
        btn1.setBounds(100,320,100,30);

        javax.swing.JButton btn2 = new javax.swing.JButton("Cancle");
        add(btn2);
        btn2.setBounds(250,320,100,30);


    }

      public static void main (String args[])
      {
          Student frame = new Student();
      }
}
