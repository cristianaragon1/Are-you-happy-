import javax.swing.JOptionPane;

public class areuhappy {
	public static void main(String[] args) {
		String Question1 = JOptionPane.showInputDialog("Are you happy?");

		if (Question1.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing");
		}
		else {
			String Question2 = JOptionPane.showInputDialog("Do you want to be happy?");
		

		if (Question2.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			
		}
		else{
		JOptionPane.showMessageDialog(null, "Change Something");	
		
		}
		}
	}
}
