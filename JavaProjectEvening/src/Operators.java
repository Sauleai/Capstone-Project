
public class Operators {

	public static void main(String[] args) {
		// Arithmetic Operators
		
		int a=10;
		int b=20;
		
		System.out.println(a+b);//30
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//Relational Operators
		System.out.println(a<b);//true
		System.out.println(a>b);//False
		System.out.println(a<=b);//True
		System.out.println(a>=b);//False
		System.out.println(a!=b);//True
		
		//Logical Operators
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);//false
		System.out.println(x || y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		int c;
		c=a;
		System.out.println(c);
		c=b;
		System.out.println(c);
		
		c=100;
		//c=c+1;
		//c++; //c=c+1;//increment operator
		//c+=5;   //c=c+5;
		//c--; //c=c-1; //decrement operator;
		c-=5;
		System.out.println(c);
		
		
		
	}

}
