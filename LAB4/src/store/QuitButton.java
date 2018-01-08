package store;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class QuitButton extends JButton {

	public QuitButton(){
		super("quit");
		this.addActionListener(new QuitListener());
	}
	private class QuitListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(ABORT);;
		}
}
}