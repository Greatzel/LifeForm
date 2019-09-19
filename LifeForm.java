
public class LifeForm {

	public int hitPoints;
	public int strength;
	public String weapon;
	public int magic;
	public String type;
	public String name;

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

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * Method name: isInRange Method checks if entered character stats are in range.
	 */

	@Override
	public String toString() {
		return "LifeForm [hitPoints=" + hitPoints + ", strength=" + strength + ", type=" + type + "]" + type + " [name=" + name + ", weapon=" + weapon + ", magic=" + magic;
	}

}
