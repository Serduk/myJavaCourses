public class BeerSong {
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "Bottles";
		String word2 = "on the wall";
		String word3 = "beer";

		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "Bottle";
			}
			System.out.println(beerNum + " " + word + " " + word2);
			System.out.println(beerNum + " " + word + " " + word3);
			System.out.println("Take one");
			System.out.println("go around");
			
			beerNum -= 1;

			if (beerNum == 0) {
				System.out.println("No have" + word3 + " " + word2);
			}

		}
		
	}
}