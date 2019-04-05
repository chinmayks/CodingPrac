package Algo;
class Coordinates{
    int x1, y1, x2,y2;

    public Coordinates(int x, int y, int z, int w){
        this.x1 =x;
        this.y1 =y;
        this.x2 = z;
        this.y2 = z;
    }

}

public class RectangleOverlap {

    public boolean rectangleOverlap(Coordinates rect1, Coordinates rect2){
        boolean status = true;



        return status;
    }

    public static void main(String args[]){
        Coordinates rect1 = new Coordinates(5,0,0,3);
        Coordinates rect2 = new Coordinates(6,1,-1,4);

    }

}
