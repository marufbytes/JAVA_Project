import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

public class Info extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1, tf2, tf4, tf3, tf5;
    //private JComboBox securityQsn;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    //private JPasswordField tf5;
    private Cursor cursor;
    private int a, b;

    Info() 
    {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel AIUB");
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#16a085"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());


        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 30);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 20);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Inset your Information");
        label1.setBounds(180, 25, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        // First Name
        label1 = new JLabel();
        label1.setText("First Name");
        label1.setBounds(215, 75, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(215, 120, 260, 30);
        tf1.setFont(f5);
        c.add(tf1);

        // Last Name
        label1 = new JLabel();
        label1.setText("Last Name");
        label1.setBounds(215, 150, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf2 = new JTextField();
        tf2.setBounds(215, 195, 260, 30);
        tf2.setFont(f5);
        c.add(tf2);

        //Email
        label1 = new JLabel();
        label1.setText("Email");
        label1.setBounds(215, 225, 500, 50);
        label1.setFont(f4);
        c.add(label1);
        
        tf3 = new JTextField();
        tf3.setBounds(215, 270, 260, 30);
        tf3.setFont(f5);
        c.add(tf3);

        // NID
        label1 = new JLabel();
        label1.setText("NID");
        label1.setBounds(215, 300, 500, 50);
        label1.setFont(f4);
        c.add(label1);
        
        tf4 = new JTextField();
        tf4.setBounds(215, 345, 260, 30);
        tf4.setFont(f5);
        c.add(tf4);        

        // DoB
        label1 = new JLabel();
        label1.setText("Date of Birth");
        label1.setBounds(215, 375, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf5 = new JTextField();
        tf5.setBounds(215, 420, 260, 30);
        tf5.setFont(f5);
        c.add(tf5);









        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons

        btn2 = new JButton("Back");
        btn2.setBounds(20, 600, 140, 40);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#34495e"));
        c.add(btn2);



        btn4 = new JButton("PROCEED");
        btn4.setBounds(215, 475, 260, 40);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#34495e"));
        c.add(btn4);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);


        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Packs frame = new Packs();
                frame.setVisible(true);
            }
        });



        // Register Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText(); // User Name
                String textField2 = tf2.getText(); // Email
                String textField3 = tf3.getText(); // Password
                String textField4 = tf4.getText(); // Security Question Answer
                String textField5 = tf5.getText(); // Captcha
                //String secQsn = String.valueOf(securityQsn.getSelectedItem()); // Security Question
                int result = 0;

                if (textField5.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    result = Integer.parseInt(tf5.getText());
                    if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                            || textField5.isEmpty() ) 
                            {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    } else {

                        try {
                            File file = new File(".\\Data\\guest_data.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("First Name : " + textField1);
                            pw.println("Last Name : " + textField2);          
                            pw.println("Email : " + textField3);
                            pw.println("NID : " + textField4);
                            pw.println("Date of Birth : " + textField5);
                            pw.println("Time & Date : " + timeAndDate);
                            pw.println("===============================================");
                            pw.close();

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }

                        JOptionPane.showMessageDialog(null, "Registration Successfully Completed.",
                                "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        Payment frame = new Payment();
                        frame.setVisible(true);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {

        Info frame = new Info();
        frame.setVisible(true);
    }
}
