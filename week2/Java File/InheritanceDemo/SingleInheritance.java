package InheritanceDemo;


     class A{
    	  void displayA() {
    		  System.out.println("This is display method of class A");
    	  }
     }
     class B extends A{
    	 void displayB() {
    		 System.out.println("This is display method of class B");
    	 }
     }
     public class SingleInheritance {
    		public static void main(String[] args) {
    			B obj=new B();
    			obj.displayA();
    			obj.displayB();
    			
    		}
    	}

