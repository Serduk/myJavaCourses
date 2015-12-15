public class First {
	public static void main(String[] args) {
		int x = 3;
		String name = "Dagger";
		x *= 17;

		System.out.println("x = " + x);
		
		while (x > 12) {
			x -= 5;
			System.out.println("x = " + x);
		}

		System.out.println("X = " + x);

		for (x = 0; x < 12; x++) {
			System.out.println("Now x = " + x);
		}
		x -= 10;

		if (x == 10) {
			System.out.println("X = 10");
		} else {
			System.out.println(" X != 10");
		}

		if ((x < 3) && (name.equals("Dagger"))) {
			System.out.println("Dangerous");
		}

		System.out.println("I'ts row will be print anywey");

	}
}