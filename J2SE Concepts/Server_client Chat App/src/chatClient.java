import  java.awt.*;
import  javax.swing.*;
import  java.awt.event.*;
import  java.util.*;
import  java.lang.*;
import  java.net.*;
import  java.io.*;

class ChatClient extends JFrame implements ActionListener, Runnable
{
	JTextField tf1 ; 
	JTextArea ta1;
	JScrollPane p1;
	JButton b1; 
	
	ServerSocket ss ; 
	Socket s1 ;
	PrintWriter pw ; 
	BufferedReader br ; 
	
	public ChatClient() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		tf1 = new JTextField();
		ta1 = new JTextArea();
		p1 = new JScrollPane(ta1);
		b1 = new JButton("Send");
		
		add(b1);
		add(tf1);
		add(p1);
		
		tf1.setBounds(30, 20, 150, 30);
		b1.setBounds(190, 20, 70, 30);
		p1.setBounds(30, 60, 230, 200);
		
		try 
		{
			//ss = new ServerSocket(5000);//Only For server
			//s1 = ss.accept();//Only For server
			s1 = new Socket(InetAddress.getByName("192.168.43.65"),5000); // Only For Client
			pw = new PrintWriter(s1.getOutputStream(),true);
			br = new BufferedReader
				(new InputStreamReader(s1.getInputStream()));
		} 
		catch (Exception e) 
		{
		}		
		
		setTitle("Chat Client");
		setSize(300,350);
		setVisible(true);
		b1.addActionListener(this);
		tf1.addActionListener(this);
		new Thread(this).start();
	}
	public void run()
	{
		while(true)
		{
			// Read data from Buffer 
			try 
			{
				Calendar cal = Calendar.getInstance();
				int y = cal.get(Calendar.YEAR);
				int m = cal.get(Calendar.MONTH);
				int d = cal.get(Calendar.DATE);
				int h = cal.get(Calendar.HOUR);
				int mi = cal.get(Calendar.MINUTE);
				int s = cal.get(Calendar.SECOND);
				String time = d+"/"+m+"/"+y+"  "+h+":"+mi+":"+s; 
			
				String text = br.readLine();
				ta1.append(text +"\t"+  time+" -Sender\n");
			} 
			catch (Exception e) 
			{
			}
		}
	}
	public static void main(String[] args) 
	{
		new ChatClient();
	}
	public void actionPerformed(ActionEvent e) 
	{
		 // write data into Buffer 
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH);
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		String time = d+"/"+m+"/"+y+"  "+h+":"+mi+":"+s; 
				
		String text = tf1.getText();
		pw.println (text);
		tf1.setText("");
		ta1.append(text +"\t"+  time+" -Me\n");
	}
}




