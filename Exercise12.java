import java.util.Scanner;
public class Exercise12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b= sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
		int d= (a+b+c)/3;
		System.out.println("Average of the numbers is "+ d);
		
		sc.close();
	}

}
