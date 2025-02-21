import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Packs extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, btn4, btn5, nBtn;
    private Cursor cursor;
    private JRadioButton defPacks, selfChosenPacks;
    private ButtonGroup jButtonGroup;
    private int pack = 0;

    Packs() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel AIUB");
        this.setSize(1420, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#16a085"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/President.jpg"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(60, 150, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        logo = new ImageIcon(getClass().getResource("/images/Honeymoon.jpg"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(500, 150, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        logo = new ImageIcon(getClass().getResource("/images/Double.jpg"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(940, 150, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);


        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 40);
        f2 = new Font("Segoe UI Black", Font.BOLD, 28);
        f3 = new Font("Segoe UI Semibold", Font.BOLD, 24);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Book Your Dream");
        label1.setBounds(530, 40, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        // Presidential Suites
        label1 = new JLabel();
        label1.setText("Presidential Suites");
        label1.setBounds(120, 400, 500, 50);
        label1.setFont(f2);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Cost: 1000$");
        label1.setBounds(180, 440, 500, 50);
        label1.setFont(f3);
        c.add(label1);

        // Honeymoon Suites
        label1 = new JLabel();
        label1.setText("Honeymoon Suites");
        label1.setBounds(570, 400, 500, 50);
        label1.setFont(f2);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Cost: 500$");
        label1.setBounds(630, 440, 500, 50);
        label1.setFont(f3);
        c.add(label1);

        // Double-Double
        label1 = new JLabel();
        label1.setText("Double-Double");
        label1.setBounds(1030, 400, 500, 50);
        label1.setFont(f2);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Cost: 100$");
        label1.setBounds(1090, 440, 500, 50);
        label1.setFont(f3);
        c.add(label1);



 


        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);
        jButtonGroup = new ButtonGroup();
        jButtonGroup.add(defPacks);
        jButtonGroup.add(selfChosenPacks);

        btn2 = new JButton("Back");
        btn2.setBounds(20, 600, 180, 40);
        btn2.setFont(f3);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#34495e"));
        c.add(btn2);

        btn3 = new JButton("Book Now");
        btn3.setBounds(60, 490, 400, 40);
        btn3.setFont(f3);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#34495e"));
        c.add(btn3);

        btn4 = new JButton("Book Now");
        btn4.setBounds(500, 490, 400, 40);
        btn4.setFont(f3);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#34495e"));
        c.add(btn4);

        btn5 = new JButton("Book Now");
        btn5.setBounds(940, 490, 400, 40);
        btn5.setFont(f3);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#34495e"));
        c.add(btn5);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);





        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Info frame = new Info();
                frame.setVisible(true);
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Info frame = new Info();
                frame.setVisible(true);
            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Info frame = new Info();
                frame.setVisible(true);
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == defPacks) {
                pack = 1;
            } else if (e.getSource() == selfChosenPacks) {
                pack = 2;
            }
        }
    }

    public static void main(String[] args) {

        Packs frame = new Packs();
        frame.setVisible(true);
    }
}