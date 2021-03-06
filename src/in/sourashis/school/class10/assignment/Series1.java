package in.sourashis.school.class10.assignment;

import java.util.Scanner;

/**
 * Write a program to print the sum of the following series:-<br>
 * <code>S = 2! + 4! + 6! + ... n!</code><br>
 * Solve using nested loop.
 * @author Sourashis Pal
 */
public class Series1 {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		sc.close();

		int sum = 0;
		for (int i = 2; i <= n; i += 2) {
			int factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial *= j;
			}
			sum += factorial;
		}
		System.out.println("Sum of the series = " + sum);
	}
}
