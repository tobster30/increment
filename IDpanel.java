import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class IDpanel extends JPanel {
	
	double total = 50;
	JButton btnIncrement, btnDecrement;	
	
	public IDpanel()
	{
		
		btnIncrement = new JButton("Increment");
		btnDecrement = new JButton("Decrement");
		
		add(btnIncrement);
		add(btnDecrement);
		
		
	}

}
