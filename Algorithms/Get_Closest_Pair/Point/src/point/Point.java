
package point;

import java.util.ArrayList;
import java.util.Objects;
import java.awt.geom.Point2D;

public class Point{
    // Ister brute-force, ister divide and conquer çözebilirsiniz, 
    //(Brute-force için ilk metodu , divide and conquerı yapacaksanız ikinci metodu kullanınız)
   
    //getter ve setterları da olmalı
    
   public double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public Point[] getClosestPair (Point[] noktalarP){
       
       double en_kısa_yol  = Double.MAX_VALUE;
       
       int counter = 0;
       int count = 0;
       int sayac = 0;
       int sayac_iki = 1;
    
        for(int i = 0; i < noktalarP.length; i++){
            
            //!noktalarP[i].equals(null)
            
            if(noktalarP[i] != null){
                
                counter++;
                
            }
           
        }
       
        Point[] real_array = new Point[counter-1];
        
        for(int i = 0; i < noktalarP.length; i++){
            
            if(noktalarP[i] != null){
                
               real_array[i] = noktalarP[i];
                
            }
           
        }
        
        for (int i = 0; i <real_array.length-1; i++) {
            
           for (int j = i+1; j <real_array.length; j++) {
              
               if(Math.sqrt(Math.pow(Math.abs(real_array[i].getX()-real_array[j].getX()),2)+ Math.pow(Math.abs(real_array[i].getY()-real_array[j].getY()),2 ))<en_kısa_yol){
                   
                   en_kısa_yol = Math.sqrt(Math.pow(Math.abs(real_array[i].getX()-real_array[j].getX()),2)+ Math.pow(Math.abs(real_array[i].getY()-real_array[j].getY()),2 ));
                   
               }
           
        }
        }
        
         for (int i = 0; i <real_array.length-1; i++) {
            
           for (int j =i+1; j <real_array.length; j++) {
            
               if(Math.sqrt(Math.pow(Math.abs(real_array[i].getX()-real_array[j].getX()),2)+ Math.pow(Math.abs(real_array[i].getY()-real_array[j].getY()),2 )) == en_kısa_yol){
                   
                   count++;
                
               }
           
           }
           
        }
         
        Point[] array = new Point[(count*2)-1];
         
         for (int i = 0; i <real_array.length-1; i++) {
            
           for (int j =i+1; j <real_array.length; j++) {
            
               if(Math.sqrt(Math.pow(Math.abs(real_array[i].getX()-real_array[j].getX()),2)+ Math.pow(Math.abs(real_array[i].getY()-real_array[j].getY()),2 )) == en_kısa_yol){
                   
                   Point temp = new Point(x,y);
                   Point temp_iki = new Point(x,y);
                   
                   temp.x = real_array[i].getX();
                   temp_iki.x = real_array[j].getX();
                   temp.y = real_array[i].getY();
                   temp_iki.y = real_array[j].getY();
                 
                   array[sayac] = temp;
                   array[sayac_iki] = temp_iki;
                   
                   temp = null;
                   temp_iki = null;
                   
                   if(sayac < count-2 && sayac_iki < count-2){  
                   
                        sayac += 2;
                        sayac_iki += 2;
                        
                   }
                
               }
           
           }
           
        }
         
      
        return array;
    }
    
    public Point[] getClosestPair (Point [] noktalarP, Point [] noktalarQ){
        
        
         return null;
    }
   
}