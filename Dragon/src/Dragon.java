
public class Dragon extends Mammal {
	
	public Dragon() {
		this.energyLevel = 300;
	}
	
	public void flySkyward() {
		System.out.println("Swooosh!");
		this.energyLevel = energyLevel - 50;
	}
	
	public void eatHumans() {
		System.out.println("'Oh god, my arm-' CHOMP!");
		this.energyLevel = energyLevel + 25;
		
	}
	
	public void attackTown() {
		System.out.println("'TROGDOO~OOOR!'");
		this.energyLevel = energyLevel - 100;
	}
	
}
