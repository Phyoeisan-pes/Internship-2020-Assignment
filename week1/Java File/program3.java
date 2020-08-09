package Javaprogram;

import java.util.*;

public class program3 
  {
	 public void  Calculator()
	    {
	    }
		 
	 
	 public static void main(String[] args)
	   {
		 int valueOne=10;
		
		 int valueTwo=5;
		 Calculator myCalculator=new Calculator();
		 int addResult=myCalculator.add(valueOne,valueTwo);
		 int subValue=myCalculator.sub(valueOne,valueTwo);
		 int mulValue=myCalculator.mul(valueOne,valueTwo);
		 int divValue=myCalculator.div(valueOne,valueTwo);
		 System.out.println("add:"+addResult);
		 System.out.println("sub:"+subValue);
		 System.out.println("mul:"+mulValue);
		 System.out.println("div:"+divValue);
		 
		 
	 }
	 public int add(int x,int y)
	  {
		  return x+y;
	  }
	 public int sub(int x,int y)
	  {
		  return x-y;
	  }
	 public int mul(int x,int y)
	  {
		  return x*y;
	  }
	 public int div(int x,int y)
	  {
		  return x/y;
	  }
	      
	 
  }




	
	
	
	
	
	
	
	
	
	
	
	
	
	
  

	
	
	



