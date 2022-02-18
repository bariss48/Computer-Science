
public class işçi extends Çalışan {

    
    
    public işçi() {
    }

    public işçi(String çalışan, String patron, int maaş, int zam) {
        super(çalışan, patron, maaş, zam);
       
    }

   
    
    
    @Override
    public void yemek_ye(){
        
        System.out.print("İşçi Yemek yiyor...");
        
        
    }
    
    @Override
     public void iş(){
        
        System.out.print(super.getÇalışan()+" "+"İşini yapıyor...");
       
    }
    
    @Override
     public void zam_yap(double miktar){
        
         
     }
    
     
}
