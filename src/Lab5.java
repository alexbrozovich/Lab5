import java.util.Random;
import java.util.Scanner;

public class Lab5 {
	// class that takes the number of sides the dice have and returns a random roll
	// from a die with that many sides
	public static int rollDice(int diceSides) {
		Random rand = new Random();
		return rand.nextInt(diceSides) + 1;
	}

	public static void main(String[] args) {
		// set up the loop to keep going until the user wants to stop
		boolean keepRolling = true;
		while (keepRolling == true) {
			Scanner scan = new Scanner(System.in);
			
			//get the number of dice that should be rolled and use rollDice to get results
			System.out.println("Enter the number of sides that the dice have: ");
			int diceSides = scan.nextInt();
			int roll1 = rollDice(diceSides);
			int roll2 = rollDice(diceSides);
			
			//print out the results of the roll and let the user know if they got a cool result
			System.out.printf("Results of the roll are: %d and %d %n", roll1, roll2);
			if (roll1 == 6 && roll2 == 6) {
				System.out.println("Boxcars!");
			}
			if (roll1 == 1 && roll2 == 1) {
				System.out.println("Snake eyes!");
			}
			if (roll1 + roll2 == 7 || roll1 + roll2 == 11) {
				System.out.println("Craps!");
			}
			
			//determine if the user wants to keep going with the dice rolling or not
			System.out.println("Do you want to continue? y/n");
			char userIn = scan.next().charAt(0);
			if (userIn == 'Y' || userIn == 'y') {
				keepRolling = true;
			} else {
				keepRolling = false;
				scan.close();
			}
		}

	}

}
