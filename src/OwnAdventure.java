import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	int task = JOptionPane.showOptionDialog(null,
			"You were walking in the forest and fell into a hole containing a cavern.\n There are three different pathways. Which one will you choose? ", "The Deadly Cave", 0,
			JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "The right pathway","The left pathway.", "The middle pathway" },

	null);
		System.out.println(task);
	if(task == 1) {
		JOptionPane.showMessageDialog(null, "You move forward until you see a black widow, who kills you with its venom. Better luck next time!");
	}
	if(task == 2) {
		JOptionPane.showMessageDialog(null, "You move forward until you see a rat in a hole. It comes out of the hole, goes on you, and gives you an infection.\n You are left very sick, but you are not dead.");
	}
	if(task == 0) {
		JOptionPane.showMessageDialog(null, "You move forward until you see an exit, with a ladder to climb up to it. This exit allows you to escape the cavern. Hooray!");
	}
}
}
