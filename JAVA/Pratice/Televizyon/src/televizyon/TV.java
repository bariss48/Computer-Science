
package televizyon;

/**
 *
 * @author tee
 */
public class TV {
    
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    
    public TV(){
    
    
    
}
    public void aç(){
        
        on = true;
    }
    
    public void kapat(){
        
        on = false;
    }
    public void kanalı_ayarla(int newChannel){
       
        if(on == true &&newChannel <= 300){
            
            channel = newChannel;
            
        }
        
    }
    public void sesi_ayarla(int newVolumeLevel){
        
        if(on == true &&newVolumeLevel <= 10){
            
            
           volumeLevel = newVolumeLevel;
            
            
        }
        
        
        
    }
    public void Channeldown(){
        
        if(on == true){
            
            channel--;
            
        }
        
        
    }
    
    
    public void Channelup(){
        
        if(on == true){
            
            channel++;
            
        }
        
        
    }
    
    public void Sesi_kıs(){
        
        if(on == true){
            
            volumeLevel--;
            
        }
        
        
    }
    
    
    public void Sesi_aç(){
        
        if(on == true && volumeLevel <=10){
            
            volumeLevel++;
            
        }
        
        
    }
   
}
