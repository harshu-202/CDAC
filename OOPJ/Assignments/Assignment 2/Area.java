import java.util.*;

class Area{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the shape whose area is to be calculated: ");
		System.out.println("1. Circle");
		System.out.println("2.Square");
		System.out.println("3.Rectangle");
		System.out.println("4. Triangle");
		int c = sc.nextInt();
		
		switch(c){
			case 1: 
					System.out.println("Enter the radius of a circle: ");
					double r = sc.nextDouble();
					double areaC = Math.PI * r * r;
					System.out.println("Area of the circle of radius "+ r + "is "+ areaC);
					break;
			
			case 2:
					System.out.println("Enter the length of a side of a sqaure: ");
					double s = sc.nextDouble();
					double areaS = s * s;
					System.out.println("Area of the sqaure of side "+ s + "is "+ areaS);
					break;
			case 3:
					System.out.println("Enter the length of rectangle: ");
					double l = sc.nextDouble();
					System.out.println("Enter the breadth of rectangle: ");
					double b = sc.nextDouble();
					double areaR = l * b;
					System.out.println("Area of the rectangle of length "+ l + "and breadth "+ b + "is "+ areaR);
					break;
			case 4:
					System.out.println("Enter the height of the triangle: ");
					double h = sc.nextDouble();
					System.out.println("Enter the base of the triangle: ");
					double base = sc.nextDouble();
					
					double areaT = 0.5 * h * base;
					System.out.println("Area of the triangle of height "+ h + "and base "+ base + "is "+ areaT);
					break;
					
			default:
					System.out.println("Please enter a valid input");
					break;
					
					
		}
	}
}