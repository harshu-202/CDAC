import java.util.*;

class Voting{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int a = sc.nextInt();

        if (a >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote. You must be at least 18 years old.");
        }

    }
}
