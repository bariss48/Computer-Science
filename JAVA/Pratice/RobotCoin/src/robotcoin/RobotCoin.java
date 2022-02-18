
package robotcoin;


public class RobotCoin {
    
    public static void main(String[] args) {
        
        int[][] array = new int [3][14];
        
        System.out.println(maxValue(array));
        
        System.out.println(array[0].length);
        
        System.out.println(deneme(array));
        
        
    }

   
   public static double maxValue(int [][] plane){
        int [][] temp_array = new int [plane.length-1][plane[0].length-1];
        int maxpara=0;
        int i=0;
        int j=0;
        
        if( (i == plane.length) && (j == plane[0].length) ) {
            
            return maxpara;
            
        }
        else
            
            
        
             
           
       return maxValue(plane);    
}
   
   
   public static double deneme(int [][] array){
       
       int [][] satisTablosu = new int[3][12];
             
      for(int i=0; i<satisTablosu.length; i++) {
          System.out.println();
            for(int j=0; j<satisTablosu[0].length; j++) {
                System.out.print(satisTablosu[i][j]+"  " );
            }
   }
   
   return satisTablosu[0].length;
   
}
}

