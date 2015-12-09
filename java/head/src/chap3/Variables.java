public class Variables {
	public static void main(String[] args) {
		/*
		int [] nums = new int[7];;
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		nums[5] = 6;
		nums[6] = 7;

		System.out.println(nums[1]);
		*/

		Dog [] pets = new Dog[7];
		pets[0] = new Dog();
		pets[1] = new Dog();
		pets[2] = new Dog();
		pets[3] = new Dog();
		pets[4] = new Dog();
		pets[5] = new Dog();
		pets[6] = new Dog();

		
		Dog fido = new Dog();
		fido.name = "Fido";
		/*
		fido.bark();
		fido.chaseCat();
		System.out.println();
		*/

		Dog[] myDogs = new Dog [3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = fido;

		myDogs[0].name = "Bob";
		myDogs[1].name = "Spark";

		//System.out.println(myDogs[2].name);
		//System.out.println(myDogs[1].name);

		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x += 1;
		}
	}
}