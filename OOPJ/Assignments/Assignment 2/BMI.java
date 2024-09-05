import java.util.*;

class BMI {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your height in metres");
		float h = sc.nextFloat();
		System.out.println("Enter your weight in kg");
		int w = sc.nextInt();
		float h2 = h*h;
		float B = w / h2;
	
	if (B>0 && B < 18.5){
		System.out.println("Your BMI is "+ B + " and you are underweight");
	} else if (B <= 25 && B >= 18.5){
		System.out.println("Your BMI is "+ B + " and you are normal weight");
	}else if (B > 25){
		System.out.println("Your BMI is "+ B + " and you are overweight");
	}else {
		System.out.println("Your BMI is "+ B);
	}
		
	}
}