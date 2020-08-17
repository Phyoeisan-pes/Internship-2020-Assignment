package InheritanceDemo;

class A1 {
	 void displayA() {
	System.out.println("This is display method of class A");
	  }
}
class B1 extends A1{
	 void displayB() {
		 System.out.println("This is display method of class B");
	 }
}

class C1  extends B1{
	 void displayC() {
		 System.out.println("This is display method of class C");
	 }
}
public class MultipleInheritance {
		public static void main(String[] args) {
			C1 obj=new C1();
			obj.displayA();
			obj.displayB();
			obj.displayC();
			
		}
	}
