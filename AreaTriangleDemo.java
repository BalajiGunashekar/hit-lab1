package basic;

import java.util.Scanner;

public class AreaTriangleDemo {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Width of the Triangle:");
		double base = scanner.nextDouble();
		System.out.println("Enter the height of thr Triangle");
		double height =scanner.nextDouble();
		double area = (base* height)/2;
		System.out.println("Area of Triangle is: "+area);
	}

}
