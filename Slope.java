import java.util.Scanner;

public class Slope {

  // do not change any of this code, for testing purposes only
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the coordinates of point 1 with a space between x y:");
    int firstX = in.nextInt(); // stores x of first coordinate
    int firstY = in.nextInt(); // stores y of first coordinate
    System.out.println("Enter the coordinates of point 2 with a space between x y:");
    int secondX = in.nextInt(); // stores x of second coordinate
    int secondY = in.nextInt(); // stores y of second coordinate

    if (firstX == secondX && firstY == secondY) {
      System.out.println("These points are the same!");
      System.out.println("Equation of the line: there is not a unique line through these points");
      System.exit(0);
    }
    calcSlope(firstX, firstY, secondX, secondY);// will not print
    calcYIntercept(firstX, firstY, secondX, secondY);// will not print
    if ((firstX == secondX)) {
      System.out.println("Alert! The line is vertical.");
    } else if (firstY == secondY) {
      System.out.println("Alert! The line is horizontal.");
    }

    System.out.println(printEquation(firstX, firstY, secondX, secondY, "y", "c")); // will print

  }

  // type your methods here

  public static String printEquation(int x, int y, int x2, int y2, String n, String b) {

    double slope = calcSlope(x, y, x2, y2);
    double cept = calcYIntercept(x, y, x2, y2);
    int a = (int) cept;

    if (cept > 0) {
      b = "x+";
    } else if (cept < 0) {
      b = "x";
    }
    if (x == x2) {
      b = "";
    }
    if (y == y2) {
      b = "";

    }

    if (slope == 0) {
      System.out.println("Equation of the line: " + n + "=" + b + a);
    } else if (x == x2) {
      System.out.println("Equation of the line: " + "x" + "=" + x);
    }

    return "Equation of the line: " + n + "=" + calcSlope(x, y, x2, y2) + b + calcYIntercept(x, y, x2, y2);

  }

  public static double calcSlope(double x, double y, double x2, double y2) {

    return (((y2 - y) / (x2 - x)));

  }

  public static double calcYIntercept(double x, double y, double x2, double y2) {

    double ycept = (y - (calcSlope(x, y, x2, y2) * x));

    return ycept;
  }

}