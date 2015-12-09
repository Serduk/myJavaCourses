public class TestArrays {
	public static void main(String[] args) {
		String[] islands = new String[4];
		islands[0] = "Bermuds";
		islands[1] = "Fidgi";
		islands[2] = "Azor islands";
		islands[3] = "Kosumel";

		int[] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;

		int y = 0;
		int ref = index[y];

		System.out.println("islands = ");
		

		while (4 > y) { 
			System.out.println(islands[ref]);
			y += 1;
		}
	}
}