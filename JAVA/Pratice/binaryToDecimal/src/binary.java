

/**
 *
 * @author ßæ®ı$
 */
public class binary {

  
    public static void main(String[] args) {
        
        
        
       System.out.print( binaryToDecimal("10001") );
        
    }
    
    
    
    public static double binaryToDecimal(String str){
        int sayac=0;  
        double sum=0;
        char []tut = new char[str.length()+1];  
        double[] kaydet = new double[str.length()+1];
        
        tut = str.toCharArray();
        try{
        for (int i = tut.length-1; 0<=i; i--) {
            
            if(tut[i] == '1'){
            kaydet[i]=Math.pow(2,sayac)*1;
            
            }else if(tut[i] == '0'){
                kaydet[i] = 0;
           } 
            
            sayac++;
        }
        
        
        for(int j=0; j<kaydet.length;j++){
          
            sum += kaydet[j]; 
            
        }
        
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
        
        return sum;
        
    }
}
