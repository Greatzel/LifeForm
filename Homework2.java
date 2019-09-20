import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		ArrayList<LifeForm> characters = new ArrayList<LifeForm>();
		Human human1 = new Human();
		Dragon dragon1 = new Dragon();
		Unicorn unicorn1 = new Unicorn();

		for (int i = 0; i < 3; i++) {

			System.out.println("Enter Lifeform " + (i + 1) + ":");
			System.out.println("Enter Lifeform type:");
			String userEntry = userInput.nextLine();

			if (userEntry.contentEquals("Human") || userEntry.contentEquals("human")) {

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

			} else if (userEntry.contentEquals("Dragon") | userEntry.contentEquals("dragon")) {

				dragon1.setType(userEntry);
				System.out.println("Enter Lifeform Name:");
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

			} else if (userEntry.contentEquals("Unicorn") || userEntry.contentEquals("unicorn")) {

				unicorn1.setType(userEntry);
				System.out.println("Enter Lifeform Name:");
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
			} 
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(characters.get(i).toString());
		}

		userInput.close();

		// System.out.println(test1.getMagic());
	}

}
