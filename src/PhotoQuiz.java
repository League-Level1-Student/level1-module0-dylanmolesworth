/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String image = ("https://www.glutenfreepalate.com/wp-content/uploads/2014/02/Gluten-Free-Chocolate-Cake-Donuts5.2.jpg");
                String image2 = "https://prods3.imgix.net/images/articles/2017_04/Feature-Glazed-Doughnuts.jpg";

		// 2. create a variable of type "Component" that will hold your image
                
                Component iholder;
                

		// 3. use the "createImage()" method below to initialize your Component
                
               iholder = createImage(image);  
              
               

		// 4. add the image to the quiz window
                
                quizWindow.add(iholder);
                
       

		// 5. call the pack() method on the quiz window
                
               quizWindow.pack();

		// 6. ask a question that relates to the image
               
               String donut = JOptionPane.showInputDialog("What kind of donut is this?");

		// 7. print "CORRECT" if the user gave the right answer
               
               if(donut.equals("Chocolate")) {
            	   JOptionPane.showMessageDialog(null, "Correct!");
               }
               
               else if(donut.equals("chocolate")) {
            	   JOptionPane.showMessageDialog(null, "Correct!");
               }

		// 8. print "INCORRECT" if the answer is wrong
               
               else {
            	   
            	   JOptionPane.showMessageDialog(null, "Incorrect!");
            	   
               }

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

               quizWindow.remove(iholder);
               
		// 10. find another image and create it (might take more than one line of code)
               
               Component iholder2;
               iholder2 = createImage(image2);
               quizWindow.add(iholder2);
               quizWindow.pack();
               String donut2 = JOptionPane.showInputDialog("What kind of donut is this?");
               
                      if(donut2.equals("Glazed")) {
                   	   JOptionPane.showMessageDialog(null, "Correct!");
                      }
                      
                      else if(donut2.equals("Glazed")) {
                   	   JOptionPane.showMessageDialog(null, "Correct!");
                      }
                      
                      else {
                   	   JOptionPane.showMessageDialog(null, "Incorrect!");
                      }

               
		// 11. add the second image to the quiz window
                      
                      

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





