package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class signup extends JFrame {

	JTextField textname, textfname;
	JDateChoser 

	Random ran = new Random();
	long first4 = (ran.nextLong() % 9000L);
	String first = " "+ Math.abs(first4);

	signup(){
		super("APPLICATION FORM");
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel image= new JLabel(i3);
		image.setBounds(25,10,100,100);
		add(image);

		JLabel label1= new JLabel("Application Form NO" + first);
		label1.setBounds(160,20,600,38);
		label1.setFont(new Font("Raleway",Font.BOLD,38));
		add(label1);

		JLabel label2= new JLabel("Page 1");
		label2.setBounds(330,70,600,30);
		label2.setFont(new Font("Raleway",Font.BOLD,22));
		add(label2);

		JLabel label3= new JLabel("Personal Details");
		label3.setBounds(290,90,600,38);
		label3.setFont(new Font("Raleway",Font.BOLD,22));
		add(label3);

		JLabel labelname= new JLabel("Name :");
		labelname.setBounds(100,190,100,30);
		labelname.setFont(new Font("Raleway",Font.BOLD,20));
		add(labelname);

		textname = new JTextField();
		textname.setFont(new Font("Raleway",Font.BOLD,14));
		textname.setBounds(300,190,400,30);
		add(textname);

		JLabel labelfname= new JLabel("Father's Name :");
		labelfname.setBounds(100,240,200,30);
		labelfname.setFont(new Font("Raleway",Font.BOLD,20));
		add(labelfname);

		textfname = new JTextField();
		textfname.setFont(new Font("Raleway",Font.BOLD,14));
		textfname.setBounds(300,240,400,30);
		add(textfname);

		JLabel dob= new JLabel("Date of Birth :");
		dob.setBounds(100,340,200,30);
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		add(dob);












		getContentPane().setBackground((new Color(222,255,228)));
		setLayout(null);
		setSize(850,800);
		setLocation(360,40);
		setVisible(true);

	}
	public static void main(String[] args) {

		new signup();

	}
}
