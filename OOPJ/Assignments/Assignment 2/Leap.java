import java.util.*;

class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check");
		int y = sc.nextInt();

        if (y % 400 == 0) {
            System.out.println(y + " is a leap year.");
        } else if (y % 100 == 0) {
            System.out.println(y + " is not a leap year.");
        } else if (y % 4 == 0) {
            System.out.println(y + " is a leap year.");
        } else {
            System.out.println(y + " is not a leap year.");
        }
		  switch (year % 400) {
            case 0:
                System.out.println(year + " is a leap year (checked by switch-case).");
                break;
            default:
                switch (year % 100) {
                    case 0:
                        System.out.println(year + " is not a leap year (checked by switch-case).");
                        break;
                    default:
                        switch (year % 4) {
                            case 0:
                                System.out.println(year + " is a leap year (checked by switch-case).");
                                break;
                            default:
                                System.out.println(year + " is not a leap year (checked by switch-case).");
                        }
    }
}
	}
}
