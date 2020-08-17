package InheritanceDemo;

class A2 {
	 void displayA() {
	System.out.println("This is display method of class A");
	  }
}
class B2 extends A2{
	 void displayB() {
		 System.out.println("This is display method of class B");
	 }
}

class C2  extends A2{
	 void displayC() {
		 System.out.println("This is display method of class C");
	 }
}
public class HierarchicalInheritance {
		public static void main(String[] args) {
			C1 obj=new C1();
			obj.displayA();
			obj.displayB();
			obj.displayC();
			
		}
	}


