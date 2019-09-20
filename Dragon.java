
public class Dragon extends LifeForm{
	
	public String name;
	public String weapon;
	public int magic;
	
	public Dragon() {
		super();
		name = "Mega Death";
		weapon = "fire";
		magic = 95;
	}
	
	public Dragon(int newHitPoints, int newStrength, String newName, String newWeapon, int newMagic) {
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
		if (!weapon.contentEquals("Fire") || !weapon.contentEquals("Ice")) {
			weapon = "Ice";
		}
		return weapon;
	}
	
	public int checkMagic() {
		if(magic < 0 || magic > 100) {
			magic = 1;
		}
		return magic;
	}

	@Override
	public String toString() {
		return super.toString() + "Dragon [name=" + name + ", weapon=" + weapon + ", magic=" + magic + "]";
	}
}
