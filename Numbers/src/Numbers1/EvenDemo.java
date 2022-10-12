package Numbers1;

import java.util.Scanner;

public class EvenDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Highest Number");
		int n =scanner.nextInt();

		for (int i=1;i<=n;i++) {

			if(i%2==0) {
				System.out.println("The Even Number is = "+i);
			}
		}

	}


}
