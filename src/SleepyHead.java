
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int result = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		System.out.println(result);

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */if (result == 0) {
			result = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Sleepy Head",
					JOptionPane.YES_NO_OPTION);

			if (result == 1) {
				JOptionPane.showMessageDialog(null, "Get up lazybones!");
			}else {
				JOptionPane.showMessageDialog(null, "Sleep in");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Sleep in");
		}
	}
}
