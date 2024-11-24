import java.util.Scanner;
public class IT24104332Lab5Q1{


	public static void main(String[] args){

	int num1, num2, num3;

	int largest_num = 0;
	int smallest_num = 0;

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first integer: ");
	num1 = input.nextInt();

	System.out.print("Enter the second integer; ");
	num2 = input.nextInt();

	System.out.print("Enter the third integer; ");
	num3 = input.nextInt(); 

	System.out.println();

	System.out.println("User entered numbers are : "+num1+" " +num2+" "+ num3+" ");

	if (num1 > num2){
		System.out.print("The Smallest number is: "+ num2);
	}
	else if (num1 > num3){
		System.out.print("The Smallest number is: "+ num3);	
	}
	else{
		System.out.print("The Smallest number is: "+ num1);
	}

	System.out.println();

	if (num1 < num2){
		System.out.print("The Largest number is: "+ num2);
	}
	else if (num1 < num3){
		System.out.print("The Largest number is: "+ num3);
	}
	else{
		System.out.print("The Largest number is: "+ num1);
	}

	}


}
	