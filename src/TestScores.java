import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {

		String score = JOptionPane.showInputDialog("What was your test score?");
		Double.parseDouble(score);
		if (score >= 75) {

		}
	}
}
