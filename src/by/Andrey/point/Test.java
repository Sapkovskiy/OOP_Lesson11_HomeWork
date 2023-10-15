package by.Andrey.point;

public class Test {
    public static void main(String[] args) {
        Point point1 =new Point(1,1);
        Point point2 = new Point(6,6);
        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));
        Rectangle rec =new Rectangle(point1,point2);
        System.out.println(rec.getArea());
        System.out.println(rec.getDiagonal());
    }
}
