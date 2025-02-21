import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    Home() 
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

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/Preview.jpg"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(60, 100, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        logo = new ImageIcon(getClass().getResource("/images/BookNow.jpg"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(470, 100, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);


        // Fonts
        f1 = new Font("Tahoma", Font.BOLD, 48);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 20);

        // Title
        label1 = new JLabel();
        label1.setText("WELCOME");
        label1.setBounds(325, 20, 500, 65);
        label1.setFont(f1);
        c.add(label1);



        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Logout");
        btn1.setBounds(750, 20, 120, 30);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        c.add(btn1);

        btn2 = new JButton("PREVIEW");
        btn2.setBounds(60, 350, 354, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#34495e"));
        c.add(btn2);


        btn4 = new JButton("BOOK NOW");
        btn4.setBounds(470, 350, 354, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#34495e"));
        c.add(btn4);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Logout
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Login frame = new Login();
                frame.setVisible(true);
            }
        });

        // Preview
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                Preview frame = new Preview();
                frame.setVisible(true);
                setVisible(false);
            }
        });



        // Book Now
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Packs frame = new Packs();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        Home frame = new Home();
        frame.setVisible(true);
    }
}
