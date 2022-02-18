
import java.util.Scanner;


public class unıversity {
 
   private String university_name = "PAMUKKALE UNIVERSİTESİ";
   
   
   public boolean öğrenci_misin(boolean durum){
       
       if(durum == true)
       return true;
       else
      
       return false;
   
   }
   
    
    public class medicine{
        
        
     public void tıpçı(String name){
        
      System.out.println(name+" "+"(Tıpçı) ders çalışıyor..."+university_name);
      
    }  
       
    }
    
    public class engineer{
        
     public void mühendis_hesap_yapıyor(boolean matematik_bilgisi){
         
         if(matematik_bilgisi == true){
             
             System.out.println("Mühendis hesap yapıyor..."+university_name);
         }else{
             
              System.out.println("Mühendis Matematik bilmiyor..."+university_name);
             
         }
         
     }
     
     public class computer_engineer{
         
         
         public void kod_yaz(String name){
             
             System.out.println(name+" "+"Bilgisayar Mühendisi Kod yazıyor..."+university_name);
             
         }
         
         
         
         
     }
     
        
        
    }
    
    
    public class Vet{
        
        
        
        
        
        
    }
    
    
    public class Math{
        
        
        
        
        
    }
    
    
    
    public class Phiyscs{
        
        
        
        
        
        
        
    }
    
    
    
}
