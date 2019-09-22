/*Name: Greatzel Unabia
 * Class name: Dragon V0.9
 * Class is a child of LifeForm
 * Class is a template for unicorn objects
 * Contains attributes: name, weapon and magic
 * Contains methods:
 * 1. Check Weapon - assigns default weapon if user enters invalid weapon
 * 2. Check Magic - assigns default value if user enters invalid magic value
 * */
public class Unicorn extends LifeForm {

	public String name;
	public String weapon;
	public int magic;

	public Unicorn() {
		super();
	}

	public Unicorn(int newHitPoints, int newStrength, String newName, String newWeapon, int newMagic) {
		super(newHitPoints, newStrength);
		name = newName;
		weapon = newWeapon;
		magic = newMagic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	/*
	 * Method name: checkWeapon assigns default weapon if user enters invalid weapon
	 */
	public String checkWeapon() {
		if (!weapon.equalsIgnoreCase("horn") && !weapon.equalsIgnoreCase("charm")) {
			weapon = "horn";
		}
		return getWeapon();
	}

	/*
	 * Method name: checkMagic assigns default value if user enters invalid magic
	 * value
	 */
	public int checkMagic() {
		if (magic < 100 || magic > 500) {
			magic = 100;
		}
		return magic;
	}

	@Override
	public String toString() {
		return super.toString() + "Unicorn [name=" + name + ", weapon=" + weapon + ", magic=" + magic + "]";
	}
}
