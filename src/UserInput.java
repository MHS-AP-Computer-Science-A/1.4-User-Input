import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		System.out.println("Are you a student? ");
		boolean isStudent = input.nextBoolean();
		
		System.out.println("What us your GPA? ");
		double gpa = input.nextDouble();
		

	}
}
