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
    private JMenuItem jiHappy = new JMenuItem("HappySwimming");
    private JMenuItem jiKBC = new JMenuItem("KeyboardControl");
    private JMenuItem jiDecrypt = new JMenuItem("Decrypt");
    private JMenuItem jiFileDecrypt = new JMenuItem("File-Decrypt");
    private JMenuItem jiDigitalTimer = new JMenuItem("DigitalTimer");
    private JMenuItem jiServer = new JMenuItem("URLServer");
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
        jmg.add(jiKBC);
        jmg.add(jibarbar);
        jmg.add(jiHappy);
        jmt.add(jiDecrypt);
        jmt.add(jiFileDecrypt);
        jmt.add(jiDigitalTimer);
        jmt.add(jiServer);
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
        jiServer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                URLServer urs = new URLServer(Frame2.this);
                urs.setVisible(true);
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
        jiHappy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HappySwimming hsm = new HappySwimming(Frame2.this);
                hsm.setVisible(true);
                Frame2.this.setVisible(false);
            }
        });
        jiKBC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KeyboardControl kbc = new KeyboardControl(Frame2.this);
                kbc.setVisible(true);
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