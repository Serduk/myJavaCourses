public class AutoIncrement {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c;

		c = ++a - b++;
		System.out.println(b);
		int modulo = a / b;
		System.out.println("Modulo " + modulo);
	}
}