import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {

		String score = JOptionPane.showInputDialog("What was your test score?");

		double Percent = Double.parseDouble(score);

		if (Percent >= 85) {
			JOptionPane.showMessageDialog(null, "You really studied hard for that test!");
		}
		if (Percent <= 50) {
			JOptionPane.showMessageDialog(null, "Did you even try???!!!");
		}
			if (Percent > 50 && Percent < 84) {
				JOptionPane.showMessageDialog(null, "Your score's okay, but below average.");
			}
		
	}
}
