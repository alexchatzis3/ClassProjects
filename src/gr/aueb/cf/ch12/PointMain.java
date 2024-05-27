package gr.aueb.cf.ch12;

/**
 * Driver class.
 */
public class PointMain {

    public static void main(String[] args) {

        Point p1 = new Point(1,2);
        Point p2 = new Point(11,0);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(5);

        System.out.println("Point1 State");
        System.out.println("X: " +p1.getX());
        System.out.println("Y: " +p1.getY());

        System.out.println("Point2 State");
        System.out.println("X: " + p2.getX());
        System.out.println("Y: " + p2.getY());

        System.out.println("Point3 State");
        System.out.println("X: " + p3.getX());
        System.out.println("Y: " + p3.getY());

        System.out.println("Total count of created points: " + Point.getNoOfPoints());
    }
}
