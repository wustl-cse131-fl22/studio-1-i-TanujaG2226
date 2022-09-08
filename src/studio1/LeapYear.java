package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Year");
		int year = in.nextInt();
		
		boolean is4 = year%4 == 0;
		boolean is100 = year%100 != 0;
		boolean is400 = year%400 == 0;
		
		boolean isLeapYear = is4 && is100 || is400;
		System.out.println(isLeapYear);
		
	}

}
