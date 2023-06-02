public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point.toString());
        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
