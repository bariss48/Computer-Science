/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tee
 */
public class nokta {

  

    
    

public class Point{

    
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
       

       int count = 0;
       int sayac = 0;
       int sayac_iki = 1;

        
        for (int i = 0; i <noktalarP.length-2; i++) {
            
           for (int j = i+1; j <noktalarP.length-1; j++) {
              
               if(noktalarP[j]!=null && noktalarP[i]!=null && Math.sqrt(Math.pow(Math.abs(noktalarP[i].getX()-noktalarP[j].getX()),2)+ Math.pow(Math.abs(noktalarP[i].getY()-noktalarP[j].getY()),2 ))<en_kısa_yol){
                   
                   en_kısa_yol = Math.sqrt(Math.pow(Math.abs(noktalarP[i].getX()-noktalarP[j].getX()),2)+ Math.pow(Math.abs(noktalarP[i].getY()-noktalarP[j].getY()),2 ));
                   
               }
           
        }
        }
        
         for (int i = 0; i <noktalarP.length-1; i++) {
            
           for (int j =i+1; j <noktalarP.length; j++) {
            
               if(noktalarP[j]!=null && Math.sqrt(Math.pow(Math.abs(noktalarP[i].getX()-noktalarP[j].getX()),2)+ Math.pow(Math.abs(noktalarP[i].getY()-noktalarP[j].getY()),2 )) == en_kısa_yol){
                   
                   count++;
                
               }
           
           }
        }
        Point[] array = new Point[(count*2)];
         
         for (int i = 0; i <noktalarP.length-1; i++) {
            
           for (int j =i+1; j <noktalarP.length; j++) {
            
               if(noktalarP[j]!=null  && Math.sqrt(Math.pow(Math.abs(noktalarP[i].getX()-noktalarP[j].getX()),2)+ Math.pow(Math.abs(noktalarP[i].getY()-noktalarP[j].getY()),2 )) == en_kısa_yol){
                   Point temp = new Point(x,y);
                   Point temp_iki = new Point(x,y);
                   temp.x = noktalarP[i].getX();
                   temp_iki.x = noktalarP[j].getX();
                   temp.y = noktalarP[i].getY();
                   temp_iki.y = noktalarP[j].getY();
                   array[sayac] = temp;
                   array[sayac_iki] = temp_iki;
             
                   
                
                   
                        sayac += 2;
                        sayac_iki += 2;
                   
                
               }
           
           }
           
        }
         
      
        return array;
    }
    
    public Point[] getClosestPair (Point [] noktalarP, Point [] noktalarQ){
        
        
        double en_kısa_yol  = Double.MAX_VALUE;
        double en_kısa_yol_ikinci = Double.MAX_VALUE;
        
        int j = 0;
        int i = 0;
        
        if( (noktalarP[i] != null) && (noktalarQ[j] != null) && (noktalarQ.length == 1) && (noktalarP.length == 1) ){
            
            return noktalarP;
            /*
            double mesafe_p = 0;
            double mesafe_q = 0;
           
             Point[] yakala = new Point[2];
             Point nesne = new Point(x,y);
            
             mesafe_p = Math.sqrt(Math.pow(Math.abs(noktalarP[i].getX()-noktalarP[j].getX()),2)+ Math.pow(Math.abs(noktalarP[i].getY()-noktalarP[j].getY()),2 ));
             */
             
             
             
            
        }
        
        
        
        
        
        
        
        
        
        
        
        /*
        
         for (int i = 0; i <noktalarP.length-2; i++) {
            
           for (int j = i+1; j <noktalarP.length-1; j++) {
              
               if(noktalarP[j]!=null && noktalarP[i]!=null && Math.sqrt(Math.pow(Math.abs(noktalarP[i].getX()-noktalarP[j].getX()),2)+ Math.pow(Math.abs(noktalarP[i].getY()-noktalarP[j].getY()),2 ))<en_kısa_yol){
                   
                   en_kısa_yol = Math.sqrt(Math.pow(Math.abs(noktalarP[i].getX()-noktalarP[j].getX()),2)+ Math.pow(Math.abs(noktalarP[i].getY()-noktalarP[j].getY()),2 ));
                   
               }
           
        }
        }
        
         
           for (int i = 0; i <noktalarQ.length-2; i++) {
            
           for (int j = i+1; j <noktalarQ.length-1; j++) {
              
               if(noktalarQ[j]!=null && noktalarQ[i]!=null && Math.sqrt(Math.pow(Math.abs(noktalarQ[i].getX()-noktalarQ[j].getX()),2)+ Math.pow(Math.abs(noktalarQ[i].getY()-noktalarQ[j].getY()),2 ))<en_kısa_yol){
                   
                   en_kısa_yol_ikinci = Math.sqrt(Math.pow(Math.abs(noktalarQ[i].getX()-noktalarQ[j].getX()),2)+ Math.pow(Math.abs(noktalarQ[i].getY()-noktalarQ[j].getY()),2 ));
                   
               }
           
        }
        }
        */
          
         
       
         
         
         
        
        
        
        
        
        
        
        
        
        
         return null;
    }
    
    
    
    
    
}
}