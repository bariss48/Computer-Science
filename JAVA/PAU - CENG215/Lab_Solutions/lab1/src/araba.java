
public class araba implements Comparable<araba>{
    
    public String plaka;
    public int  modelyili;
    public String marka;
    public double motorHacmi;
    
    
    public araba(String marka,int modelyili,String plaka,double motorHacmi){
    
    this.marka = marka;
    this.modelyili= modelyili;
    this.plaka=plaka;
    this.motorHacmi=motorHacmi;
    
       
}
    
    @Override
    public int compareTo(araba a){
 
        return modelyili-a.modelyili;
        
    }
    
    
    
    
    
      
}
