
import java.util.ArrayList;


public class mühendis extends calisanlar {

    private String pc_name;
    
   public mühendis(){
       
   }
    
    public mühendis(String name, String meslek, int age,boolean suc) {
        super(name, meslek, age, suc);
        this.pc_name= pc_name;
    }
    
    @Override
    public void çalış() {
       
        System.out.println(getPc_name()+" "+"ile "+" "+ "Mühendis Çalışıyor...");
        
    }

    @Override
    public int emeklilik() {
 
        int emekli = 65 - super.getAge();
        
        System.out.print("Emekliliğinize kalan yaş:"+emekli);
        
        return emekli;
    }

    @Override
    public void sicil() {
       if(super.isSuc() == true){
           System.out.println("Mühendisin sicil kaydı var!");
       }else{
           System.out.println("Mühendisin sicil kaydı yoktur.");
       }
           
    }

    public String getPc_name() {
        return pc_name;
    }

    public void setPc_name(String pc_name) {
        this.pc_name = pc_name;
    }

    @Override
    public int compareTo(Object nesne) {
        
        ArrayList<String> tut = new ArrayList();
        
        nesne = tut.clone();
        
        if(tut.equals(nesne)){
            return -1;
        }else
           
        return 1;
    }
    
    
}
    
