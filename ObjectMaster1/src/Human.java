
public class Human {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 100;
	
	
	public int displayHealth() {
		System.out.println("Health: " + health);
		return health;
	}
	
	public void attack(Human h) {
		h.health = h.health - strength;
	}
}
