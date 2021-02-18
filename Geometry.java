import java.util.Scanner;


	public class Geometry {

  		public static void main (String[] args) {


Scanner input = new Scanner(System.in);

  	double volume;
  	double radius;
	double area;
	double length;
	double PIE = 3.142;

	System.out.print ("Enter the radius of the Cylinder");
 		radius = input.nextDouble();
		System.out.print ("Enter the length of the Cylinder");
 			length = input.nextDouble();

		area = PIE * ( radius * radius);
                      System.out.println("The Area of a Cylinder is " + area);

		volume = area * length;
                      System.out.println("The volume of a Cylinder is " + volume); 



}

}