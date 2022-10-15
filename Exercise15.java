import java.util.Scanner;
public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("numbers after swapping are" + a +b);
		sc.close();
		
		

	}

}
