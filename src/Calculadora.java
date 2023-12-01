import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener{
	
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn0 = new JButton("0");
	
	JTextField txtcampo = new JTextField();
	
	JButton btnDiv = new JButton("/");
	JButton btnMulti = new JButton("x");
	JButton btnSub = new JButton("-");
	JButton btnSoma = new JButton("+");
	JButton btnIgual = new JButton("=");
	JButton btnExit = new JButton("clear");

 public Calculadora() {
	 
	    btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn0.addActionListener(this);
		btnDiv.addActionListener(this);
		btnMulti.addActionListener(this);
		btnSub.addActionListener(this);
		btnSoma.addActionListener(this);
		btnIgual.addActionListener(this);
		btnExit.addActionListener(this);
	 
	    setLayout(null);
		btn1.setBounds(40, 90, 50, 40);
		btn1.setBackground(Color.white);
		btn2.setBounds(110, 90, 50, 40);
		btn2.setBackground(Color.white);
		btn3.setBounds(180,  90, 50, 40);
		btn3.setBackground(Color.white);
		btn4.setBounds(40,  150, 50, 40);
		btn4.setBackground(Color.white);
		btn5.setBounds(110, 150, 50, 40);
		btn5.setBackground(Color.white);
		btn6.setBounds(180, 150, 50, 40);
		btn6.setBackground(Color.white);
		btn7.setBounds(40, 210, 50, 40);
		btn7.setBackground(Color.white);
		btn8.setBounds(110, 210, 50, 40);
		btn8.setBackground(Color.white);
		btn9.setBounds(180, 210, 50, 40);
		btn9.setBackground(Color.white);
		btn0.setBounds(90, 270, 50, 40);
		btn0.setBackground(Color.white);
		
		btnDiv.setBounds(280, 30, 50, 40);
		btnDiv.setBackground(Color.white);
		btnMulti.setBounds(280, 89, 50, 40);
		btnMulti.setBackground(Color.white);
		btnSub.setBounds(280, 148, 50, 40);
		btnSub.setBackground(Color.white);
		btnSoma.setBounds(280, 210, 50, 40);
		btnSoma.setBackground(Color.white);
		btnIgual.setBounds(280, 270, 50, 40);
		btnIgual.setBackground(Color.white);
		txtcampo.setBounds(40, 35 , 200, 30);
		txtcampo.setBackground(Color.white);
		
		btnExit.setBounds(150,270,70, 40);
		btnExit.setBackground(Color.red);
		
		add(btn1); 
		add(btn2); 
		add(btn3); 
		add(btn4); 
		add(btn5); 
		add(btn6); 
		add(btn7); 
		add(btn8); 
		add(btn9); 
		add(btn0); 
		
		add(txtcampo);
		
		add(btnDiv);
		add(btnMulti);
		add(btnSub);
		add(btnSoma);
		add(btnIgual);
		add(btnExit);
		
		Container fundo = getContentPane();
		fundo.setBackground(Color.black);
		
		txtcampo.setEditable(false);
		txtcampo.setText(txtcampo.getText() + "");
		
		
		
		// JFrame
		setTitle("Calculadora");
		setSize(380, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		
	}
 
 
 public static void main(String[] args) {
		new Calculadora();
	}
//}
@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == btn1) {
		txtcampo.setText(txtcampo.getText() + "1");
	}
	
	if(e.getSource() == btn2) {
		txtcampo.setText(txtcampo.getText() + "2");
	}
	
	if(e.getSource() == btn3) {
		txtcampo.setText(txtcampo.getText() + "3");
	}
	
	if(e.getSource() == btn4) {
		txtcampo.setText(txtcampo.getText() + "4");
	}
	
	if(e.getSource() == btn5) {
		txtcampo.setText(txtcampo.getText() + "5");
	}
	
	if(e.getSource() == btn6) {
		txtcampo.setText(txtcampo.getText() + "6");
	}
	
	if(e.getSource() == btn7) {
		txtcampo.setText(txtcampo.getText() + "7");
	}
	
	if(e.getSource() == btn8) {
		txtcampo.setText(txtcampo.getText() + "8");
	}
	
	if(e.getSource() == btn9) {
		txtcampo.setText(txtcampo.getText() + "9");
	}
	
	if(e.getSource() == btn0) {
		txtcampo.setText(txtcampo.getText() + "0");
	}
	
	if(e.getSource() == btnDiv) {
		txtcampo.setText(txtcampo.getText() + " / ");
	}
	
	if(e.getSource() == btnMulti) {
		txtcampo.setText(txtcampo.getText() + " * ");
	}
	
	if(e.getSource() == btnSub) {
		txtcampo.setText(txtcampo.getText() + " - ");
	}
	
	if(e.getSource() == btnSoma) {
		txtcampo.setText(txtcampo.getText() + " + ");
	}
	
	if(e.getSource() == btnIgual) {
		
	}
	
	
	if(e.getSource() == btnExit) {
		txtcampo.setText("");
	}
	
	
	

}

}
