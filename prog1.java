interface I1
{
	 int a=5;
	public void print();
}
interface I2
{	int b=8;
	public void printl();
}
public class prog1 implements I1,I2{
	public void print()
	{	
		System.out.println("value of a is 5");
	}
	public void printl()
	{
		System.out.println("value of b is 8");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prog1 obj=new prog1();
		obj.print();
		obj.printl();

	}

}
