import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends JFrame{
    Container cp;
    private JMenuBar jmb = new JMenuBar();
    private JMenu jmf = new JMenu("File");
    private JMenu jmt = new JMenu("Tool");
    private JMenu jmg = new JMenu("Game");
    private JMenu jmh = new JMenu("Help");
    private JMenuItem jio = new JMenuItem("Open");
    private JMenuItem jic = new JMenuItem("Close");
    private JMenuItem jie = new JMenuItem("Exit");
    private JMenuItem jiOX = new JMenuItem("0Xgame");
    private JMenuItem jibarbar = new JMenuItem("barbar");
    private JMenuItem jiDecrypt = new JMenuItem("Decrypt");
    private JMenuItem jiFileDecrypt = new JMenuItem("File-Decrypt");
    private JMenuItem jiDigitalTimer = new JMenuItem("DigitalTimer");
    public Frame2(){
        ex2();
    }
    private void ex2(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(100,100,980,600);
        this.setJMenuBar(jmb);
        jmb.add(jmf);
        jmb.add(jmt);
        jmb.add(jmg);
        jmb.add(jmh);
        jmf.add(jio);
        jmf.add(jic);
        jmf.add(jie);
        jmg.add(jiOX);
        jmg.add(jibarbar);
        jmt.add(jiDecrypt);
        jmt.add(jiFileDecrypt);
        jmt.add(jiDigitalTimer);
        jiOX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OXgame game = new OXgame(Frame2.this);
                game.setVisible(true);
                Frame2.this.setVisible(false);
            }
        });
        jiDecrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Decrypt dec = new Decrypt(Frame2.this);
                dec.setVisible(true);
                Frame2.this.setVisible(false);
            }
        });
        jiFileDecrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileDecrypt fid = new FileDecrypt(Frame2.this);
                fid.setVisible(true);
                Frame2.this.setVisible(false);
            }
        });
        jiDigitalTimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DigitalTimer dig = new DigitalTimer(Frame2.this);
                dig.setVisible(true);
                Frame2.this.setVisible(false);
            }
        });
        jibarbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                barbar bar = new barbar(Frame2.this);
                bar.setVisible(true);
                Frame2.this.setVisible(false);
            }
        });
        jie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}