import java.lang.Math.*;
import java.util.*;

public class Methods1 {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
		// Test for tripleIt()
		double tripled = tripleIt(7.3);
		System.out.println("7.3 tripled is " + tripled);
		double tripleMe = 11;
		System.out.println(tripleMe + " tripled is " + tripleIt(tripleMe));

		// Test for totalSeconds()
		System.out.println(totalSeconds(10, 20, 25));
    System.out.println("total time in seconds is " + totalSeconds(10, 20, 25));

		// Test for displayAverageGrade()
		displayAverageGrade("Bob Zurunkle", 78, 89);
		displayAverageGrade("Odin Hall", 13, 8);

		// Tests scientific()
    System.out.println(scientific(6.23, 5));
    System.out.print("Number to be exponentiated: ");
    double x = Double.valueOf(sc.nextLine());
		System.out.print("Exponent: ");
		int y = Integer.valueOf(sc.nextLine());
		System.out.println(scientific(x, y));

		// Tests cylinderSurfaceArea()
    System.out.println(cylinderSurfaceArea(3.0, 4.5));
		System.out.print("Radius: ");
    double r = Double.valueOf(sc.nextLine());
		System.out.print("Height: ");
		double h = Double.valueOf(sc.nextLine());
		System.out.println(cylinderSurfaceArea(r, h));
	}

	// Returns x, tripled
	static double tripleIt(double x) {
		return x * 3;
	}

	// Returns the number of seconds in the amount of time input
  static int totalSeconds(int hour, int min, int sec) {
    return hour * 3600 + min * 60 + sec;
  }

	// Displays to console the grade report of the student by summing their midterm and final exam grades and showing their student name
	static void displayAverageGrade(String studentName, int midterm, int finalExam) {
		double avgGrade = ((double)midterm + (double)finalExam) / 2;
		System.out.println(studentName + ": " + avgGrade + "%");
	}

	// Raises x to the power of y
  static double scientific(double x, int y) {
    return Math.pow(x,y);
    
  }

	// Method takes in height and radius and outputs the surface area of a cynlinder.
	// rawr rawr rawr rawr rawr rawr rawr rawr rawr rawr rawr rawr rawr rawr rawr rawr
	// mrarawwwwawwrrrarawwwawwrrrarrwwrrrrr
  static double cylinderSurfaceArea(double radius, double height){
    return 2 * (Math.PI) * radius * (radius + height);
  }
}