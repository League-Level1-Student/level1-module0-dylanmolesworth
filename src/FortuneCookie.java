import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	
	public void showButton() {
	     System.out.println("Button clicked");
	     JFrame frame = new JFrame();
			frame.setVisible(true);
			
			JButton button = new JButton();
			frame.add(button); 
			
			button.setText("Open Cookie!");
			button.addActionListener(this);
			
	}
	
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();	
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "WooHoo");
		int rand = new Random().nextInt(6);
		if(rand == 1) {
		JOptionPane.showMessageDialog(null, "You will break your leg");
		}
		else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "You will win something");
			}
		else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "You will get lucky");
			}
		else if(rand == 4) {
			JOptionPane.showMessageDialog(null, "You will lose a friend");
			}
		else if(rand == 5) {
			JOptionPane.showMessageDialog(null, "you will lose your code");
			}
	}


}
