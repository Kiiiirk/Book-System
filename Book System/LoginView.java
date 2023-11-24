package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginView{ 
    
    LoginView(JFrame frame) {

        Font loginFont, userNameFont, passFont; 
        
        JPanel logPanel = new JPanel();
        logPanel.setBounds(0,0,400,500);
        logPanel.setLayout(null);
        logPanel.setVisible(true);
        frame.add(logPanel);
        logPanel.setBackground(new Color(99, 97, 105));

        JLabel loginLbl = new JLabel("LOGIN");
        loginLbl.setBounds(130,50,200,40);
        loginFont = new Font("Arial", Font.BOLD, 40); 
        loginLbl.setForeground(new Color(255,255,255));  
        loginLbl.setFont(loginFont);
        logPanel.add(loginLbl);
        
        JLabel userLbl = new JLabel("Username");
        userLbl.setBounds(70,100,200,40);
        userNameFont = new Font("Arial", Font.BOLD, 15);
        userLbl.setForeground(new Color(255,255,255));
        userLbl.setFont(userNameFont);
        logPanel.add(userLbl);

        JTextField userTf = new JTextField("");
        userTf.setBounds(70,130,250,30);
        logPanel.add(userTf);

        JLabel passLbl = new JLabel("Password");
        passLbl.setBounds(70,160,150,40);
        passFont = new Font("Arial", Font.BOLD, 15);
        passLbl.setForeground(new Color(255,255,255));
        passLbl.setFont(passFont);
        logPanel.add(passLbl);

        JTextField passTf = new JTextField("");
        passTf.setBounds(70,190,250,30);
        logPanel.add(passTf);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(130,270,125,30);
        loginBtn.setBackground(new Color(57, 168, 87));
        logPanel.add(loginBtn);
        

        JButton regBtn = new JButton("Register");
        regBtn.setBounds(130,320,125,30);
        regBtn.setBackground(new Color(52, 121, 191));
        regBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();

                new RegisterView(frame);

            }
        }); 
        logPanel.add(regBtn);
        frame.setVisible(true);
    } 
}