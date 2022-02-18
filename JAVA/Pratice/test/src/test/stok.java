
package test;


public class stok {
    
    double miktar;
    double stok_sayisi;
    double bedel;
    boolean sat = false;
    
    public stok(double stok_sayisi,double bedel){
        
        this.bedel = bedel;
        this.stok_sayisi = stok_sayisi;
        
        
    }

    public void setStok_sayisi(double stok_sayisi) {
        this.stok_sayisi = stok_sayisi;
    }

    public void setBedel(double bedel) {
        this.bedel = bedel;
    }
   

    public double getStok_sayisi() {
        return stok_sayisi;
    }

    public double getBedel() {
        return bedel;
    }
    
    public double nekadar_eder(double bedel,double stok_sayisi){
        
        double total_price;
        
        total_price = bedel * stok_sayisi;
        
        return total_price;
    }

    public boolean isSat() {
        return sat;
    }

    public void setSat(boolean sat) {
        this.sat = sat;
    }
    
    
     public void satmak_istiyor(){
        
        sat = true;
    }
    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }
    
    
     public double stokta_kalan(double miktar){
         
        double tut = stok_sayisi - miktar;
         
         return tut;
     }
     
      public double stokta_kalanların_değeri(double miktar,double bedel){
         
        double tut = stok_sayisi - miktar;
        double para = tut*bedel; 
        
         return para;
     }
     
     public void sat(double miktar){
         
         stok_sayisi -= miktar;
         
         
     }
    
    
    
    
}
