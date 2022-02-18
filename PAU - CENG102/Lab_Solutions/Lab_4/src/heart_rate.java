/**
 * @author ßA®I$ 07.10.2021
 */
public class heart_rate extends person{

    public static void main(String[] args) {
        
    person adult = new person("baris","kara",1999);
     int max = max_heart_rate(adult);   
     System.out.println("isim:"+" "+adult.name+" "+"surname:"+" "+adult.surname+" "+"born-date:"+" "+adult.born_year);
     System.out.println("Max-Heart-Rate:"+max);
     System.out.println("expected heart-rates:");
     requirement_rate(max);     
    }
    
    public static int max_heart_rate(person a){
        int age = 2021 - (a.born_year);
        int max_rate = 220 - age;
        return max_rate;
    }
    
    public static void requirement_rate(int max_heart_rate){
        int persant = max_heart_rate / 100;
        int max_limit = (max_heart_rate * 85)/100; 
        int min_limit = (max_heart_rate/2);
        for (int i = 0; i < max_heart_rate; i++) {          
         if(i <= max_limit && min_limit <= i){
            System.out.print(i+"-");
          }
        }    
    }
    
}
