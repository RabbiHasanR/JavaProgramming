import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		int user_input_int=scan.nextInt();
		System.out.println("Enter number is");
		System.out.println(user_input_int);
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter decimal:");
		double user_input_double=scan1.nextDouble();
		System.out.println("Enter decimal is");
		System.out.println(user_input_double);
		
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter string:");
		String user_input_string=scan2.nextLine();
		System.out.println("Enter String is");
		System.out.println(user_input_string);

	}

}
