package by.Andrey.point;

public class Rectangle {
    private Point LeftLowCorner;
    private Point RightUpperCorner;

    public Rectangle (Point LeftLowCorner,Point RightUpperCorner){
        this.LeftLowCorner=LeftLowCorner;
        this.RightUpperCorner=RightUpperCorner;
    }
    public double getDiagonal(){
        double a = LeftLowCorner.distance(RightUpperCorner);
        return a;
    }
    public int getArea(){
        int a = (LeftLowCorner.getX()-RightUpperCorner.getX())*(LeftLowCorner.getY()-RightUpperCorner.getY());
        return a;
    }

}
