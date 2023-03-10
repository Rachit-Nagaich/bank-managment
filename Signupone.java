
package bank.managment.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class Signupone extends JFrame {
    Signupone(){
        setLayout(null);
        Random ran=new Random();
        long random=Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno=new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel persondetails=new JLabel("PAGE 1 PERSONAL DETAILS ");
        persondetails.setFont(new Font("Raleway",Font.BOLD,22));
        persondetails.setBounds(290,80,400,30);
        add(persondetails);
        
        JLabel name=new JLabel("NAME:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        JTextField nametextfield=new JTextField();
        nametextfield.setFont(new Font("Raleway",Font.BOLD,14));
        nametextfield.setBounds(300,140,400,30);
        add(nametextfield);
        
        JLabel fname=new JLabel("FATHER'S NAME:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         JTextField fnametextfield=new JTextField();
        fnametextfield.setFont(new Font("Raleway",Font.BOLD,14));
        fnametextfield.setBounds(300,190,400,30);
        add(fnametextfield);
        
        JLabel dob=new JLabel("DATE OF BIRTH:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        JDateChooser datechooser=new JDateChooser();
        datechooser.setBounds(300,240,400,30);
        datechooser.setForeground(Color.BLACK);
        add(datechooser);
        
        JLabel gender=new JLabel("GENDER:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        JRadioButton male=new JRadioButton("MALE");
        male.setBounds(300,290,60,30);
        add(male);
        
        JRadioButton female=new JRadioButton("FEMALE");
        female.setBounds(450,290,120,30);
        add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel em=new JLabel("EMAIL ADDRESS:");
        em.setFont(new Font("Raleway",Font.BOLD,20));
        em.setBounds(100,340,200,30);
        add(em);
        
         JTextField enametextfield=new JTextField();
        enametextfield.setFont(new Font("Raleway",Font.BOLD,14));
        enametextfield.setBounds(300,340,400,30);
        add(enametextfield);
        
        JLabel m=new JLabel("MARITAL STATUS:");
        m.setFont(new Font("Raleway",Font.BOLD,20));
        m.setBounds(100,390,200,30);
        add(m);
        
        JRadioButton mai=new JRadioButton("MAIRRED");
        mai.setBounds(300,390,100,30);
        add(mai);
        
        JRadioButton unmai=new JRadioButton("UNMAIRRED");
        unmai.setBounds(450,390,100,30);
        add(unmai);
        
        JRadioButton other=new JRadioButton("OTHER");
        other.setBounds(630,390,100,30);
        add(other);
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(mai);
        maritalgroup.add(unmai);
        maritalgroup.add(other);
        
        JLabel ad=new JLabel("ADDRESS:");
        ad.setFont(new Font("Raleway",Font.BOLD,20));
        ad.setBounds(100,440,200,30);
        add(ad);
        
         JTextField addtextfield=new JTextField();
        addtextfield.setFont(new Font("Raleway",Font.BOLD,14));
        addtextfield.setBounds(300,440,400,30);
        add(addtextfield);
        
        JLabel city=new JLabel("CITY: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
         JTextField citytextfield=new JTextField();
        citytextfield.setFont(new Font("Raleway",Font.BOLD,14));
        citytextfield.setBounds(300,490,400,30);
        add(citytextfield);
        
        JLabel state=new JLabel("STATE:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
         JTextField statetextfield=new JTextField();
        statetextfield.setFont(new Font("Raleway",Font.BOLD,14));
        statetextfield.setBounds(300,540,400,30);
        add(statetextfield);
        
        JLabel pincode=new JLabel("PINCODE:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
         JTextField pincodetextfield=new JTextField();
        pincodetextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pincodetextfield.setBounds(300,590,400,30);
        add(pincodetextfield);
        
        JButton next =new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String args[]){
        new Signupone();
        
                
    }
    
}
