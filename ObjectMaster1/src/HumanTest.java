
public class HumanTest {

	public static void main(String[] args) {
		Human georgeMichael = new Human();
		Human buster = new Human();
		System.out.println(georgeMichael.health);
		System.out.println(buster.health);
		buster.attack(georgeMichael);
		System.out.println(georgeMichael.health);
	}

}
