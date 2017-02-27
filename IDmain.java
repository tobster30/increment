import javax.swing.JFrame;

import java.awt.Color;

public class IDmain {
	
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame("Increment/Decrement");
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		IDpanel panel1 = new IDpanel();

		myFrame.setContentPane(panel1);		
		
		//myFrame.pack();
		
		myFrame.setVisible(true);
		myFrame.setSize(400,100);
		myFrame.getContentPane().setBackground(Color.ORANGE);

		
		
		
	}

}
