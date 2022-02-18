
package java1.kitap;

import java.util.Scanner;
import static java.lang.Math.*;
/**
 *
 * @author tee
 */
public class Java1Kitap {

    public static void main(String[] args) {
        
         /*
        1.1 (Display three messages) Write a program that displays Welcome to Java, Welcome to Computer Science, and Programming is fun.
        1.2 (Display five messages) Write a program that displays Welcome to Java five times.
       *1.3 (Display a pattern) Write a program that displays the following pattern:
        1.4 (Print a table) Write a program that displays the following table:
        a a^2 a^3 111 248
        3 9 27 4 16 64
        1.5 (Compute expressions) Write a program that displays the result of 9.5 * 4.5 - 2.5 * 3.45.5 - 3.5
        1.6 (Summation of a series) Write a program that displays the result of
        1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
        */
        
        // first question:
        
        /*
         System.out.println("Welcome to Java");
         System.out.println("Welcome to Computer Science");
         System.out.println("Programming is fun");
        */
        
        
        //second question
        /* 
        for(int i=0;i<5;i++)
 
        System.out.println(i+1+"-"+"Welcome to Java");
        */
        //third question
        /*
                   J            A           V          V         A  
                   J          A   A          V        V        A   A
                   J        A      A          V      V        A     A
                   J      A A A A A A          V    V        A A A A A  
            J      J     A            A         V  V        A          A 
             J J J     A               A         V         A            A

        */
        
        /*
        
        String[][] J = new String[6][5];
        
        for(int h=0;h<5;h++){
            J[h][3]=(" ");
        }
         for(int h=0;h<5;h++){
            J[h][2]=(" ");
        }
         for(int h=0;h<5;h++){
            J[h][1]=(" ");
        } 
         for(int h=0;h<4;h++){
            J[h][0]=(" ");
        } 
            
            J[5][4]=(" ");
            J[5][0]=(" ");
            J[4][0]=("J"); 
           
              
        for(int i=0;i<=4;i++){
            J[i][4] = ("J");
        }
        for(int k=1;k<4;k++){
            J[5][k]=("J");
        }
       
       
       /* for(int i=0;i<=5;i++){
            
            for(int j=0;j<5;j++){
                
                System.out.print(a[i][j]);
                
            }
        }
      
       
       
     for(int i=0;i<=5;i++){
           System.out.println();
     for(int j=0;j<=4;j++){
         
          System.out.print(J[i][j]);
    
         }  
    }
     
     
      System.out.println("");  
     
     
     String[][] A= new String[6][11];
     
     int j=0;
     for(int i=4;0<=i;i--){
          
        if(j<5)
        
         A[i][j] = ("A");
         
         j++;
     }
     
     int satir=1;
     
    for(int i=5;i<11;i++){
       
        if(satir<5)
        
        A[satir][i] = ("A");
        satir++;
        
        
    }
    
    A[2][4] = ("A");
    
    
     for(int k=0;k<6;k++){
         System.out.println();
         for(int h=0;h<11;h++){
             
             if(A[k][h] == null){
                 
                 A[k][h] =(" ");
             }
              
             
             System.out.print(A[k][h]);
         }
         
     }
                 
    
        
     System.out.println("");  
    
         
         
         String[][] V=new String [6][11];
         
         int sutun3 = 0;
         
         for(int i=0;i<5;i++){
         
         if(sutun3<5){
             
         V[i][sutun3] = ("V"); 
        
         sutun3++;
         
         }
         }
         int sutun4=5;
         
      
         for(int i=3;0<=i;i--){
             
             if(sutun4<10){
             
             V[i][sutun4] = ("V");
             
             sutun4++;
             }
             
         }
          System.out.println("");  
         
         for(int i=0;i<6;i++){
             
         System.out.println();
             
         for(int p=0;p<11;p++){
             
             if(V[i][p] == null){
                 
                 V[i][p] = (" ");
                 
             }
             
             System.out.print(V[i][p]);
             
         }    
       
         }
     
      System.out.println("");  
         
     String[][] B= new String[6][11];
     
     int satir5=0;
     for(int i=4;0<=i;i--){
          
        if(satir5<5)
        
         B[i][satir5] = ("A");
         
         satir5++;
     }
     
    int satir4=1;
     
    for(int i=5;i<11;i++){
       
        if(satir4<5)
        
        B[satir4][i] = ("A");
        satir4++;
        
        
    }
    
    B[2][4] = ("A");
    
    
     for(int k=0;k<6;k++){
         System.out.println();
         for(int h=0;h<11;h++){
             
             if(B[k][h] == null){
                 
                 B[k][h] =(" ");
             }
              
             
             System.out.print(B[k][h]);
         }
         
     }
      
     
     
     
     
      // YAN YANA YAZDIRMA DENEMESİ
     
     /*
     for(int k=0;k<120;k++){
         System.out.print();
         for(int h=0;h<100;h++){
             
             if(B[k][h] == null && V[k][h] == null && A[k][h] == null){
                 
                 B[k][h] =(" ");
                 V[k][h] =(" ");
                 A[k][h] =(" ");
             }
             System.out.print(J[k][h]); 
             System.out.print(A[k][h]);
             System.out.print(V[k][h]);
             System.out.print(B[k][h]);
         }
         
     }
     */
     
     /*
     double a=1;
     
     System.out.print("a^1"+" ");
     System.out.print("a^2"+" "); 
     System.out.print("a^3"+" ");     
     System.out.println();
     System.out.print(a+" ");
     System.out.print(Math.pow(a,a)+" ");
     System.out.print(Math.pow(a,a)+" ");
     System.out.println();
     System.out.print(a+1+" "); 
     System.out.print(Math.pow(a+1,2)+" ");
     System.out.print(Math.pow(a+1,3)+" ");
     System.out.println();
     System.out.print(a+2+" "); 
     System.out.print(Math.pow(a+2,2)+" ");
     System.out.print(Math.pow(a+2,3)+" ");
     System.out.println();
     System.out.print(a+3+" "); 
     System.out.print(Math.pow(a+3,2)+" ");
     System.out.print(Math.pow(a+3,3)+" ");

     */
     
    /* double sonuc;
     
          System.out.print(9.5*4.5-2.5*3/(45.5-3.5));
      
     */
    /*
    int isaret=1;
     double pi;
    
     int n =3;     
     double temp=1;
     
    
      
       for(int i=3; i<100;i++){
            
            double piformul=0;
            
            if(i%2==1){
                
             piformul+=(-1/i)*isaret;  
            
            }
          
        } 
        isaret=isaret*(-1);
        
       
       
        pi = 4*(1.0-piformul);
        System.out.print(pi);
       
     }
        
         }   
      
    */
    /*
    
    (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
    */
    
     
     /*
    double c,d,e,f;
    int a;
    double  b = 18.4615384615;
    Scanner scanner1 = new Scanner(System.in);
              
    System.out.println("Koşucunun kaç saat koşmasını istersiniz?");
     
    a = scanner1.nextInt();
     
    d = a*b;
        
    b = 18.4615384615;
    
    
    f=d/1.6;
    
    System.out.println("Koşucunun aldığı mil: "+f);
    System.out.println("Koşucunun aldığı km: "+d);
    
     */
     /*
     int tuesday;
     int mod;
     int gun;
     gun=101;
     
     mod =gun%7; 
     
     
     switch(mod){
         
        case 1:
        if(mod == 0)
           System.out.println("Bugün salı...");
         
        case 2:
        if(mod == 1)
           System.out.println("Bugün çarşamba...");
            
             
        case 3:    
          if(mod == 2)
           System.out.println("Bugün perşembe...");
            
         
        case 4:    
           if(mod == 3)
           System.out.println("Bugün cuma...");
          
        
        case 5:    
           if(mod == 4)
           System.out.println("Bugün cumartesi...");
          
            
        case 6:    
            
           if(mod == 5)
           System.out.println("Bugün pazar...");
                  
        case 7:    
            
           if(mod == 6)
           System.out.println("Bugün pazartesi...");
                    
            
         
     }
     
     */
     /*
     Scanner scanner2 = new Scanner(System.in);
     System.out.println("saniye giriniz: ");
     int seconds = scanner2.nextInt();
     int minutes = seconds / 60; 
     int remainingSeconds = seconds % 60;
     System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
     */
     
     
     /*
     System.out.println(2 * (5 / 2 + 5 / 2)); 
     System.out.println(2 * 5 / 2 + 2 * 5 / 2); 
     System.out.println(2 * (5 / 2)); 
     System.out.println(2 * 5 / 2);
     */
     
     /*
     System.out.println("25 / 4 is " + 25 / 4); 
     System.out.println("25 / 4.0 is " + 25 / 4.0); 
     System.out.println("3 * 2 / 4 is " + 3 * 2 / 4); 
     System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
     */
     
     /*
    double a = 2;
    
    System.out.print(Math.pow(a,7/2.0));
     */
     
     
    // System.out.println(0B1111); 
// Displays 15 System.out.println(07777);
// Displays 4095 System.out.println(0XFFFF); 
// Displays 65535
/*
Scanner input = new Scanner(System.in); System.out.print("Enter a degree in Fahrenheit: ");
double fahrenheit = input.nextDouble(); // Convert Fahrenheit to Celsius
double celsius = (5.0 / 9) * (fahrenheit - 32); System.out.println("Fahrenheit " + fahrenheit + " is " +celsius + " in Celsius");
   */  
     
    // double a = 6.5; a += a + 1;
    // System.out.println(a); a = 6;
    // a /= 2; System.out.println(a);


   /*
     int sayi;
     int a = 0;
     int b;
     int c;
     int d;
     int e;
     
     System.out.println("Enter a number between 1 and 1000...");
     
     Scanner scanner2 = new Scanner(System.in);
    
    
     sayi = scanner2.nextInt();
    
    
     if(sayi>0 && sayi<1000){
    
        
       a = (sayi)%10;  
    
       b = sayi/10;
       
       c = b%10;
       
       d = b/10;
      
        
       System.out.println("Sayınızın basamakları toplamı:"+(a+c+d));
   
     }else{
         
       System.out.println("Girdiğiniz sayı 0-1000 arasında değil!!!");
         
         
     }
             
     */
   
     /*
     Scanner input2 = new Scanner(System.in); 
     System.out.println("Basamak sayısını giriniz...");
     
     
    int a;
    int sayac=0;
    int c;
    int sayac2 =0;
    int k =0;
    int basamak =0;
    
     c=input2.nextInt();
     
     System.out.println("Sayınızı giriniz...");
     
     a=input2.nextInt();
     
     for(int i=0;i<c;i++){
           
         basamak = a % 10;
         sayac +=basamak;
         a /=10;
         
     }
     
     
     System.out.print(sayac);

     */
     
     /*
     Scanner scanner3 = new Scanner(System.in);
     
     System.out.println("dakika giriniz...");
     
     
     long minute;
     
     long gun;
     long yıl;
     long c;
     long saat;
     
     
             
     minute = scanner3.nextInt();
     
    
     
     saat = minute/60;
     
     gun = minute/1440;
     
     yıl = gun/365;
     
     c = minute%60;
             
     System.out.println("bu kadar yıl:"+yıl+" "+"bu kadar gün:"+""+gun+" "+"bu kadar saattir:"+saat+" "+"kalan dakikadır:"+c);
     
     */
     
     /*  KOORDİNAT SİSTEMİ
    double [][] koordinat = new double [3000][3000];
     
    Scanner input2 = new Scanner(System.in);
   
    double x1,y1,x2,y2; 
     
   
    System.out.println("x1 ve y1 i giriniz: ");
    
    x1 = input2.nextDouble();
     
     */
     
     
     //twc = 35.74 + 0.6215ta - 35.75v0.16 + 0.4275tav0.16
     
  /*   
    Scanner input2 = new Scanner(System.in);
   
    double x,y,d,s,p,u,ı; 
     
   
    System.out.println(" Enter the temperature in Fahrenheit between -58°F and 41°F: "); 
    x = input2.nextDouble(); 
    System.out.println("Enter the wind speed (>=2) in miles per hour: "); 
    y =input2.nextDouble();
    
    
    if(-58<x && x<41 && y<=2){
        
        
       d =( (35.74) + 0.6215*x) - (35.75 * Math.pow(y,0,16) )+0.4275*(Math.pow((x*y),0.16));
        
        
        u = Math.pow(y,0,16);
        
        
    } 
   */
     
     
    
     
     
     
     
     
     
     
     
     
     
     

    }
  }

     
     