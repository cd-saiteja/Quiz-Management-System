package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/images.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(60, 55, 500, 300);
        add(image);
        
        JLabel heading = new JLabel("Geetanjali College of Engineering and Technology");
        heading.setBounds(540, 70, 600, 30);
        heading.setFont(new Font("Times new roman", Font.BOLD, 25));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel project = new JLabel("OOPs PBL");
        project.setBounds(755, 100, 600, 30);
        project.setFont(new Font("Times new roman", Font.BOLD, 15));
        project.setForeground(new Color(30, 144, 254));
        add(project);

        JLabel mem = new JLabel("By: Saiteja | Akshith | Harshith");
        mem.setBounds(685, 120, 600, 30);
        mem.setFont(new Font("Times new roman", Font.BOLD, 15));
        mem.setForeground(new Color(30, 144, 254));
        add(mem);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(710, 170, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(635, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Start");
        rules.setBounds(635, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(815, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
