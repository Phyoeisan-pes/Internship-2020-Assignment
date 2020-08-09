package Javaprogram;

public class program5
{
	  public static void main(String[] args)
	    {
		  String[] studentNames=new String[10];
		  studentNames[0]="phyo";
		  studentNames[1]="ei";
		  studentNames[2]="san";
		  studentNames[3]="myo";
		  studentNames[4]="pa";
		  studentNames[5]="kyaw";
		  studentNames[6]="zar";
		  studentNames[7]="nu";
		  studentNames[8]="hnin";
		  studentNames[9]="tun";
		  
		   for (int i=0; i<studentNames.length;i++)
		   {
			   if(studentNames[i]=="phyo")
			   {
				   System.out.println("I'm " + studentNames[i]);
				   System.out.println();
				   System.out.println("and my index is:"+i);
				   System.out.println();
			   }
		   }
		  
	    }

}
