public class Animals {
	public static void main(String [] args) {
		Dog d = new Dog();

		String [] commands = {"Sit", "Stay", "Bark", "Silence"};
		String [] dogName = {"Sparky", "July", "Bob", "Sam"};

		int dogNamCount = (int) dogName.length;
		int randDog = (int) ((Math.random()) * dogNamCount);
		//System.out.println("Randme dog is " + dogName[randDog]);

		int comNamcount = (int) commands.length;
		int randCom = (int) ((Math.random()) * comNamcount);
		//System.out.println("Randme dog is " + commands[randCom]);

		System.out.println("I say " + dogName[randDog] + ", " + commands[randCom] + "!");


	}
}