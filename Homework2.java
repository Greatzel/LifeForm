
/*Name: Greatzel Unabia
 * Class anme: Homework2 V0.9
 * This class creates an instance of the different lifeforms
 * and outputs the result*/
import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		ArrayList<LifeForm> characters = new ArrayList<LifeForm>();
		Human human1 = new Human();
		Dragon dragon1 = new Dragon();
		Unicorn unicorn1 = new Unicorn();
		Human unknown = new Human();

		int timesUserEntersInvalidType = 0;
		// for loop will ask the user for entries
		for (int i = 0; i < 3; i++) {

			System.out.println("Enter Lifeform " + (i + 1));
			System.out.println("Enter Lifeform type:");
			String userEntry = userInput.nextLine();
			// each if statement will determine from which class it should create
			// an instance of
			if (userEntry.equalsIgnoreCase("human")) {

				human1.setType(userEntry);
				System.out.println("Enter Lifeform name:");
				human1.setName(userInput.nextLine());
				System.out.println("Enter hit points:");
				human1.setHitPoints(userInput.nextInt());
				System.out.println("Enter strength:");
				human1.setStrength(userInput.nextInt());
				System.out.println("Enter weapon:");
				human1.setWeapon(userInput.next());
				System.out.println("Enter magic:");
				human1.setMagic(userInput.nextInt());
				userInput.nextLine();

				human1.LifeFormHitRange();
				human1.LifeFormStrRange();
				human1.checkWeapon();
				human1.checkMagic();
				characters.add(human1);

			} else if (userEntry.equalsIgnoreCase("dragon")) {

				dragon1.setType(userEntry);
				System.out.println("Enter Lifeform name:");
				dragon1.setName(userInput.nextLine());
				System.out.println("Enter hit points:");
				dragon1.setHitPoints(userInput.nextInt());
				System.out.println("Enter strength:");
				dragon1.setStrength(userInput.nextInt());
				System.out.println("Enter weapon:");
				dragon1.setWeapon(userInput.next());
				System.out.println("Enter magic:");
				dragon1.setMagic(userInput.nextInt());
				userInput.nextLine();

				dragon1.LifeFormHitRange();
				dragon1.LifeFormStrRange();
				dragon1.checkWeapon();
				dragon1.checkMagic();
				characters.add(dragon1);

			} else if (userEntry.equalsIgnoreCase("unicorn")) {

				unicorn1.setType(userEntry);
				System.out.println("Enter Lifeform name:");
				unicorn1.setName(userInput.nextLine());
				System.out.println("Enter hit points:");
				unicorn1.setHitPoints(userInput.nextInt());
				System.out.println("Enter strength:");
				unicorn1.setStrength(userInput.nextInt());
				System.out.println("Enter weapon:");
				unicorn1.setWeapon(userInput.next());
				System.out.println("Enter magic:");
				unicorn1.setMagic(userInput.nextInt());
				userInput.nextLine();

				unicorn1.LifeFormHitRange();
				unicorn1.LifeFormStrRange();
				unicorn1.checkWeapon();
				unicorn1.checkMagic();
				characters.add(unicorn1);
			} else {
				// if the user enters an invalid type, we don't ask more questions
				// we let the loop continue!
				timesUserEntersInvalidType += 1;
				unknown.setType(userEntry);
			}
		}
		//if the user does input an invalid type
		// we let them know that their input was not added to the arrayList
		if (timesUserEntersInvalidType > 0) {
			System.out.println("Unknown lifeform- not added to list");
		}

		System.out.println("The available life forms are: ");
		// prints the output
		for (int i = 0; i < characters.size(); i++) {
			System.out.println(characters.get(i).toString());
		}
		userInput.close();
	}

}
