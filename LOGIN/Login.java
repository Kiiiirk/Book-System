import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login{ 
    
    Login() {

     JFrame frame = new JFrame ();
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBackground(new Color(255, 0, 0));

        JLabel loginLbl = new JLabel("LOGIN");
        loginLbl.setBounds(175,50,100,40);
        frame.add(loginLbl);
        
        JLabel userLbl = new JLabel("Username");
        userLbl.setBounds(70,100,150,40);
        frame.add(userLbl);

        JTextField userTf = new JTextField("");
        userTf.setBounds(70,130,250,30);
        frame.add(userTf);

        JLabel passLbl = new JLabel("Password");
        passLbl.setBounds(70,160,150,40);
        frame.add(passLbl);

        JTextField passTf = new JTextField("");
        passTf.setBounds(70,190,250,30);
        frame.add(passTf);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(130,270,125,30);
        frame.add(loginBtn);
        

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(130,320,125,30);
        frame.add(registerBtn);
        frame.setVisible(true);
    }   
    public static void main (String[] args){
       
        new Login();

    }
}