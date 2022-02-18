
/**
 *
 * @author ßæ®ı$
 * 
 */

public class kaçkezbul {

   
    public static void main(String[] args) {
        
        
     
     //NOT !!! BU İKİ METHODUN PARAMETRELERİ AYNI OLMAK ZORUNDADIR!!!
     
     count("Afyonkarahisar");
     yazdır("AFYONKARAHİSAR");
        
        
      
    }
    
    public static int[] count(String str){
        
       int [] göster = new int[str.length()];    
       char[] dizim = new char[str.length()]; 
        
       dizim = str.toCharArray();
           
        int sayac=0;
        
        for(int i=0;i<dizim.length;i++){
            
            for(int j=0;j<dizim.length;j++){
                
            
            if(dizim[i] == dizim[j]){
                
                sayac++;
                göster[i]=sayac;
               
            }     
                        
            }
         
            sayac=0;
            
        }
        
        
        return göster;
    }
    
     public static void yazdır(String str){
         
        char karakter[] = new char[str.length()];
        
        karakter = str.toCharArray();
        
        
        int[] tut = new int[str.length()];
        
        tut=count(str).clone();
         
        
        for(int i=0;i<tut.length;i++){
           
            System.out.println("'"+karakter[i]+"'"+" "+"harfi metnin içinde bu kadar kez kullanılmıştır"+":"+" "+tut[i]);
            
        }
         
         
     }
    
    
    
}
