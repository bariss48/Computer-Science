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
       
       Point[] array = new Point[5];
       
       double en_kısa_yol  = Double.MAX_VALUE;
        
       Point ilknokta = new Point(x,y);
       Point ikinci_nokta = new Point(x,y);
      
       
 
        for (int i = 0; i <noktalarP.length; i++) {
            
           for (int j = i+1; j <noktalarP.length; j++) {
            
               if(Math.sqrt(Math.pow(Math.abs(noktalarP[i].getX()-noktalarP[j].getX()),2)+ Math.pow(Math.abs(noktalarP[i].getY()-noktalarP[j].getY()),2 ))<en_kısa_yol){
                   
                   en_kısa_yol = Math.sqrt(Math.pow(Math.abs(noktalarP[i].getX()-noktalarP[j].getX()),2)+ Math.pow(Math.abs(noktalarP[i].getY()-noktalarP[j].getY()),2 ));
                   
                   ilknokta.x = noktalarP[i].getX();
                   ikinci_nokta.x = noktalarP[j].getX();
                   ilknokta.y = noktalarP[i].getY();
                   ikinci_nokta.y = noktalarP[j].getY();
                
               }
           
           }
           
        }
       
        array[0] = ilknokta;
        array[1] = ikinci_nokta;
        
        
        
        
        return array;
    }
    
    public Point[] getClosestPair (Point [] noktalarP, Point [] noktalarQ)
    {
        
        
         return null;
    }
    
    
    
}