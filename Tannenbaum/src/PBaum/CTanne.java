package PBaum;

public class CTanne {

	static int nadel, luft;

	public static void main(String[] args) {
		luft = 10;
		nadel = 0;
		for (int i = 0; i < 10; i++) {
			nadel = nadel + 2;
			luft--;
			for (int i1 = 0; i1 <= luft; i1++) {
				System.out.print(" ");
			}
			for (int i2 = 1; i2 < nadel; i2++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
