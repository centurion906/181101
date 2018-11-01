import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class barbar extends JFrame{
    private JButton jbtn1= new JButton("RUN");
    private JButton jbtn2= new JButton("↑");
    private JButton jbtn3= new JButton("↓");
    private JButton jbtn4= new JButton("←");
    private JButton jbtn5= new JButton("→");
    private JButton jbtn6= new JButton("EXIT");
    private JLabel jib = new JLabel();
    private Timer t1 ;
    private int dirFlag = 1, objx = 50, objy = 50, objw = 50, obje = 50;
    private ImageIcon icon = new ImageIcon("123.png");
    Frame2 frm11;
    public barbar(Frame2 frm12){
        frm11 = frm12;
        ex1();
    }public void ex1(){
        this.setBounds(300,300,800,700);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbtn1.setBounds(30,600,100,50);
        jbtn2.setBounds(150,600,100,50);
        jbtn3.setBounds(270,600,100,50);
        jbtn4.setBounds(390,600,100,50);
        jbtn5.setBounds(510,600,100,50);
        jbtn6.setBounds(630,600,100,50);
        jib.setBounds(100,100,174,190);
        jib.setIcon(icon);
        this.add(jbtn1);
        this.add(jbtn2);
        this.add(jbtn3);
        this.add(jbtn4);
        this.add(jbtn5);
        this.add(jbtn6);
        this.add(jib);
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag = 1;
            }
        });
        jbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag = 2;
            }
        });
        jbtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag = 3;
            }
        });
        jbtn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag = 4;
            }
        });
        t1 = new Timer(20, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (dirFlag){
                    case 1:
                        if (objy-2>0){
                            objy-=2;
                            break;}
                    case 2:
                        if (objy+2<310){
                            objy+=2;
                            break;}
                    case 3 :
                        if (objx-2>0){
                            objx-=2;
                            break;}
                    case 4:
                        if (objx+2<626){
                            objx+=2;
                            break; }
                }
                jib.setLocation(objx,objy);
            }
        });
        jbtn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame2 frm2 = new Frame2();
                frm2.setVisible(true);
                barbar.this.dispose();
            }
        });
    }
}