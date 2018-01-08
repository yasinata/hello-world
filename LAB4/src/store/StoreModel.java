package store;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ColorModel;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StoreModel extends JFrame implements ActionListener{
	
		//attributes 
	private DefaultListModel<Person> waitQM; 
	private JList<Person> waitQ; ;
	private DefaultListModel<Person> inLineQM1;
	private JList<Person> inLineQ1;
	private DefaultListModel<Person> inLineQM2;
	private JList<Person> inLineQ2;
	
	private JFrame SFrame;
	private JTextField tk,tnr;
	private JLabel errorLabel;
	private JButton push, push2;
	private JButton pop, pop2; 
	private JButton quit; 
	private JButton kund; 

	
	private JPanel QPanel, SPanel, MPanel, M1Panel, M2Panel, M1GPanel, M2GPanel;
	private static final int HEIGHT = 600, WIDTH= 800;
 	
		//constructor 
	public StoreModel(){
		/*i had a problem with the action listeners because i started the constructor with the wrong code, 
		 * static  string args,
		 * i solved it by taking away that whole segment  */
	
		/*****/
		waitQM = new DefaultListModel<>();
		waitQ = new JList<>();
		waitQ.setModel(waitQM);
		
		inLineQM1 = new DefaultListModel<>();
		inLineQ1 = new JList<>();
		inLineQ1.setModel(inLineQM1);
		
		inLineQM2 = new DefaultListModel<>();
		inLineQ2 = new JList<>();
		inLineQ2.setModel(inLineQM2);
		
		
		
		
		SFrame = new JFrame("STOREMODEL");
		SFrame.setLayout(new BorderLayout());
		
		
		
		JPanel QPanel = new JPanel();
		QPanel.setLayout(new FlowLayout());
	
		MPanel = new JPanel();
		MPanel.setLayout(new GridLayout(1,2));
		M1Panel = new JPanel(new BorderLayout());
		M2Panel = new JPanel(new BorderLayout());
		M1GPanel = new JPanel(new GridLayout(1,2));
		M2GPanel = new JPanel(new GridLayout(1,2));
		

		//panel created for the two JButtons push and pop.
		JPanel SPanel = new JPanel();
		SPanel.setLayout(new FlowLayout());
		
		
		push = new JButton("Push");
		pop = new JButton("Pop");
		push2= new JButton("Push");
		pop2 = new JButton("Pop");
		quit = new QuitButton();
		kund =  new JButton("lägg till kund");
		kund.addActionListener(this); 
		push.addActionListener(this);
		pop.addActionListener(this);
		push2.addActionListener(this);
		pop2.addActionListener(this);
	
		
		 tk = new JTextField(20); 
		 tnr = new JTextField(20); 
		
	
		errorLabel = new JLabel("Bitch u Fucked up! hoe ass nigga :D");
		QPanel.add(quit);
		QPanel.add(waitQ, BorderLayout.SOUTH);
		
		
		
		MPanel.add(M1Panel);
		MPanel.add(M2Panel);
		M1Panel.add(M1GPanel, BorderLayout.SOUTH);
		M2Panel.add(M2GPanel, BorderLayout.SOUTH);
		
		
		//
		QPanel.add(tk, BorderLayout.NORTH);
		QPanel.add(tnr, BorderLayout.NORTH);
		QPanel.add(kund, BorderLayout.CENTER);
		
		//
		M1Panel.add(inLineQ1, BorderLayout.NORTH);
		M1GPanel.add(push);
		M1GPanel.add(pop);
		
		M2Panel.add(inLineQ2, BorderLayout.NORTH);
		M2GPanel.add(push2);
		M2GPanel.add(pop2);

		
		
		SFrame.add(MPanel, BorderLayout.SOUTH);
		SFrame.add(SPanel, BorderLayout.CENTER);
		SFrame.add(QPanel, BorderLayout.NORTH);

		SFrame.setSize(WIDTH,HEIGHT);	
		SFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		SFrame.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()== kund) {
			
				int antalVaror;
				String knd = tk.getText(); 
				antalVaror = Integer.parseInt(tnr.getText());
				waitQM.addElement( new Person(knd, antalVaror));	
				System.out.println("Ny kund:" + knd + "Antal varor: " + antalVaror);
				
		} 
	try{
		if ((e.getSource() == push && inLineQM1.isEmpty())|| e.getSource()== push){
					
				waitQ.getSelectedValue();
				inLineQM1.addElement(waitQ.getSelectedValue());
				waitQM.removeElement(waitQ.getSelectedValue());
					
		} else if ((e.getSource() == push2 && inLineQM2.isEmpty())|| e.getSource()== push2){
			
				waitQ.getSelectedValue();
				inLineQM2.addElement(waitQ.getSelectedValue());
				waitQM.removeElement(waitQ.getSelectedValue());
		}
		
	}catch(Exception ee){
			SPanel.add(errorLabel);
			}
		
	try{
		if (e.getSource() == pop){	
	
				inLineQ1.getSelectedValue();
				inLineQM1.removeElement(inLineQ1.getSelectedValue());
		
		} else if (e.getSource() == pop2 ){
				inLineQ2.getSelectedValue();
				inLineQM2.removeElement(inLineQ1.getSelectedValue());
			}
	
	}catch(NullPointerException ne){
			SPanel.add(errorLabel);
		}
		
	}
}


