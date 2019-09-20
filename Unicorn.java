
public class Unicorn extends LifeForm{
	
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
	
	public String checkWeapon() {
		if (!weapon.contentEquals("Horn") || !weapon.contentEquals("Charm")) {
			weapon = "Horn";
		}
		return weapon;
	}
	
	public int checkMagic() {
		if(magic < 100 || magic > 500) {
			magic = 100;
		}
		return magic;
	}

	@Override
	public String toString() {
		return super.toString() + "Unicorn [name=" + name + ", weapon=" + weapon + ", magic=" + magic + "]";
	}
}
