class GuessGame {
	Player p1;
	Player p2;
	Player p3;

	void startGame () {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm guessing a number from 0 to 9...");

		while (true) {
			System.out.println("The number that you want to guess, - " + targetNumber);

			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.println("First gamer think that will be " + guessp1);

			guessp2 = p2.number;
			System.out.println("Second gamer think that will be " + guessp2);

			guessp3 = p3.number;
			System.out.println("Third gamer think that will be " + guessp3);

			if (guessp1 == targetNumber) {
				p1isRight = true;
			} else if (guessp2 == targetNumber) {
				p2isRight = true;
			} else if (guessp3 == targetNumber) {
				p3isRight = true;
			} 

			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a Winner!");
				System.out.println("First gamer will guess " + p1isRight);
				System.out.println("Second gamer will guess " + p2isRight);
				System.out.println("Third gamer will guess " + p3isRight);
				break;
			} else {
				System.out.println("All gamer mast try again");
			}
		}

	}
}