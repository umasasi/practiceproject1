package Practicework;

 class Student
{
       String name="Vicky";
       int idnum=123;
       String name1="Hari";
       int idnum1=456;
       
      void disp()
      {
    	  System.out.println("Name is : "+name);
    	  System.out.println("Idnum is : "+idnum);
      }
      void disp1()
      {
    	  System.out.println("Name is : "+name1);
    	  System.out.println("Idnum is : "+idnum1);
    	  
      }
      
}
 public class Constructor
 {
	 public static void main(String[] args)
	 {
		 Student s1 = new Student();
		 Student s2 = new Student();
		 
		 s1.disp();
		 s2.disp1();
	 }
	 
 }
