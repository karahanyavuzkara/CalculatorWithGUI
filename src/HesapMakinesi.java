import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HesapMakinesi implements ActionListener{
    JTextField kutucuk1,kutucuk2,kutucuk3;
    JButton toplama,islem1,islem2,islem3,islem4;
    HesapMakinesi(){
        JFrame frame= new JFrame("Hesap Makinesi");
        kutucuk1=new JTextField();
        kutucuk1.setBounds(50,50,150,20);
        kutucuk2=new JTextField();
        kutucuk2.setBounds(50,100,150,20);
        kutucuk3=new JTextField();
        kutucuk3.setBounds(50,150,150,20);
        kutucuk3.setEditable(false);
        toplama=new JButton("TOPLAMA");
        toplama.setBounds(50,200,250,50);
        islem1=new JButton("ÇIKARMA");
        islem1.setBounds(50,250,250,50);
        islem2=new JButton("ÇARPMA");
        islem2.setBounds(50,300,250,50);
        islem3=new JButton("BÖLME");
        islem3.setBounds(50,350,250,50);

        toplama.addActionListener(this);
        islem1.addActionListener(this);
        islem2.addActionListener(this);
        islem3.addActionListener(this);

        frame.add(kutucuk1);
        frame.add(kutucuk2);
        frame.add(kutucuk3);
        frame.add(toplama);
        frame.add(islem1);
        frame.add(islem2);
        frame.add(islem3);

        frame.setSize(400,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String sayi1=kutucuk1.getText();
        String sayi2=kutucuk2.getText();
        double num1=Double.parseDouble(sayi1);
        double num2=Double.parseDouble(sayi2);
        double result=0.0;
        if(e.getSource()==toplama){
            result=num1+num2;
        }
        else if(e.getSource()==islem1){
            result=num1-num2;
        }
        else if(e.getSource()==islem2){
            result=num1*num2;
        }
        else if(e.getSource()==islem3){
            result=num1/num2;
        }
        String sonuc=""+result;
        kutucuk3.setText(sonuc);
    }
    public static void main(String[] args) {
        new HesapMakinesi();
    } }