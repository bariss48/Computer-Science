/**
 *
 * @author BARİS 08.10.2021
 */
public class Point {
    
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(){
        // default values are origin point
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distance(Point a){
       return Math.sqrt(Math.abs(Math.pow(a.x,2) + Math.pow(a.y,2)));
    }
       
}
