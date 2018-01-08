package store;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import store.StoreModel;

public class KundBtn extends JButton {
	
		public KundBtn(){
			super("lägg till kund");
			
			this.addActionListener(new KundListener());
			
		}

		private class KundListener implements ActionListener { 
			
			
			public void actionPerformed(ActionEvent e) {
					
				
				
				
				System.out.println("hejs");
			
			}
		}
}
		

	
		

