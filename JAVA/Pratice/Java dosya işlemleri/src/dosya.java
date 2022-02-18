
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class dosya {

   
    public static void main(String[] args) throws IOException {
     
        StringBuilder dizim = new StringBuilder(); 
        
        String str = "Şampiyon Galatasaray";

        dizim.append("Galatasaray");
        dizim.append("Real Madrid");
        dizim.append("Denizlispor");
        dizim.append("Chelsea");
              
        File file = new File("/Users/tee/Desktop/takımlar.txt");
        if (file.exists()) {
            System.out.println("Dosya mevcut");
        }else{
            file.createNewFile();   
        }
        Scanner input = new Scanner(file);
        
        
        //FileWriter fileWriter = new FileWriter(file, false);
       // BufferedWriter bWriter = new BufferedWriter(fileWriter);
       // bWriter.write(str);
        
        while(input.hasNext()){
            
            String tut;
            tut=input.next();
            
            System.out.println(tut);
        }
        
        input.close();
        
       // bWriter.close();
        
    }
}