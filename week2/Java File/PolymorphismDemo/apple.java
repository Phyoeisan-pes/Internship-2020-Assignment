package PolymorphismDemo;

public class apple {
	 public static void main(String[] args) {

          food bucky[] = new food[2];
          bucky[0] = new grap();
          bucky[1] = new orange();
          
          for (int i=0;i<2; ++i) {
          
        	   bucky[i].eat();
          }
          
	 }
}
