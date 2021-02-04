package com.Line_compa;

import java.util.*;

class calculation {

	public static void lenght_of_line() {
		int x1, x2, x3, x4, y1, y2, y3, y4;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the x1 and y1 co-ordinates");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("\n Enter the x2 and y2 co-ordinates");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		double Lenght_Of_Line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("lenght of Line is :" + Lenght_Of_Line1);

		System.out.println("\n Enter the x3 and y3 co-ordinates");
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		System.out.println("\n Enter the x4 and y4 co-ordinates");
		x4 = sc.nextInt();
		y4 = sc.nextInt();
		double Lenght_Of_Line2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("lenght of Line is :" + Lenght_Of_Line2);
		Double lenght1 = new Double(Lenght_Of_Line1);
		Double lenght2 = new Double(Lenght_Of_Line2);
		System.out.println(lenght1.equals(lenght2));

	}
}

public class Line_Comparison_oop extends calculation {

	public static void main(String args[]) {
		System.out.println("WELCOME TO LINE COMPARISON PROGRAM");
		lenght_of_line();
	}

}

