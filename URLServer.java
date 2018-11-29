import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.net.Socket;

public class URLServer extends JFrame {
    private JButton jbtn = new JButton("送出");
    Frame2 frm17;
    public URLServer(Frame2 frm18){
        frm17 = frm18;
        ex();
    }private void ex(){
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                frm17.setVisible(true);
            }
        });
        this.setBounds(100,100,500,400);
        this.add(jbtn);
        jbtn.setBounds(50,50,100,20);
        byte buff[] = new byte[1024];
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.out.println("正在與伺服器連線...");
                    Socket s = new Socket("10.51.3.127",2525);
                    System.out.println("已經與伺服器取得連線...");
                    InputStream in = s.getInputStream();
                    int n = in.read(buff);
                    System.out.print("從伺服端收到:");
                    System.out.println(new String(buff,0,n));
                    in.close();
                    s.close();
                }catch (Exception ioe){
                    System.out.println("發生了"+ioe+"例外");
                }
            }
        });
    }
}
