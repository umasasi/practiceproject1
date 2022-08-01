package Practicework;

public class methodExecution 
{
	 public void calculate(int a, int b)
	 {
		 int result = a+b;
		 System.out.println("adding of two numbers is : "+result);
	 }
	 public void calculate(float g, int h)
	 {
		 System.out.println("Area of Circle is :"+(3.14*g*h));
	 }
	 public void calculate(long  d1, double d2)
	 {
		 System.out.println("Area of rhombus is : "+(d1*d2/2));
	 }
	 public static void main(String[] args)
	 {
		 methodExecution method = new methodExecution();
		 method.calculate(12,10);
		 method.calculate(12.55f,11);
		 method.calculate(123489040,15.67389);
		 
	 }
}