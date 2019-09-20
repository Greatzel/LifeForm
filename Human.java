
public class Human extends LifeForm {
	
	public String name;
	public String weapon;
	public int magic;

	public Human() {
		super();
		name = "Lil Broccly";
		weapon = "Dagger";
		magic = 45;
	}

	public Human(String newName,String newWeapon, int newMagic) {
		super();
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
		if (!weapon.contentEquals("Sword") || !weapon.contentEquals("Dagger")) {
			weapon = "Dagger";
		}
		return weapon;
	}
	
	public int checkMagic() {
		if(magic < 0 || magic > 50) {
			magic = 1;
		}
		return magic;
	}

	@Override
	public String toString() {
		return super.toString() + "Human [name=" + name + ", weapon=" + weapon + ", magic=" + magic + "]";
	}

}
