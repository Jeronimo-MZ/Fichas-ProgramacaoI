import java.util.Random;
import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		Random R = new Random();
		ArrayList<Integer> T = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			T.add(R.nextInt(999999));
		}

		System.out.println("Lista gerada: " + T);
	}
}