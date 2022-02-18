
public class mühendis extends Çalışan {

    private String computer;
    
    public mühendis() {
       
    }

    public mühendis(String çalışan, String patron, int maaş, int zam) {
        super(çalışan, patron,maaş,zam);
        this.computer = computer;
       
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }
    
    @Override
    public void yemek_ye(){
        
        System.out.print(super.getÇalışan()+" Yemek yiyor...");
        
        
    }
    
    @Override
     public void iş(){
        
        System.out.print(super.getÇalışan()+" "+"İşini yapıyor...");
       
    }
    
    @Override
     public void zam_yap(double miktar){
       
     }
    
     public void pc_markası(){
         
         System.out.print(computer+" "+"Mühendis tarafından kullanılıyor..");
         
         
     }
     
     
     
}
