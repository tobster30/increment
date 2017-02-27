import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class IDpanel extends JPanel 
{
	private double total;
	private JButton btnIncrement, btnDecrement;	
	private JLabel label;
	
	public IDpanel()
	{
		
		total = 50;
		
		btnIncrement = new JButton("Increment");
		btnDecrement = new JButton("Decrement");
		
		btnIncrement.addActionListener(new ButtonListener());
		btnDecrement.addActionListener(new ButtonListener());

		
		label = new JLabel("Total: " + total);
		
		add(label);
		add(btnIncrement);
		add(btnDecrement);	
		
	}
	
private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == btnIncrement)
			{
				total++;
				label.setText("Pushes: " + total);
			}
			else 
			{
				total--;
				label.setText("Pushes: " + total);
			}   
		}
	}
}
