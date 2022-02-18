
 
public class fan {
    
    private int çalışma_hızı=1;
    private boolean on = false;
    private double radius=5;
    private String renk = "Beyaz";

    public fan(String renk,int çalışma_hızı,double radius,boolean on) {
        
        this.renk = renk;
        this.çalışma_hızı=çalışma_hızı;
        this.radius = radius;
        this.on = on;
  
    }
    
    public fan(){
        
        
    }

    public int getÇalışma_hızı() {
        return çalışma_hızı;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getRenk() {
        return renk;
    }

    public void setÇalışma_hızı(int çalışma_hızı) {
        this.çalışma_hızı = çalışma_hızı;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
    
    
    public String toString(){
        if(on == true && çalışma_hızı == 1){
        return "Çalışma hızı:SLOW-"+çalışma_hızı+" "+"Fanımızın rengi:"+renk+" "+"Fanımızın yarıçapı: "+radius+" ";
    }else if(on == true && çalışma_hızı == 2){
        return "Çalışma hızı:MEDIUM-"+çalışma_hızı+" "+"Fanımızın rengi:"+renk+" "+"Fanımızın yarıçapı: "+radius+" ";
    }else if(on == true && çalışma_hızı == 3){
         return "Çalışma hızı:HIGH-"+çalışma_hızı+" "+"Fanımızın rengi:"+renk+" "+"Fanımızın yarıçapı: "+radius+" ";
    }else
        
    
    return "Fan Çalışmıyor..";
}
    public boolean fanıkapat(){
        return on = false;
        
    }
     public boolean fanıaç(){
        return on = true;
        
    }
     
     
    
}