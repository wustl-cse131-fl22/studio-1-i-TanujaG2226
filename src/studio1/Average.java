package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter first integer");
	int n1 = in.nextInt();
	System.out.println("Enter second integer");
	int n2 = in.nextInt();
	
	double average = (n1+n2)/2;
	System.out.println(average);

	}

}
