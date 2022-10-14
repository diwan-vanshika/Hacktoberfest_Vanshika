import java.util.Scanner;
public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double a= sc.nextDouble();
		double perimeter = 2* Math.PI * a;
		System.out.println("Perimeter of circle is" + perimeter);
		System.out.println("Area of circle is"+((Math.PI)*a*a));
		sc.close();		
	}

}
