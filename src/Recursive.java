
public class Recursive {

	public static void main(String[] args) {
		System.out.println(factorielle(4));
	}
	
	public static int factorielle(int n) {
		if (n == 0) return 1;
		return n * factorielle(n - 1);
	}

}
