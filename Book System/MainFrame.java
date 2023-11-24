package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

    public MainFrame() {
       
        setSize(400,500);
        setLayout(null);
        setResizable(false);
        LoginView logView = new LoginView(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
