
import java.util.Scanner;


public class recursion {

   
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
        
      System.out.println(fact(6)); 
      
      System.out.println("fibonacci serisinin adım sayısını giriniz: ");
      int index = input.nextInt();
      
      
      System.out.println(fibonacci(index));  
      
      double dizi[] = {1.9,12.3,15.2,11.9,22.1,77.1,00.1,00.5,2.11,3.14};
     
     selection_sort(dizi,0,9);
      
     yazdır(dizi);
     System.out.println();
     System.out.println(sum_numbers(1999,0));
    // System.out.println(reserve_Display("barış"));
        selection_sort(dizi,0,9);
    
    
    }
    
    public static int fact(int sayi){
        
     if(sayi == 0)
         return 1;
     
     else
       return sayi * fact(sayi-1);  
     
    }
    
    public static int fibonacci(int index){
        
        //0 1 1 2 3 5 8 13 21 34 
     
     if(index ==0){
         
         return 0;
     }else if(index == 1){
         
         return 1;
     }else{
         
         
         return fibonacci(index-1) + fibonacci(index-2);
     } 
     
     
      
    }
    public static void selection_sort(double array[],int min,int maks){
        
    if(min<maks){
        
       int indeks = min;
       double en_küçük = array[min];
       
        for (int i =min+1; i <= maks; i++) {
            if(array[i]<en_küçük){
            en_küçük = array[i];  
            indeks =i;    
            }
            
            
        }
        
        array[indeks] = array[min];
        array[min] = en_küçük;
        
        
        selection_sort(array, min+1, maks);
     }
    
   }  
    
    public static double sum_numbers(double n,double total){
      if(n == 1)
       return total+1;
       
       return sum_numbers(n-1, total+1/n);
    }  
    
    public static void yazdır(double array[]){
       
        for (int i = 0; i < array.length; i++) {
           
           System.out.print(" "+array[i]);
        }
        
    }
    
    public static String reserve_Display(String kelime){
      
        String yakala = "";
        
       if(kelime.isEmpty() == true){
           
         return "";  
        
       }else
          
       yakala += kelime.charAt(kelime.length());
           
       return reserve_Display(kelime.substring(0, kelime.length()-1));
      
      } 
   
}

