import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class Login extends JFrame 
{
    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3, f4, f5, f6, f7;
    private JTextField tf1;
    private JButton btn1, btn2, btn3, btn4, btn5, nBtn;
    private JPasswordField tf2;
    private Cursor cursor;

    Login() 
    {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel AIUB");
        this.setSize(900, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#16a085"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 26);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 28);
        f5 = new Font("Segoe UI", Font.PLAIN, 22);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);
        f7 = new Font("Segoe UI Semibold", Font.PLAIN, 22);
        

        // Title
        label1 = new JLabel();
        label1.setText("Sign In or create an Account");
        label1.setBounds(280, 25, 500, 90);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Create a new Account");
        label1.setBounds(280, 250, 500, 90);
        label1.setFont(f7);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("For admin Login");
        label1.setBounds(280, 300, 500, 90);
        label1.setFont(f7);
        c.add(label1);

        // User Name
        label1 = new JLabel();
        label1.setText("User-Name");
        label1.setBounds(285, 95, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(450, 105, 200, 35);
        tf1.setFont(f5);
        c.add(tf1);

        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(285, 145, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf2 = new JPasswordField();
        tf2.setBounds(450, 155, 200, 35);
        tf2.setFont(f2);
        tf2.setEchoChar('*');
        c.add(tf2);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(725, 400, 140, 40);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(20, 400, 140, 40);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#34495e"));
        c.add(btn2);

        btn3 = new JButton("Sign In");
        btn3.setBounds(380, 205, 140, 40);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#34495e"));
        c.add(btn3);

        btn4 = new JButton("Sign Up");
        btn4.setBounds(510, 275, 140, 40);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#34495e"));
        c.add(btn4);

        btn5 = new JButton("Admin Login");
        btn5.setBounds(455, 330, 195, 40);
        btn5.setFont(f2);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#34495e"));
        c.add(btn5);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Exit Button
        btn1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                setVisible(false);
                Welcome frame = new Welcome();
                frame.setVisible(true);
            }
        });

        // Sign Up
        btn4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                Registration frame = new Registration();
                frame.setVisible(true);
                setVisible(false);
            }
        });

        // Admin Login
        btn5.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                setVisible(false);
                AdminLogin frame = new AdminLogin();
                frame.setVisible(true);
                JOptionPane.showMessageDialog(null, "By default, Admin Name and Password is : 'admin'", "Information!",
                                JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Sign In Button
        btn3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                String textField1 = tf1.getText().toLowerCase();
                String textField2 = tf2.getText();

                if (textField1.isEmpty() || textField2.isEmpty()) 
                {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        String userNameS = "User Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i+3);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get((i + 4));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", "Hotel AIUB",
                                            JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    Home frame = new Home();
                                    frame.setVisible(true);
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Invalid username or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }

            }
        });
    }

    public static void main(String[] args) 
    {
        Login frame = new Login();
        frame.setVisible(true);
    }
}
