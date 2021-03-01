import java.util.*;
public final class Point { 
    private final double x;    
    private final double y;    
   
    
    public Point() {
        x = StdRandom.uniform(0.0, 1.0);
        y = StdRandom.uniform(0.0, 1.0);
    }

    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public double x() { return x; }
    public double y() { return y; }
    public double r() { return Math.sqrt(x*x + y*y); }
    public double theta() { return Math.atan2(y, x); }

   
    public double distanceTo(Point that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    
    public String toString() {
        return "(" + x + ", " + y + ")";
    } 



    // test client
    public static void main(String[] args) {
        Point p = new Point();
        StdOut.println("p  = " + p);
        StdOut.println("   x     = " + p.x());
        StdOut.println("   y     = " + p.y());
        StdOut.println("   r     = " + p.r());
        StdOut.println("   theta = " + p.theta());
        StdOut.println();

        Point q = new Point(0.5, 0.5);
        StdOut.println("q  = " + q);
        StdOut.println("dist(p, q) = " + p.distanceTo(q));
    }
}
