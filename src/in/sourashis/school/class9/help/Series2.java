package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Enter the value of n and print the following series:-<br>
 * <code>-1 + 4 - 27 + 256 ... &#177; n</code>
 * @author Sourashis Pal
 */
public class Series2 {

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
		for (int i = 1, sign = -1; Math.pow(i, i) <= n; i++, sign *= -1) {
			sum += sign * Math.pow(i, i);
		}
		System.out.println("Sum = " + sum);
	}
}