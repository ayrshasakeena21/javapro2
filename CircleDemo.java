package lab1; 
import java.util.Scanner;

public class CircleDemo {
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Enter the radius:");
		/* we are storing the entered radius in double
		 * because of user can enter radius in decimals 
		 */
		double radius = sc.nextDouble();
		//Area = PI*radius*radius
		double area = Math.PI * (radius * radius);
		System.out.println("The area of circle is:" + area);
		//Circumference = 2*PI *2*radius
		double circumference= Math.PI *2*radius;
		System.out.println("The circumference of the circleis:"+circumference);
		
		
		

	}

}
