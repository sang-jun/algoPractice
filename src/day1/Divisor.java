package day1;
import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		int testCase;
		int[] n;
		int numberOfDivisor = 0;

		Scanner s = new Scanner(System.in);
		testCase = s.nextInt();

		n = new int[testCase+1];
		for (int i = 1; i <= testCase; i++) {
			n[i] = s.nextInt();
		}

		for (int j = 1; j <= testCase; j++) {

			numberOfDivisor = 0;
			System.out.println("#testcase" + j);

			for (int i = 1; i <= n[j]; i++) {
				if (n[j] % i == 0) {
					numberOfDivisor++;
				}
			}

			System.out.println(numberOfDivisor);
		}
		s.close();
	}
}
