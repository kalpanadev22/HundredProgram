
package Thecodeworld;

import java.util.Scanner;

public class A31_rootsofquadratic {

static void Equation(double a,double b,double c) {
		
		double root1,root2;
		
		double determinant=b*b-4*a*c;
		
		if(determinant>0) {
			root1=(- b + Math.sqrt(determinant))/(2*a);
			root2=(- b - Math.sqrt(determinant))/(2*a);
			System.out.printf("root1=%2.f and root2=%2.f",root1,root2);
		}
		
		else if(determinant== 0)
		{
			root1=root2=-b/(2*a);
			System.out.printf("root1=root2=%2.f;",root1);
		}
		else {
			double real=-b/(2*a);
			double imaginary=Math.sqrt(-determinant)/(2*a);
			System.out.printf("root1=%.2f+%.2fi",real,imaginary);
			System.out.printf("\nroot2=%.2f-%.2fi",real,imaginary);
			
		}

	}

	public static void main(String[] args) {

     Scanner in=new Scanner(System.in);
     System.out.println("Enter the three values:");
     double a=in.nextDouble();
     double b=in.nextDouble();
     double c=in.nextDouble();
     Equation(a,b,c);


		
	}

}