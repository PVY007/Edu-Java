
class Point
{
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("X coordinate: " + x);
        System.out.println("Y coordinate: " + y);
    }

    public static void main(String[] args) {
        Point p = new Point(10, 20);
        p.display();
    }
}