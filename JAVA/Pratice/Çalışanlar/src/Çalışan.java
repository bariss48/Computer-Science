

public class Çalışan {
    
    private String çalışan;
    private String patron;
    private int maaş;
    private int zam;

    public Çalışan(){
        this.maaş = 1000;
    }
    
    public Çalışan(String çalışan, String patron, int maaş, int zam) {
        this.çalışan = çalışan;
        this.patron = patron;
        this.maaş = maaş;
        this.zam = zam;
    }

    public String getÇalışan() {
        return çalışan;
    }

    public String getPatron() {
        return patron;
    }

    public int getMaaş() {
        return maaş;
    }

    public int getZam() {
        return zam;
    }

    public void setÇalışan(String çalışan) {
        this.çalışan = çalışan;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public void setMaaş(int maaş) {
        this.maaş = maaş;
    }

    public void setZam(int zam) {
        this.zam = zam;
    }
    
    public void yemek_ye(){
        
        System.out.print(this.çalışan+" "+"Yemek yiyor...");
        
        
    }
    
     public void iş(){
        
        System.out.print(this.çalışan+" "+"İşini yapıyor...");
        
        
    }
    
     public void zam_yap(){
         
         maaş += zam;
         
     }
     
      public void zam_yap(double miktar){
         
         maaş += miktar;
         
     }
      
        public void zam_yap(int miktar){
         
         maaş += miktar;
         
     }
     
}
