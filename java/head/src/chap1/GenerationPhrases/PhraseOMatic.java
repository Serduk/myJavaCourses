public class PhraseOMatic {
	public static void main (String[] args) {
		//Create 3 comlect of words
		String[] wordListOne = {"Hi", "Hello", "Bonjur", "Conichua"};
		String[] wordListTwo =  {"My", "Litlle", "Pretty", "Сramp"};
		String[] wordListThree = {"Girl", "Women", "Baby", "Kitty", "Sun"};

		//Calc how many words in all array
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		//Generate 3 random int
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		//Generate phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		//Echo phrase on screen
		System.out.println("Ella, I'ts my random greating to you:\n" + phrase + " :-)");
	}
}