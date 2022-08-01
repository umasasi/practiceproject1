package Practicework;

 class 	Colour
{
    int brown = 5;
    int black = 3;
    
    class Quality
    {
    	 int green = 10;
    	 float dispqual()
    	 {
    		 System.out.println("count of brown is : "+brown);
    		 System.out.println("Count of green is : "+green);
    		 return 3.4f;
       	  
    	 }
    	 
    	
    }
    class LightDark
    {
    	float light = 56.4f;
    	int lightcolor()
    	{
    		System.out.println("light color is : "+light);
    		return 34;
    	}
    }
}
 public class InnerClass
 {
	 public static void main(String[] args)
	 {
		 Colour c = new Colour();
		 Colour.Quality quality = c.new Quality();
		 Colour.LightDark lightdark = c.new LightDark();
		 
		 System.out.println("int quality is : "+quality.dispqual());
   	  System.out.println("int lightcolor is : "+lightdark.lightcolor());
	 }
 }
