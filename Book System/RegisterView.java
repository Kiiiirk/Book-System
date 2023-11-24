package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegisterView {
    
        RegisterView(JFrame frame) {
        
        Font regFont, nameFont, userNameFont, passFont;
        
        JPanel regPanel = new JPanel();
        regPanel.setBounds(0,0,400,500);
        regPanel.setLayout(null);
        regPanel.setBackground(new Color(99, 97, 105));
        regPanel.setVisible(true);
        frame.add(regPanel);

        JLabel regLbl = new JLabel("REGISTER");
        regLbl.setBounds(94,50,250,40);
        regFont = new Font("Arial", Font.BOLD, 40);
        regLbl.setForeground(new Color(255,255,255));
        regLbl.setFont(regFont);;
        regPanel.add(regLbl);

        JLabel nameLbl = new JLabel("Name");
        nameLbl.setBounds(40,130,150,40);
        nameLbl.setForeground(new Color(255,255,255));
        nameFont = new Font("Arial", Font.BOLD, 15);
        nameLbl.setFont(nameFont);
        regPanel.add(nameLbl);

        JTextField userTf = new JTextField("");
        userTf.setBounds(115,130,200,30);
        regPanel.add(userTf);

        JLabel userNameLbl = new JLabel("Userame");
        userNameLbl.setBounds(40,190,150,40);
        userNameLbl.setForeground(new Color(255,255,255));
        userNameFont = new Font("Arial", Font.BOLD, 15);
        userNameLbl.setFont(userNameFont);
        regPanel.add(userNameLbl);

        JTextField userNameTf = new JTextField("");
        userNameTf.setBounds(115,190,200,30);
        regPanel.add(userNameTf);

        JLabel passLbl = new JLabel("Password");
        passLbl.setBounds(40,250,150,40);
        passLbl.setForeground(new Color(255,255,255));
        passFont = new Font("Arial", Font.BOLD, 15);
        passLbl.setFont(passFont);
        regPanel.add(passLbl);

        JTextField passTf = new JTextField("");
        passTf.setBounds(115,250,200,30);
        regPanel.add(passTf);



        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(60,350,125,30);
        cancelBtn.setBackground(new Color(57, 168, 87));
        cancelBtn.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();

                new LoginView(frame);
            }
        });
        regPanel.add(cancelBtn);
        

        JButton regBtn = new JButton("Register");
        regBtn.setBounds(200,350,125,30);
        regBtn.setBackground(new Color(52, 121, 191));
        regPanel.add(regBtn);


    } 

}
