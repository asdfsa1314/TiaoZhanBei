import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Main {
    public static void main(String[] args){
        init();
    }
    /** 作者：张钰鹭
     * 具体框架的制作
     */
    public static void init(){
        JFrame frame = new JFrame();int with = 300, higth = 450;
        frame.setSize(with,higth);frame.setBackground(Color.white);frame.setResizable(false);frame.setLayout(null);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) { super.windowClosing(e);System.exit(0); }});

        JTextField tf1 = new JTextField("C:\\Users\\asdfsa\\Desktop\\周美君.JPG");tf1.setBounds(75, 52, 150, 46);
        JTextField tf2 = new JTextField("输入图片宽度");tf2.setBounds(75, 100, 75, 35);
        JTextField tf3 = new JTextField("输入图片高度");tf3.setBounds(75, 142, 75, 35);
        JTextField tf4 = new JTextField("输入图片的输出路径");tf4.setBounds(75, 192, 150, 35);

        JButton b1= new JButton("改变图片大小");b1.setBackground(Color.ORANGE);b1.setBounds(170, 300,80, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = tf1.getText();String width = tf2.getText();String heigh = tf3.getText();String out = tf4.getText();
                try { ZhuanHuan.resizeImage(input,input,Integer.parseInt(width),Integer.parseInt(heigh)); }
                catch (IOException ioException) { ioException.printStackTrace(); }

                ZhuanHuan.markImageBySingleIcon("src/flag.png",
                input, out,"WoAiGuo","JPG",null);
            }
        });
        frame.setVisible(true);
        frame.add(tf1);frame.add(tf2);frame.add(tf3);frame.add(tf4);frame.add(b1);
    }
}
