package exercise8;

public class Point {
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        x = otherPoint.x;
        y = otherPoint.y;
    }

    public void initialize() {
        System.out.print("Enter the value of x: ");
        x = Utils.INPUT.nextDouble();
        System.out.print("Enter the value of y: ");
        y = Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        x += xDelta;
        y += yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        double newX = x + xDelta;
        double newY = y + yDelta;
        return new Point(newX, newY);
    }

    public boolean equals(Point otherPoint) {
        boolean checkx = Utils.equals(x, otherPoint.x);
        boolean checky = Utils.equals(y, otherPoint.y);
        return checkx && checky;
    }

    public String toString() {
        // Represent attributes as string
        return "(" + x + ", " + y + ")";
    }
}
