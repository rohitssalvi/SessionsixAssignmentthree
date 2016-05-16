package sessionsixAssignmentthree;

import java.util.Scanner;

public class DifferntShapes {
	public static void main(String[] args) {
		 System.out.println("Shapes Are:");
		 System.out.println("Circle");
		 System.out.println("Rectangle");
		 System.out.println("Triangle");
		 System.out.println("Square");
		 
		 
		
		
	 System.out.print("Enter the shape Show On Editor:");
		Scanner input=new Scanner(System.in);
		String shapeName=input.next();
 		GetShape sha=new GetShape();
 		sha.draw(shapeName);
 		sha.getArea();
 		
}

}
interface Shapes{
	
    void draw(String s);
	void getArea();
}


class GetShape implements Shapes{

	String shape2;
	
   @Override
	public void getArea() {
	   
	if(shape2.equalsIgnoreCase("circle"))
	{
		System.out.print("Enter The Radius:");
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		System.out.println(shape2+"Area is:"+ 3.14*(i*i));
		
	}
	if(shape2.equalsIgnoreCase("rectangle"))
	{
		System.out.print("Enter The length:");
		Scanner input=new Scanner(System.in);
		int l=input.nextInt();
		System.out.print("Enter The width:");
		Scanner input2=new Scanner(System.in);
		int w=input2.nextInt();
		System.out.println(shape2+"Area is:"+ l*w);
		
	}
	
	if(shape2.equalsIgnoreCase("triangle"))
	{
		System.out.print("Enter The length:");
		Scanner input=new Scanner(System.in);
		int l=input.nextInt();
		System.out.print("Enter The bregth:");
		Scanner input2=new Scanner(System.in);
		int b=input2.nextInt();
		System.out.println(shape2+"Area is:"+ (l*b)/2);
		
	}
	
	if(shape2.equalsIgnoreCase("square"))
	{
		System.out.print("Enter The Side:");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		
		System.out.println(shape2+"Area is:"+ a*a);
		
	}
	}
		
	@Override
	public void draw(String s) {
		// TODO Auto-generated method stub
		shape2=s;
	}
	
	
	
}