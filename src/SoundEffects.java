import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	
	public static void main(String[] args) {
		new SoundEffects().createUI();
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton buttonc = new JButton();
	JButton buttonD = new JButton();
	JButton buttonE = new JButton();
	
	
	private void createUI() {
		
		frame.add(panel);
		
		frame.setVisible(true);
		
		panel.add(buttonc);
		
		panel.add(buttonD);
		
		panel.add(buttonE);
		
		buttonc.setText("C");
		
		buttonD.setText("D");
		
		buttonE.setText("E");
		
		buttonc.addActionListener(this);
		
		buttonD.addActionListener(this);
		
		buttonE.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		if (buttonPressed.equals(buttonc)) {
			
			playSound("trumpetc.wav");
			System.out.println("clickedc");

		}
		
		if (buttonPressed.equals(buttonD)) {
			
			playSound("trumpetd.wav");
			System.out.println("clickedd");
		}

		if (buttonPressed.equals(buttonE)) {
	
			playSound("trumpete.wav");
			System.out.println("clickede");

		}
		
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	

}
