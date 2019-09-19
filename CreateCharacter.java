import java.util.ArrayList;
import java.util.Scanner;

public class CreateCharacter {
	
	public static void main (String [] args) {
		
		Scanner userInput = new Scanner(System.in);
		LifeForm test1 = new LifeForm();
		//Dragon test2 = new Dragon();
		//Unicorn test3 = new Unicorn();
		//ArrayList <LifeForm> characters = new ArrayList <LifeForm>();
		
		for(int i = 0 ; i < 1 ; i++) {//CHANGE THIS LATER
			
			System.out.println("Enter Lifeform Type:");
			test1.setType(userInput.nextLine());
			System.out.println("Enter Lifeform Name:");
			test1.setName(userInput.nextLine());
			System.out.println("Enter hit points:");
			test1.setHitPoints(userInput.nextInt());
			System.out.println("Enter strength:");
			test1.setStrength(userInput.nextInt());
			System.out.println("Enter weapon:");
			test1.setWeapon(userInput.next());
			System.out.println("Enter magic:");
			test1.setMagic(userInput.nextInt());
			userInput.nextLine();

		}	
		userInput.close();
		System.out.println(test1.toString());		
		//System.out.println(test1.getMagic());
	}

}
