/**
 * Created by Aaron on 26/10/2015.
 */
public class UnitVector extends Vector {

    DirectionVector vector;

    public UnitVector(double x, double y){
        setXY(x,y);
    }
    public UnitVector(DirectionVector vector){
        setXY(vector.x(),vector.y());
        this.vector = vector;
    }

    private void setXY(double x,double y) {
        if(x==0 && y==0){
            this.x = 0;
            this.y = 0;
        }else {
            double mod = Math.sqrt(x * x + y * y);
            this.x = x / mod;
            this.y = y / mod;
        }
    }

}
