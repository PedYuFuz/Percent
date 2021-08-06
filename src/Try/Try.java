package Try;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Try extends JFrame implements ActionListener{
	
	JButton b = new JButton("Result");
	JTextField text = new JTextField();
	String[] numSplitted = new String[2];
	JLabel end = new JLabel("aa");
	int n1=0,n2=0;
	double res=0;
	String num="12/31";
	
	public Try() {
		setLayout(new GridLayout(3,1));
		
		add(text);		
		add(b);
		add(end);
		b.addActionListener(this);		
		
		
		
		setTitle("Click this button");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public void window() {
		setTitle("Click this button");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		add(text);
		
	}
	
	public void textField() {
		
		
	}
	
	public void button() {
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			try{num = text.getText();
			numSplitted = num.split("/"); 
			res = (Double.parseDouble(numSplitted[0]) / Double.parseDouble(numSplitted[1]))*100;
			int value = (int)res;
			end.setText(String.valueOf(value)+"%");
			
			}catch(Exception erro) {}
			
			
			
			System.out.println(numSplitted.length);
			
			for(int i=0;i<numSplitted.length;i++) {
				System.out.println(numSplitted[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		new Try();
	}
	

}