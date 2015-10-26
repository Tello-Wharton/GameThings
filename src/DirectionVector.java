/**
 * Created by Aaron on 26/10/2015.
 */
public class DirectionVector extends Vector {
    public DirectionVector(double x, double y){
        setXY(x,y);
    }

    private void setXY(double x,double y) {
        this.x = x;
        this.y = y;
    }
}
