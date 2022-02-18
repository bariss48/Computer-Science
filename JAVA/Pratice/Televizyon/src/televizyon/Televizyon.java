
package televizyon;

/**
 *
 * @author tee
 */
public class Televizyon {

   
    public static void main(String[] args) {
        
        
        TV televizyonum = new TV();
        
       
        televizyonum.aç();
       // televizyonum.kapat();
        televizyonum.kanalı_ayarla(20);
        televizyonum.Channeldown();
        televizyonum.Channeldown();
        televizyonum.Channeldown();
        televizyonum.Channelup();
        televizyonum.sesi_ayarla(7);
        televizyonum.Sesi_aç();
        
        System.out.println(televizyonum.channel);
        if(televizyonum.on == true){
        System.out.println("Televizyonumuz açık");
        }
        System.out.println(televizyonum.volumeLevel);
        

        
    } 
    
}
