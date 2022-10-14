import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter length of rectangle");
		int a=sc.nextInt();
		System.out.println("Enter breadth of rectangle");
		int b= sc.nextInt();
		int area= a*b;
		int perimeter=2*(a*b);
		System.out.println("ARea of rectangle is "+ area);
		System.out.println("Perimeter of rectangle is "+ perimeter);
		sc.close();
		
		
		
	}

}
