import javax.swing.*;
import java.awt.*;

public class Controlpanel1 extends JFrame 
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30;
	JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9;;
	Font f1,f2,f3,f4,f5;
	Icon i1,i2,i3,i4,i5,i6,i7,i8,i9;
	JPanel syssec;

	Controlpanel1()
	{
		f1=new Font("", Font.PLAIN, 16);
		f2=new Font("", Font.PLAIN, 17);
		f3=new Font("", Font.PLAIN, 12);
		
		l1=new JLabel("Adjust your computer's settings");
		l1.setBounds(290,80,250,25);
		l1.setFont(f1);
		l1.setForeground(Color.blue);
		add(l1);
		
		syssec=new JPanel();
		syssec.setBounds(300,135,355,90);
		syssec.setLayout(new FlowLayout());
	//	syssec.setBackground(Color.white);
		add(syssec);
	
		i1=new ImageIcon("se.gif");
		m1=new JLabel(i1);
		m1.setBounds(298,145,60,60);
		syssec.add(m1);
		l2=new JLabel("System and Security");
		l2.setBounds(370,140,220,25);
		l2.setFont(f2);
		l2.setForeground(Color.red);
		syssec.add(l2);
		l3=new JLabel("Review your computer's status");
		l3.setBounds(371,160,260,25);
		l3.setFont(f3);
		l3.setForeground(Color.blue);
		syssec.add(l3);
		l4=new JLabel("Save backup copies of your files with File History");
		l4.setBounds(371,180,300,25);
		l4.setFont(f3);
		l4.setForeground(Color.blue);
		syssec.add(l4);
		l5=new JLabel("Find and fix problems");
		l5.setBounds(371,200,250,25);
		l5.setFont(f3);
		l5.setForeground(Color.blue);
		syssec.add(l5);
		
		
		i2=new ImageIcon("net.gif");
		m2=new JLabel(i2);
		m2.setBounds(300,235,60,60);
		add(m2);
		l6=new JLabel("Network and Internet");
		l6.setBounds(370,230,200,25);
		l6.setFont(f2);
		l6.setForeground(Color.red);
		add(l6);
		l7=new JLabel("Connect to Internet");
		l7.setBounds(371,250,200,25);
		l7.setFont(f3);
		l7.setForeground(Color.blue);
		add(l7);
		l8=new JLabel("View networks status and tasks");
		l8.setBounds(371,270,300,25);
		l8.setFont(f3);
		l8.setForeground(Color.blue);
		add(l8);
		l9=new JLabel("Choose homegroup and sharing option");
		l9.setBounds(371,290,300,25);
		l9.setFont(f3);
		l9.setForeground(Color.blue);
		add(l9);
		
		
		i3=new ImageIcon("sound.gif");
		m3=new JLabel(i3);
		m3.setBounds(300,328,60,60);
		add(m3);
		l10=new JLabel("Hardware and Sound");
		l10.setBounds(370,320,200,25);
		l10.setFont(f2);
		l10.setForeground(Color.red);
		add(l10);
		l11=new JLabel("View devices and printers");
		l11.setBounds(371,340,250,25);
		l11.setFont(f3);
		l11.setForeground(Color.blue);
		add(l11);
		l12=new JLabel("Add a device");
		l12.setBounds(371,360,150,25);
		l12.setFont(f3);
		l12.setForeground(Color.blue);
		add(l12);
		l13=new JLabel("Adjust commonly used mobility settings");
		l13.setBounds(371,380,300,25);
		l13.setFont(f3);
		l13.setForeground(Color.blue);
		add(l13);
		
		
		i4=new ImageIcon("proga.gif");
		m4=new JLabel(i4);
		m4.setBounds(302,415,60,60);
		add(m4);
		l14=new JLabel("Programs");
		l14.setBounds(370,410,100,25);
		l14.setFont(f2);
		l14.setForeground(Color.red);
		add(l14);
		l15=new JLabel("Uninstall a program");
		l15.setBounds(371,430,150,25);
		l15.setFont(f3);
		l15.setForeground(Color.blue);
		add(l15);
		
		i5=new ImageIcon("user.gif");
		m5=new JLabel(i5);
		m5.setBounds(730,140,60,60);
		add(m5);
		l16=new JLabel("User Accounts and Family Safety");
		l16.setBounds(800,140,270,25);
		l16.setFont(f2);
		l16.setForeground(Color.red);
		add(l16);
		l17=new JLabel("Change account type");
		l17.setBounds(801,160,260,25);
		l17.setFont(f3);
		l17.setForeground(Color.blue);
		add(l17);
		l18=new JLabel("Set up Family Safety for any user");
		l18.setBounds(801,180,300,25);
		l18.setFont(f3);
		l18.setForeground(Color.blue);
		add(l18);

		i6=new ImageIcon("pera.gif");
		m6=new JLabel(i6);
		m6.setBounds(730,220,60,60);
		add(m6);
		l19=new JLabel("Appearance and Personalization");
		l19.setBounds(800,210,270,25);
		l19.setFont(f2);
		l19.setForeground(Color.red);
		add(l19);
		l20=new JLabel("Change the theme");
		l20.setBounds(801,230,260,25);
		l20.setFont(f3);
		l20.setForeground(Color.blue);
		add(l20);
		l21=new JLabel("Change desktop background");
		l21.setBounds(801,250,300,25);
		l21.setFont(f3);
		l21.setForeground(Color.blue);
		add(l21);
		l22=new JLabel("Adjust screen resolution");
		l22.setBounds(801,270,300,25);
		l22.setFont(f3);
		l22.setForeground(Color.blue);
		add(l22);
		
		i7=new ImageIcon("clock.gif");
		m7=new JLabel(i7);
		m7.setBounds(725,304,70,70);
		add(m7);
		l23=new JLabel("Clock, Language, and Region");
		l23.setBounds(800,300,270,25);
		l23.setFont(f2);
		l23.setForeground(Color.red);
		add(l23);
		l24=new JLabel("Add a language");
		l24.setBounds(801,320,260,25);
		l24.setFont(f3);
		l24.setForeground(Color.blue);
		add(l24);
		l25=new JLabel("Change input methods");
		l25.setBounds(801,340,300,25);
		l25.setFont(f3);
		l25.setForeground(Color.blue);
		add(l25);
		l26=new JLabel("Change date, time, or number formats");
		l26.setBounds(801,360,300,25);
		l26.setFont(f3);
		l26.setForeground(Color.blue);
		add(l26);
		
		i8=new ImageIcon("ease.gif");
		m8=new JLabel(i8);
		m8.setBounds(725,387,70,70);
		add(m8);
		l27=new JLabel("Ease of Access");
		l27.setBounds(800,390,270,25);
		l27.setFont(f2);
		l27.setForeground(Color.red);
		add(l27);
		l28=new JLabel("Let Windows suggest settings");
		l28.setBounds(801,410,260,25);
		l28.setFont(f3);
		l28.setForeground(Color.blue);
		add(l28);
		l29=new JLabel("Optimize visual display");
		l29.setBounds(801,430,300,25);
		l29.setFont(f3);
		l29.setForeground(Color.blue);
		add(l29);
		
		
		
		
		
		
		
		Container c=this.getContentPane();
		c.setBackground(Color.white);

		setSize(1368,720);
		setLayout(null);
		syssec.setVisible(true);
		setVisible(true);

	
	}
	public static void main(String[] args) 
	{
		new Controlpanel1();
	}
}
