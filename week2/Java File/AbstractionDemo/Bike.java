package AbstractionDemo;

public class Bike implements Brakes {


	 public void applyBrake(int speed) {
		 for (int i=speed;speed>0;speed--)
		 {
			 System.out.println(" Bike speed "+ speed);
		 }
	 }

}
