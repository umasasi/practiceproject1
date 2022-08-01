package Practicework;
import java.util.*;

public class Maps 
{
	 
	  
	public static void main(String[] args)
	{  
	    Map mapping=new HashMap();  
	     
	    mapping.put(1,"Rahim");  
	    mapping.put(5,"Vijay");  
	    mapping.put(2,"Kishore");  
	    mapping.put(6,"Abi");   
	    Set set=mapping.entrySet();  
	    Iterator iter=set.iterator();  
	    while(iter.hasNext())
	    {  
	         
	        Map.Entry entry=(Map.Entry)iter.next();  
	        System.out.println(entry.getKey()+ " - "+entry.getValue()); 
	      
	        
	    }  
	}  
}  


