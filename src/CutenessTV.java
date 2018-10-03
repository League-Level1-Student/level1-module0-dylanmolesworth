
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	
	public static void main(String[] args) {
		new CutenessTV().createUI();
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	
	
	private void createUI() {
		
		frame.add(panel);
		
		frame.setVisible(true);
		
		panel.add(button1);
		
		panel.add(button2);
		
		panel.add(button3);
		
		button1.setText("1");
		
		button2.setText("2");
		
		button3.setText("3");
		
		button1.addActionListener(this);
		
		button2.addActionListener(this);
		
		button3.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		if (buttonPressed.equals(button1)) {
			showDucks();
			
		}
		
		if (buttonPressed.equals(button2)) {
			showFrog();
		
		}

		if (buttonPressed.equals(button3)) {
			showFluffyUnicorns();
	

		}
		
	}
	
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
}