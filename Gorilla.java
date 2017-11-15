public class Gorilla extends Mammal{

	public void throwSomething() {
		System.out.println("The gorilla has thrown...SOMETHING!");
		this.energyLevel = energyLevel - 5;
	}

	public void eatBananas() {
		System.out.println("The gorilla has eaten some bananas and is super satisfied.");
		this.energyLevel = energyLevel + 10;
	}

	public void climbTree() {
		System.out.println("The gorilla just climbed a tree! Can you imagine?");
		this.energyLevel = energyLevel - 10;
	}
}