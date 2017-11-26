import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myclass math=new Myclass();
		Scanner input=new Scanner(System.in);
		System.out.println("Wellcome our java calculator");
		System.out.println("----------------------------");
		System.out.println("Enter first number:");
		int num1=input.nextInt();
		System.out.println("Enter second number:");
		int num2=input.nextInt();
		System.out.println("Enter (+,-,*,/) for calculation:");
		String operation=input.next();
		
		if(operation.equals("+")){
			System.out.println(math.add(num1, num2));
		}
		else if(operation.equals("-")){
			System.out.println(math.substract(num1, num2));
		}
		else if(operation.equals("*")){
			System.out.println(math.multiply(num1, num2));
		}
		else if(operation.equals("/")){
			System.out.println(math.division(num1, num2));
		}
		else
			System.out.println("operation is not valid10");
		
		

	}

}
