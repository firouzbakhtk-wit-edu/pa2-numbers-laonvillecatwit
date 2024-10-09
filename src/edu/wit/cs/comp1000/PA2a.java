package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * Solution to pa2 part a.
 * When run the user is asked for 5 whole number inputs then receives information on the sums and averages
 * of the positive numbers the non positive numbers and the set as a whole.
 * 
 * @author Cameron Labonville
 */

public class PA2a {

/**
 * starts program, initializes variables and scanner before asking for inputs from the user.
 * 
 * @param args
 */
	
	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		Scanner input = new Scanner(System.in);
		int in1, in2, in3, in4, in5;
		int n_Pos = 0;
		int n_nPos = 0;
		int posSum = 0;
		int nPosSum = 0;
		int totalSum;
		double posAvg;
		double nPosAvg;
		double totalAvg;
		
		System.out.printf("Enter five whole numbers: ");
		in1 = input.nextInt();
		in2 = input.nextInt();
		in3 = input.nextInt();
		in4 = input.nextInt();
		in5 = input.nextInt();
		totalSum = (in1 + in2 + in3 + in4 + in5);
		totalAvg = totalSum/5.;
		
/**
 * Code above calculates the average and sum of the set because the information needed for those is already available.
 * Below code checks the individual numbers to see if they are positive or negative and accordingly changes 
 * the total counter of the number group and the sum of said group.
 */
		
		if (in1 > 0 ) {
			n_Pos = n_Pos + 1;
			posSum = posSum + in1;
		} else {
			n_nPos = n_nPos + 1;
			nPosSum = nPosSum + in1;
		}
		if (in2 > 0 ) {
			n_Pos = n_Pos + 1;
			posSum = posSum + in2;
		} else {
			n_nPos = n_nPos + 1;
			nPosSum = nPosSum + in2;
		}
		if (in3 > 0 ) {
			n_Pos = n_Pos + 1;
			posSum = posSum + in3;
		} else {
			n_nPos = n_nPos + 1;
			nPosSum = nPosSum + in3;
		}
		if (in4 > 0 ) {
			n_Pos = n_Pos + 1;
			posSum = posSum + in4;
		} else {
			n_nPos = n_nPos + 1;
			nPosSum = nPosSum + in4;
		}
		if (in5 > 0 ) {
			n_Pos = n_Pos + 1;
			posSum = posSum + in5;
		} else {
			n_nPos = n_nPos + 1;
			nPosSum = nPosSum + in5;
		}
		
		posAvg = 1. * posSum / n_Pos;
		nPosAvg = 1. * nPosSum / n_nPos;
		
/**
 * Above when calculating the average a double has been added to convert the two integers
 *  it is dealing with to doubles to get the desired output.
 *  Below the code prints all the calculated variables with varying text based on the number of inputs within the group.
 */
		if (n_Pos == 0) {
			System.out.printf("The sum of the 0 positive numbers: 0%n");
		} else if (n_Pos == 1) {
			System.out.printf("The sum of the 1 positive number: %d%n", posSum); 
		} else {
			System.out.printf("The sum of the %d positive numbers: %d%n", n_Pos, posSum);
		}
		if (n_nPos == 0) {
			System.out.printf("The sum of the 0 non-positive numbers: 0%n");
		} else if (n_nPos == 1) {
			System.out.printf("The sum of the 1 non-positive number: %d%n", nPosSum);
		} else {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", n_nPos, nPosSum);
		}
		System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
		if (n_Pos == 0) {
			System.out.printf("The average of the 0 positive numbers: 0.00%n");
		} else if (n_Pos == 1) {
			System.out.printf("The average of the 1 positive number: %.2f%n", posAvg); 
		} else {
			System.out.printf("The average of the %d positive numbers: %.2f%n", n_Pos, posAvg);
		}
		if (n_nPos == 0) {
			System.out.printf("The average of the 0 non-positive numbers: 0.00%n");
		} else if (n_nPos == 1) {
			System.out.printf("The average of the 1 non-positive number: %.2f%n", nPosAvg); 
		} else {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", n_nPos, nPosAvg);
		}
		System.out.printf("The average of the 5 numbers: %.2f%n", totalAvg);
		
		
		
	}

}
