package com.Line_compa;

import java.util.*;

class calculation {

	public static void lenght_of_line() {
		int x1, x2, y1, y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the x1 and y1 co-ordinates");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("\n Enter the x2 and y2 co-ordinates");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		double Lenght_Of_Line = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("lenght of Line is :" + Lenght_Of_Line);
	}
}

public class LineComparisonoop extends calculation {

	public static void main(String args[]) {
		System.out.println("WELCOME TO LINE COMPARISON PROGRAM");
		lenght_of_line();
	}

}
