

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i =0;
		int j =0;
		//Standard Input
		System.out.println("Initial number of stars: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//Prints stars
		for (i = 1; n>=i; i++)
		{
				{
					for (j = n; j>=i; j--)
				{
						System.out.print("*");
				}
					System.out.println();
				}
		}
		scan.close();
	}
}
