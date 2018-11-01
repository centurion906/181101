import javax.security.auth.kerberos.EncryptionKey;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;


public class Decrypt extends JFrame {
    Container cp;
    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    private JTextArea jtaR = new JTextArea("",30,15);
    private JTextArea jtaL = new JTextArea("",30,15);
    private JScrollPane jspR = new JScrollPane(jtaR);
    private JScrollPane jspL = new JScrollPane(jtaL);
    private JPanel jpnC = new JPanel(new GridLayout(9,1,5,5));
    private JPanel jpnR = new JPanel(new GridLayout(1,1,5,5));
    private JPanel jpnL = new JPanel(new GridLayout(1,1,5,5));
    private JLabel jlb = new JLabel("Method");
    private String methodStr [] = {"DES","AES","Caesar","XOR"};
    private JComboBox jcb = new JComboBox<String>(methodStr);
    private JLabel jlbpw = new JLabel("PassWord");
    private JTextField jtfKey = new JTextField();
    private JRadioButton jrbEncrypt = new JRadioButton("Encrypt");
    private JRadioButton jrbDecrypt = new JRadioButton("Decrypt");
    private JButton jbtRN = new JButton("Run");
    private JButton jbtCL = new JButton("Close");
    private JButton jbtClear = new JButton("Clear");
    private ButtonGroup buttonGroup = new ButtonGroup();
    private JMenuBar jmb = new JMenuBar();
    private JMenu jmf = new JMenu("File");
    private JMenu jmh = new JMenu("Help");
    private JMenuItem jmiOpen = new JMenuItem("OPEN");
    private JMenuItem jmiSave = new JMenuItem("SAVE");
    private JFileChooser jfc = new JFileChooser();
    Frame2 frm5;
    public Decrypt(Frame2 frm6){
        frm5 = frm6;
        ex1();
    }private void ex1(){
        this.setBounds(100,100,600,540);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                frm5.setVisible(true);
            }
        });
        this.setJMenuBar(jmb);
        cp = this.getContentPane();
        cp.add(jpnL, BorderLayout.WEST);
        cp.add(jpnC, BorderLayout.CENTER);
        cp.add(jpnR, BorderLayout.EAST);
        jpnL.add(jspL);
        jpnR.add(jspR);
        jpnC.add(jlb);
        jpnC.add(jcb);
        jpnC.add(jlbpw);
        jpnC.add(jtfKey);
        jpnC.add(jrbEncrypt);
        jpnC.add(jrbDecrypt);
        jpnC.add(jbtRN);
        jpnC.add(jbtClear);
        jpnC.add(jbtCL);
        jmb.add(jmf);
        jmb.add(jmh);
        jmf.add(jmiOpen);
        jmf.add(jmiSave);
        buttonGroup.add(jrbEncrypt);
        buttonGroup.add(jrbDecrypt);
        jmiOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (jfc.showOpenDialog(Decrypt.this)==JFileChooser.APPROVE_OPTION){
                        jtaL.setText("");
                        String str = "";
                        File selectFile = jfc.getSelectedFile();
                        FileReader fr = new FileReader("C:\\Users\\USER");
                        BufferedReader bufferedReader = new BufferedReader(fr);
                        while((str = bufferedReader.readLine())!=null){
                            jtaL.append(str);
                        }
                        fr.close();
                    }
                }catch (IOException ioe){
                    JOptionPane.showMessageDialog(Decrypt.this,"No File is not find");
                }
            }
        });
        jmiSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (jtaR.getText().length()>0){
                        jfc.setFileFilter(new FileNameExtensionFilter("txt.doc","txt","doc"));
                        if (jfc.showSaveDialog(Decrypt.this)==JFileChooser.APPROVE_OPTION){
                            String fileName = jfc.getSelectedFile().getPath()+jfc.getSelectedFile().getName()+"txt";
                            File selectFile = new File(fileName);
                            FileWriter fr = new FileWriter(selectFile);
                            BufferedWriter bufferedReader = new BufferedWriter(fr);
                            bufferedReader.write(jtaR.getText());
                            bufferedReader.close();
                        }else {
                            JOptionPane.showMessageDialog(Decrypt.this,"No file is not find");
                        }
                    }
                }catch (IOException ioe1){
                    JOptionPane.showMessageDialog(Decrypt.this,"Open file error" + ioe1.toString());
                }catch (Exception ioe2){
                    JOptionPane.showMessageDialog(Decrypt.this,"Error" + ioe2.toString());
                }
            }
        });
        jbtRN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jrbEncrypt.isSelected()){
                    int dataLength = jtaL.getText().length();
                    if (dataLength>0) {
                        switch (jcb.getSelectedIndex()) {
                            case 0:
                                JOptionPane.showMessageDialog(Decrypt.this, "Sorry" + jcb.getSelectedItem() + "not implement yet!");
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(Decrypt.this, "Sorry" + jcb.getSelectedItem() + "not implement yet!");
                                break;
                            case 2:
                                char data[] = jtaL.getText().toCharArray();
                                int key = Integer.parseInt(jtfKey.getText());
                                try {
                                    for (int i = 0; i < data.length; i++) {
                                        data[i] = (char) (data[i] + key);
                                    }
                                    jtaR.setText(new String(data));
                                } catch (NumberFormatException exp) {
                                    JOptionPane.showMessageDialog(Decrypt.this, "key is not Number");
                                } catch (Exception exp1) {
                                    JOptionPane.showMessageDialog(Decrypt.this, "Error" + exp1.toString());
                                }
                                break;
                            case 3:
                                char data1 [] = jtaL.getText().toCharArray();
                                char key1 [] = jtfKey.getText().toCharArray();
                                for (int i = 0; i < data1.length; i++){
                                    data1[i] = (char)((int)data1[i]^(int)key1[i%key1.length]);
                                }
                                jtaR.setText(new String(data1));
                                break;
                        }
                    }
                }else if (jrbDecrypt.isSelected()) {
                    int dataLength = jtaR.getText().length();
                    if (dataLength > 0) {
                        switch (jcb.getSelectedIndex()) {
                            case 0:
                                JOptionPane.showMessageDialog(Decrypt.this, "Sorry" + jcb.getSelectedItem() + "not implement yet!");
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(Decrypt.this, "Sorry" + jcb.getSelectedItem() + "not implement yet!");
                                break;
                            case 2:
                                char data[] = jtaR.getText().toCharArray();
                                int key = Integer.parseInt(jtfKey.getText());
                                try {
                                    for (int i = 0; i < data.length; i++) {
                                        data[i] = (char) (data[i] - key);
                                    }
                                    jtaL.setText(new String(data));
                                } catch (NumberFormatException exp) {
                                    JOptionPane.showMessageDialog(Decrypt.this, "key is not Number");
                                } catch (Exception exp1) {
                                    JOptionPane.showMessageDialog(Decrypt.this, "Error" + exp1.toString());
                                }
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(Decrypt.this, "Sorry" + jcb.getSelectedItem() + "not implement yet!");
                                break;
                        }
                    }
                }
            }
        });
        jbtClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaR.setText("");
                jtaL.setText("");
            }
        });
        jbtCL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame2 frm2 = new Frame2();
                frm2.setVisible(true);
                Decrypt.this.dispose();
            }
        });
    }
}