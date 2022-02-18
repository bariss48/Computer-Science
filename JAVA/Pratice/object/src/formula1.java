
 //@author Barış
 
public class formula1 {
    
    
    private String ferrari;
    private String mercedes;
    private String mclaren;
    private int sampiyonluksayisi;
    
    public String getFerrari() {
        return ferrari;
    }

    
    public void setFerrari(String ferrari) {
        this.ferrari = ferrari;
    }

    
    public String getMercedes() {
        return mercedes;
    }

   
    public void setMercedes(String mercedes) {
        this.mercedes = mercedes;
    }

    
    public String getMclaren() {
        return mclaren;
    }

  
    public void setMclaren(String mclaren) {
        this.mclaren = mclaren;
    }

    
    public int getSampiyonluksayisi() {
        

         return sampiyonluksayisi;
    }

   
    public void setSampiyonluksayisi(int sampiyonluksayisi) {
        
         if(sampiyonluksayisi<0){
            
            System.out.println("Lütfen mantıklı bir sayı giriniz...");
            
        }else if(sampiyonluksayisi >= 0){
            
            this.sampiyonluksayisi = sampiyonluksayisi;
            
          
        }
        
      
    }
    
    
    
    
   
}
