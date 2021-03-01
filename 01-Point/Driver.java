import java.util.*;

public class Driver {
  public static void main (String[] args) {
    ArrayList<Point> points = new ArrayList<Point> ();
    points.add(new Point());
    points.add(new Point(6, 3));
    points.add(new Point(9, -1));
    System.out.println(points);

    System.out.println(points.get(0).midPoint(points.get(1)));
    System.out.println(points.get(0).distance(points.get(2)));
    System.out.println(points.get(0).isCollinear(points.get(1), points.get(2)));

  }

}
