
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
	 * Method name: isInRange Method checks if entered character stats are in range.
	 */
	public int LifeFormHitRange() {
		if (hitPoints < 0 || hitPoints > 100) {
			hitPoints = 1;
		}
		return hitPoints;
	}

	public int LifeFormStrRange() {
		if (strength < 0 || strength > 18) {
			strength =1;
		}
		return strength;
	}

	@Override
	public String toString() {
		return "LifeForm [hitPoints=" + hitPoints + ", strength=" + strength + ", type=" + type + "]";
	}

}
