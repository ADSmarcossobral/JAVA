package inf008.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JProfessorFrame extends JFrame implements ActionListener {
	
	private JButton buttonOk;
	private JButton buttonCancel;
	private JPanel south;
	private JPanel center;
	private JLabel label;
	private JTextField text;

	public void asm(){
		this.label = new JLabel("Mensagem: ");
		this.text = new JTextField();
		this.text.setSize(70, 20);
		this.buttonOk = new JButton("OK");
		this.buttonCancel = new JButton("Cancel");
		this.south = new JPanel();
		this.south.setLayout(new FlowLayout());
		this.south.add(this.buttonOk);
		this.south.add(this.buttonCancel);
		this.center = new JPanel();
		this.center.setLayout(new GridLayout(2,1));
		this.center.add(this.label);
		this.center.add(this.text);
		this.buttonOk.addActionListener(this);
		
		this.setTitle("Professor");
		this.setSize(400, 400);
		this.setLayout(new GridLayout(2,1));
		this.add(this.south, BorderLayout.SOUTH);
		this.add(this.center, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		(new JProfessorFrame()).asm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//
	}
	
}
