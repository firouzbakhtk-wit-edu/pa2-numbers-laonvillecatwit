package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * Solution to pa2 part b.
 * When run the user is asked for values a b and c of a quadratic and is given back the root or roots of the function.
 * 
 * @author Cameron Labonville
 */
public class PA2b {

/**
 * Starts program, initializes variables and scanner before asking the user for inputs.
 * 
 * @param args
 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a, b, c, discriminant, root1, root2;

		System.out.printf("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

/**
 * Code first calculates and checks the value of the discriminant to see if it is dealing with 0 1 or 2 roots.
 *If it is dealing with 1 root it calculates and prints it.
 *If it is dealing with 2 roots it calculates both and prints the lower root first.
 */
		discriminant = (b*b) - (4 * a * c);
		if (discriminant < 0) {
			System.out.printf("Roots: imaginary%n");
		} else if (discriminant == 0) {
			root1 = (-1*b)/2*a;
			System.out.printf("Root: %.2f%n", root1);
		} else {
			root1 = ((-1*b) + Math.sqrt(discriminant))/(2*a);
			root2 = ((-1*b) - Math.sqrt(discriminant))/(2*a);

				System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
		}
		}

	}

