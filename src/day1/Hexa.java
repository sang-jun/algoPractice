package day1;
import java.util.Scanner;

public class Hexa {
	static void printHexa(int n) {
		int m;
		m = n % 16;
		if (n > 16)
			printHexa(n / 16);
		switch (m) {
		case 15:
			System.out.print("F");break;
		case 14:
			System.out.print("E");break;
		case 13:
			System.out.print("D");break;
		case 12:
			System.out.print("C");break;
		case 11:
			System.out.print("B");break;
		case 10:
			System.out.print("A");break;
		default:
			System.out.print(m);
		}
	}

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
			printHexa(n[j]);
			System.out.println();

		}
		s.close();
	}
}
