
public class Account {

    private int id;
    private int bakiye;
    
    public Account(int id,int bakiye){
        
        this.id = id;
        this.bakiye = bakiye;
        
        
    }

    public int getId() {
        return id;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    
    public void paraçek(int miktar){
        
        if(miktar>bakiye){
            System.out.println("Yetersiz bakiye çekebileceğiniz maksimum miktar: "+bakiye);
            
        }else{
        bakiye -= miktar;
        }
        
    }
    
    public void parayatır(int miktar){
        
        bakiye += miktar;
        
        
    }
    
    public void mevcut_bakiye(){
        
        System.out.print("Mevcut bakiyeniz: "+bakiye);
        
    }
    
    
    
    
    
    
}
