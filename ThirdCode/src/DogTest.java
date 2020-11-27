public class DogTest{
	
public static void main(String[] args){
		
		// I create a Animal object named genericAnimal
	
		Animal genericAnimal = new Animal();
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		
	
		// I create a Dog class like any other
		Dog Spike = new Dog("Spike", "Bone", "Home guard");
		
		// Print out the name, favFood and favToy
		System.out.println(Spike.getName());
		System.out.println(Spike.favFood);
		System.out.println(Spike.favToy);
		
		// You can also create classes based on the super class
		
		Animal tabby = new Dog("Tabby", "Milk", "Ball");
		
		// You pass objects like any other field
		acceptAnimal(tabby);
		
	}
	
	public static void acceptAnimal(Animal randAnimal){
		
		// Gets the name and favFood for the Animal passed
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		
		// This is Polymorphism
		// The interpreter automatically figures out what type
		// of Animal it's dealing with and checks to make sure
		// if methods were overwritten that they are called 
		// instead
		randAnimal.walkAround();
		
		// The interpreter won't find anything that doesn't 
		// originally exist in the Animal class however
		// If you want access to fields or methods only found
		// in the Dog class you have to cast the object to
		// that specific class first
		Dog tempCat = (Dog) randAnimal;
		
		System.out.println(tempCat.favToy);
		
		// You could also cast the object directly like this
		System.out.println(((Dog) randAnimal).favToy);
		
		// You can use instanceof to check what type of object
		// you have. This results in a positive for Animal 
		// and for Dog
		if (randAnimal instanceof Dog)
		{
			System.out.println(randAnimal.getName() + " is a Dog");
		}
		
	}
	
}