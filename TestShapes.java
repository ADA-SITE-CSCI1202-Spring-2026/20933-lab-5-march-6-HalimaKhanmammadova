class TestShapes {
    public static void main(String[] args) {
        // Exercise 2
        System.out.println("=== Exercise 2 ===");
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

        // Exercise 3
        System.out.println("\n=== Exercise 3 ===");
        Object o1 = new Rectangle(5, 10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);
        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: " + o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));

        // Exercise 6
        System.out.println("\n=== Exercise 6 ===");
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