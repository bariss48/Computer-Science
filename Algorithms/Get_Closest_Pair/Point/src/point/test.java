/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author Acer
 */
public class test {
    
    public static void main(String[] args) {
        
     
        
        
        Point nokta = new Point(12.12,1.56);
        Point nokta1 = new Point(12.1,1.46);
        Point nokta2 = new Point(14.8,1.26);
        Point nokta3 = new Point(8.12,1.56);
        Point nokta4 = new Point(11.12,1.56);
        Point nokta5 = new Point(1.12,1.56);
        
        Point[] noktalarP = new Point[6]; // 0 1 2 3 4 5
         
         for (int i = 0; i < 5; i++) {
            noktalarP[i] = nokta;
        }
        
        nokta.getClosestPair(noktalarP);
        
    }
    
}
