package inf008.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JProfessorFrame extends JFrame {
	
	private JButton button;

	public void asm(){
		this.button = new JButton("OK");
		this.setTitle("Professor");
		this.setSize(400, 400);
		this.add(this.button, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		(new JProfessorFrame()).asm();
	}
	
}
