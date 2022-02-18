/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoint;


public class MyPoint {

    private double x;
    private double y;
 
   public MyPoint(double x,double y){
       
       this.x=x;
       this.y=y;
       
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
   
   
   
    public double pisagor(){
        
       double uzaklık;
       double toplam=0;
      
       toplam = (x*x) + (y*y);
        
       uzaklık = Math.sqrt(toplam);
        
        return uzaklık;
        
    }
   
   public void göster(){
       
       
       System.out.print(x+" "+y);
       
       
       
   }
   
   
   
    
}
