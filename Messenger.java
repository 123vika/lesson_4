import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Messenger extends JFrame {
    public static void main(String[] args) {
        new Messenger();
    }
    public Messenger(){
        JFrame frame = new JFrame();
        setLayout(new BorderLayout());

        setBounds(200,400,400,400);
        setTitle(" Messenger ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       // JTextField jtf2 = new JTextField("messege after send");
        JTextArea jtf2 = new JTextArea();

        jtf2.setPreferredSize(new Dimension(200,250));
        add(jtf2,BorderLayout.NORTH);


        JTextField jtf = new JTextField();
      //  JTextArea jtf = new JTextArea();

        jtf.setPreferredSize(new Dimension(200,100));
        add(jtf,BorderLayout.CENTER);


        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(" Your message: " + jtf.getText());



                String text = jtf.getText();
             //   jtf2.textarea.append(text + newline);
              //  jtf2.setText(text+"\n");

                jtf2.append(text+"\n");

                jtf.setText("");


               // jtf2.a
            }
        });


        JButton jb = new JButton(" SEND ");
        jb.setPreferredSize(new Dimension(200,70));
        add(jb,BorderLayout.SOUTH);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println(jtf);
                System.out.println(" Your message: " + jtf.getText());

                String text = jtf.getText();
                //   jtf2.textarea.append(text + newline);
                //  jtf2.setText(text+"\n");

                jtf2.append(text+"\n");

                jtf.setText(" ");

            }
        });





        setVisible(true);
    }

}




