import java.util.Scanner;


public class gitClass {

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
				
		System.out.println("Welcome to Git class! Please enter your name:");
		String name = in.next();
		System.out.println("Hello " + name + "!");
		System.out.println("How old are you?");
		int age = in.nextInt();
		System.out.println("Ok," + age +"years");
		

	}
}
