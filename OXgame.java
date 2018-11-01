import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OXgame extends JFrame {
    private Container cp;
    private JPanel jpn = new JPanel(new GridLayout(3, 3, 3, 3));
    private JLabel jlb = new JLabel();
    private JButton jbtn1 = new JButton();
    private JButton jbtn2 = new JButton();
    private JButton jbtn3 = new JButton();
    private JButton jbtn4 = new JButton();
    private JButton jbtn5 = new JButton();
    private JButton jbtn6 = new JButton();
    private JButton jbtn7 = new JButton();
    private JButton jbtn8 = new JButton();
    private JButton jbtn9 = new JButton();
    private int x = 0;
    Frame2 frm3;
    public OXgame(Frame2 frm4) {
        ex();
        frm3 = frm4;
    }
    private void ex() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setBounds(100, 150, 600, 500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                frm3.setVisible(true);
            }
        });
        cp = this.getContentPane();
        cp.add(jlb, BorderLayout.NORTH);
        cp.add(jpn, BorderLayout.CENTER);
        jlb.setFont(new Font(null, Font.BOLD, 50));
        jlb.setBackground(new Color(255, 193, 244));
        jlb.setOpaque(true);
        jpn.add(jbtn1);
        jpn.add(jbtn2);
        jpn.add(jbtn3);
        jpn.add(jbtn4);
        jpn.add(jbtn5);
        jpn.add(jbtn6);
        jpn.add(jbtn7);
        jpn.add(jbtn8);
        jpn.add(jbtn9);
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("O");
                } else {
                    tembtn.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("O");
                } else {
                    tembtn.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("O");
                } else {
                    tembtn.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("O");
                } else {
                    tembtn.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("O");
                } else {
                    tembtn.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("O");
                } else {
                    tembtn.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("O");
                } else {
                    tembtn.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("O");
                } else {
                    tembtn.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
        jbtn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tembtn.setText("O");
                } else {
                    tembtn.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                check();
            }
        });
    }
    private void check(){
        if (jbtn1.getText().equals(jbtn2.getText())&&jbtn2.getText().equals(jbtn3.getText())&&!jbtn1.getText().equals("")) {
            if (jbtn1.getText().equals("0")) {
                jlb.setText("player1 win");
            } else {
                jlb.setText("player2 win");
            }
        }
        if (jbtn4.getText().equals(jbtn5.getText())&&jbtn5.getText().equals(jbtn6.getText())&&!jbtn4.getText().equals("")) {
            if (jbtn4.getText().equals("0")) {
                jlb.setText("player1 win");
            } else {
                jlb.setText("player2 win");
            }
        }
        if (jbtn7.getText().equals(jbtn8.getText())&&jbtn8.getText().equals(jbtn9.getText())&&!jbtn7.getText().equals("")) {
            if (jbtn1.getText().equals("0")) {
                jlb.setText("player1 win");
            } else {
                jlb.setText("player2 win");
            }
        }
        if (jbtn1.getText().equals(jbtn4.getText())&&jbtn4.getText().equals(jbtn7.getText())&&!jbtn1.getText().equals("")) {
            if (jbtn1.getText().equals("0")) {
                jlb.setText("player1 win");
            } else {
                jlb.setText("player2 win");
            }
        }
        if (jbtn2.getText().equals(jbtn5.getText())&&jbtn5.getText().equals(jbtn8.getText())&&!jbtn2.getText().equals("")) {
            if (jbtn2.getText().equals("0")) {
                jlb.setText("player1 win");
            } else {
                jlb.setText("player2 win");
            }
        }
        if (jbtn3.getText().equals(jbtn6.getText())&&jbtn6.getText().equals(jbtn9.getText())&&!jbtn3.getText().equals("")) {
            if (jbtn3.getText().equals("0")) {
                jlb.setText("player1 win");
            } else {
                jlb.setText("player2 win");
            }
        }
        if (jbtn1.getText().equals(jbtn5.getText())&&jbtn5.getText().equals(jbtn9.getText())&&!jbtn1.getText().equals("")) {
            if (jbtn1.getText().equals("0")) {
                jlb.setText("player1 win");
            } else {
                jlb.setText("player2 win");
            }
        }if (jbtn3.getText().equals(jbtn5.getText())&&jbtn5.getText().equals(jbtn7.getText())&&!jbtn3.getText().equals("")) {
            if (jbtn3.getText().equals("0")) {
                jlb.setText("player1 win");
            } else {
                jlb.setText("player2 win");
            }
        }
    }
}