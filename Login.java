
package bank.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton login,clear,signup;
    JTextField cardTextField,pinTextField;
    Login(){
        setTitle("BANK MANAGMENT");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text=new JLabel("Welcome to the bank");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel Cardno=new JLabel("Card No-");
        Cardno.setFont(new Font("Raleway",Font.BOLD,28));
        Cardno.setBounds(120,150,150,30);
        add(Cardno);
        
        cardTextField=new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);
        
        JLabel pin=new JLabel("Pin No-");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        pinTextField=new JTextField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);
        
        login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        add(login);
        login.addActionListener(this);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        
        clear=new JButton("Clear");
        clear.setBounds(430,300,100,30);
        add(clear);
        clear.addActionListener(this);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        
        signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        add(signup);
        signup.addActionListener(this);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);

        
        getContentPane().setBackground(Color.RED);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
            
        }else if(ae.getSource()==login){
            
        } else if(ae.getSource()==signup){
            
        }
        
    }
      public static void main(String args[]){
        new Login();
        
    }
    
}
