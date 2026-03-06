interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Point implements Movable {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() { y++; }
    @Override
    public void moveDown() { y--; }
    @Override
    public void moveLeft() { x--; }
    @Override
    public void moveRight() { x++; }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

class Circle implements Movable {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp() { center.moveUp(); }
    @Override
    public void moveDown() { center.moveDown(); }
    @Override
    public void moveLeft() { center.moveLeft(); }
    @Override
    public void moveRight() { center.moveRight(); }

    @Override
    public String toString() {
        return "Circle(center=" + center + ", radius=" + radius + ")";
    }
}

class Main {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        System.out.println("Before: " + p);
        p.moveUp();
        p.moveRight();
        System.out.println("After moveUp + moveRight: " + p);

        Circle c = new Circle(new Point(5, 5), 3.0);
        System.out.println("Before: " + c);
        c.moveDown();
        c.moveLeft();
        System.out.println("After moveDown + moveLeft: " + c);
    }
}