package AbstractionDemo;

public class Car implements Brakes {
	 public void applyBrake(int speed) {
		 for (int i=speed;speed>0;speed--)
		 {
			 System.out.println("Car speed "+speed);
		 }
	 }

	

}
