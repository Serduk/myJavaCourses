public class MovieTestDrive {
	public static void main(String[] args) {
		
		Movie one = new Movie();
		one.title = "How to bern in action";
		one.genre = "Tragedic";
		one.rating = -2;

		Movie two = new Movie();
		two.title = "Lost in office";
		two.genre = "comedy";
		two.rating = 5;
		two.playIt();

		Movie three = new Movie();
		three.title = "Byte club";
		three.genre = "funny tragedic";
		three.rating = 120;
	}
}