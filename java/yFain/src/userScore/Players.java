package userScore;

public class Players {
	public static void main (String [] args) {
		String [] player = new String[4];
/*		player[0] = "Holla";
		player[1] = "Helen";
		player[2] = "Smith";
		player[3] = "John";
*/		

		String [] playerName = {"Holla", "Helen", "Smith", "John"};
		
		for (int i = 0; i < player.length; i++) {
			player[i] = playerName[i];
		}
		
		int totalPlayer = player.length;
		System.out.println("Total is " + totalPlayer);
		
//		String theWinner = player[1];
//		System.out.println("The winner is " + theWinner + "!");
		
		for (int i = 0; i < player.length; i++) {
			if (player[i].equals("Holla")) {
				continue;
			} else if (i == 3) {
				break;
			}
			System.out.println("The winner is " + player[i] + "!");
		}
	}
}
