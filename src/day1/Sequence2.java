package day1;
import java.util.Scanner;

public class Sequence2 {

	public static void main(String[] args) {
		int testCase;
		int[] n;

		Scanner s = new Scanner(System.in);
		testCase = s.nextInt();

		n = new int[testCase + 1];
		for (int i = 1; i <= testCase; i++) {
			n[i] = s.nextInt();
		}

		for (int j = 1; j <= testCase; j++) {

			System.out.println("#testcase" + j);
			
			System.out.println((n[j]*(n[j]+1)/2)+(n[j]*(n[j]-1))/2);

		}
		s.close();
	}

}
