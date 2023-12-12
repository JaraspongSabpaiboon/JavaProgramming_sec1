import javax.swing.*;
public class Example02 {

	public static void main(String[] args) {
		String yourEmail = JOptionPane.showInputDialog("Input your e-mail.com:");
		//2.check email that correct or not
		while(yourEmail.startsWith("@")||yourEmail.startsWith("")) {
			yourEmail = JOptionPane.showInputDialog("Input your e-mail,again :");
			
		}
		//3.check email that or hotmail or gmail.com or not
		yourEmail = yourEmail.toLowerCase();
		if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null, "your e-mail is "+
		yourEmail);
			
		}else {
			JOptionPane.showMessageDialog(null, "your e-mail is not hotmail or gmil dot com");
		}

	}

}
