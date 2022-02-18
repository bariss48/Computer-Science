
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;


public class oku {

    public static void main(String[] args) throws FileNotFoundException {
        
        JFileChooser dosya = new JFileChooser();
        
        if(dosya.showOpenDialog(null) == dosya.APPROVE_OPTION){
            
        java.io.File dosyam = dosya.getSelectedFile();
            
        Scanner input = new Scanner(dosyam);    
        
       while(input.hasNext() ){
           
           System.out.println(input.nextLine());
         
       }     
         
      
       input.close();
            
        }else{
            System.out.println("Dosya seçilmedi");
        }
        
     
     
    }
    
}
