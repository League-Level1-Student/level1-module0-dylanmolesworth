import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener{
	
	public void showButton() {
	     System.out.println("Button clicked");
	}
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JButton button = new JButton();
		frame.add(button); 
		
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
