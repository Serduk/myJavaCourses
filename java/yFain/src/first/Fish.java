package first;

public class Fish extends Pet{
	
	int currentDepth = 0;
	
	Fish (int startingPosition) {
		currentDepth = startingPosition;
	}
	
	public int dive(int howDeep) {
		currentDepth = currentDepth + howDeep;
		
		if (currentDepth >= 100) {
			System.out.println("I\'m Little Fish, i can\'t dive so deep");
			currentDepth -= howDeep;
		} else {
			System.out.println("I'm dive on " + howDeep + " futs");
			
			System.out.println("I'm on " + currentDepth + " futs");
			//return currentDepth;
			}
		return currentDepth;
		
		}
	
	public String say(String something) {
		return "Did you know? fish cant speak";
	}
}
