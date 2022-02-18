/**
 *
 * @author 08.10.2021 // BARIS
 */
public class test extends Point{
 
    public static void main(String[] args) {
        
        Point my_point = new Point(5,4);
        Point my_point_second = new Point(-4,-2);
        System.out.println(my_point.distance(my_point));
        System.out.println(distance(my_point, my_point_second));
    }

    @Override
    public double distance(Point a) {
        return super.distance(a); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static double distance(Point a,Point b) {
        return Math.sqrt(Math.abs(Math.pow(a.getX() - b.getX(),2) + Math.pow(a.getY() - b.getY(),2)));
    }
    
}
