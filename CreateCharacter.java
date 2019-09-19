import java.util.ArrayList;
import java.util.Scanner;

public class CreateCharacter {
	
	public static void main (String [] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//ArrayList <LifeForm> characters = new ArrayList <LifeForm>();
		
		System.out.println("Enter Lifeform :1");
		
		Human test1 = new Human();
		test1.setType("Unicorn");
		test1.setMagic(userInput.nextInt());
		
		System.out.println("Enter Lifeform :2"); 
		
		test1.checkTypeNumStat();
		
		//System.out.println(test1.getMagic());
	}

}
