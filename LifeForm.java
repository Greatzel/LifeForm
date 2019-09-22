/*Name: Greatzel Unabia
 * Class name: LifeForm V.09
 * Base Class for Human, Dragon and Unicorn
 * Class contains attributes: hit points, strength and type.
 * child classes inherit all these attributes
 * Contains methods:
 * 1. Check Hit Points Range
 * 2. Check Strength Points Range
 * 3. To String*/
public class LifeForm {

	private int hitPoints;
	private int strength;
	public String type;

	public LifeForm() {
		hitPoints = 100;
		strength = 15;
	}

	public LifeForm(int newHitPoints, int newStrength) {
		hitPoints = newHitPoints;
		strength = newStrength;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*
	 * Method name: LifeFormHitRange Method checks if entered character stats are in
	 * the allowed range. if not then the program will assign the lowest value for
	 * the attributes as punishment for not following instructions!
	 */
	public int LifeFormHitRange() {
		if (hitPoints < 0 || hitPoints > 100) {
			hitPoints = 1;
		}
		return hitPoints;
	}

	/*
	 * Method name: LifeFormStrRange Method checks if entered character stats are in
	 * the allowed range. if not then the program will assign the lowest value for
	 * the attributes as punishment for not following instructions!
	 */
	public int LifeFormStrRange() {
		if (strength < 0 || strength > 18) {
			strength = 1;
		}
		return strength;
	}

	@Override
	public String toString() {
		return "Lifeform [hitPoints=" + hitPoints + ", strength=" + strength + ", type=" + type + "]";
	}

}
