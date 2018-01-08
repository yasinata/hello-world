package store;


	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JLabel;

	public class PopButton extends JButton{
		//private JLabel label;
		
		public PopButton(/*JLabel push*/){
			super("Pop");
			//label = push;
			this.addActionListener(new PushListener());
		}
		private class PushListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				System.out.println("popped");
			}
		}
	}

