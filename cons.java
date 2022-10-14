package constructor;

public class cons
{
int id;
String name;
int age;
void display()
{
	System.out.println(id+" "+name+" "+age);
}
cons(int i,String n)
{
	id =i;
	name= n;
}
cons()
{
	id =0;
	name= "";
	age=0;

}
cons(int i,String n,int a)
{
	id =i;
	name= n;
	age = a;
}
cons (cons s)
{
	id = s.id;
	name = s.name;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons c1= new cons(111,"Vanshu");
		cons c2 = new cons(121,"Vanshu",18);
		cons c3 = new cons();
		cons c4 = new cons(c1);
		c1.display();
		c2.display();
		c3.display();
		c4.display();
		

	}

}
