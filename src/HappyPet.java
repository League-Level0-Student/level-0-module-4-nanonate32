import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog(null, "What kind of pet do you want to buy.");
		// 7. REPEAT steps 3 - 6 enough times to make your pet sad!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What do you want to do want to do to make your pet hate you.",
				"Death Simulation", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Get it sick by touching him with your filthy hands.",
						"Make sure it dies a painful death.", "Burn it in your fireplace" },
				null);

		// 5. Use user input to call the appropriate method created in step 4.
		System.out.println(task);
		if (task == 1) {
			painfulDeath();
		}
		if (task == 2) {
			burnToDeath();
		}
		if (task == 0) {
			filthySick();
		}

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
if(happinessLevel <= -90) {
	JOptionPane.showMessageDialog(null, "You must hate your pet!!!");
}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void burnToDeath() {
		JOptionPane.showMessageDialog(null, "SCREECH!!!!!");
		happinessLevel -= 15;
	}

	static void painfulDeath() {
		JOptionPane.showMessageDialog(null, " ");
		happinessLevel = -20;
	}

	static void filthySick() {
		JOptionPane.showMessageDialog(null, "ACHOO! ROAR!!!!!!   ");
		happinessLevel = -10;

	}

}