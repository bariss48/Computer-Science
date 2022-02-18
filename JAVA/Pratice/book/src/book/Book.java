/*
 
 */
package book;

/**
 *
 * @author barış
 */
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Book {

   
    public static void main(String[] args) {
       
        
/*
Scanner input = new Scanner(System.in);
// Prompt the user to enter weight in pounds
System.out.print("Enter weight in pounds: "); double weight = input.nextDouble();
// Prompt the user to enter height in inches
System.out.print("Enter height in inches: "); double height = input.nextDouble();
final double KILOGRAMS_PER_POUND = 0.45359237; // Constant final double METERS_PER_INCH = 0.0254; // Constant
// Compute BMI

 final double METERS_PER_INCH = 0.0254; // Constant

double weightInKilograms = weight * KILOGRAMS_PER_POUND;
double heightInMeters = height * METERS_PER_INCH;
double bmi = weightInKilograms /(heightInMeters * heightInMeters);
// Display result
System.out.println("BMI is " + bmi); if (bmi < 18.5)
System.out.println("Underweight"); else if (bmi < 25)
System.out.println("Normal"); else if (bmi < 30)
System.out.println("Overweight"); else
System.out.println("Obese");
 */    
        
 /*       
double a,b,c;

double sonuc;
double matris;
double root1;
double root2;

System.out.print("Enter the a,b,c variables : ");
Scanner input3 = new Scanner(System.in);   


a = input3.nextDouble(); b = input3.nextDouble(); c = input3.nextDouble();

 
matris = b*b - (4*a*c);

root1 = (-b + Math.sqrt(matris)) / 2*a ;

root2 = (-b - Math.sqrt(matris)) / 2*a ;     
        
      
        
if(matris>0){
    
    System.out.println("You have two real roots");
    
    
    System.out.println("First root is : "+root1);
    
    System.out.println("Second root is : "+root2);
    
    
    
    
}else if(matris<0){
    
    
    System.out.println("You dont have a real root");
    
    
}else if(matris==0){

    System.out.println("Root is = 0");
   
            }

*/
 
 
 /*
 
 double x,y,e,f,a,b,c,d;
 
 
 
 System.out.println("Enter the a,b,c,d,e,f variables: ");
 Scanner input = new Scanner(System.in);
 
 a =input.nextDouble(); b =input.nextDouble(); c =input.nextDouble(); d =input.nextDouble(); e =input.nextDouble(); f =input.nextDouble();
 
 
 x= (e*d - b*f) / (a*f)-(e*c);
 
 y= (a*d)-(b*c) / (a*d)-(b*c);
 
 
 e = a*x + b*y;        
 f = c*x + d*y;
 
 
 System.out.println("x = "+x);
 System.out.print("y = "+y);
 */
 
 /*
 int ay;
  
 Random rastgele = new Random();
 
 
 
 
 ay = rastgele.nextInt(11);
 
 
    switch(ay){
        
    case 1:
    if(ay ==0){
        
    System.out.println("This mounth is January..");
        
    }
    case 2:
    if(ay ==1){
        
    System.out.println("This mounth is February..");
        
    }
    case 3:
    if(ay ==2){
        
    System.out.println("This mounth is March..");
        
    }
    case 4:
    if(ay ==3){
        
    System.out.println("This mounth is April..");
        
    }
    case 5:
    if(ay ==4){
        
    System.out.println("This mounth is May..");
        
    }
    case 6:
    if(ay ==5){
        
    System.out.println("This mounth is June..");
        
    }
    case 7:
    if(ay ==6){
        
    System.out.println("This mounth is July..");
        
    }
    case 8:
    if(ay ==7){
        
    System.out.println("This mounth is August..");
        
    }
    case 9:
    if(ay ==8){
        
    System.out.println("This mounth is September..");
        
    }
    case 10:
    if(ay ==9){
        
    System.out.println("This mounth is October..");
        
    }
    case 11:
    if(ay ==10){
        
    System.out.println("This mounth is November..");
        
    }
     case 12:
    if(ay ==11){
        
    System.out.println("This mounth is December..");
    
    */

/*
    int a,b,c ;
    
    
    System.out.println("girmek istediğiniz sayıları giriniz: ");
    Scanner input = new Scanner(System.in);
    
    
    a = input.nextInt();
 
    b = input.nextInt();
    
    c = input.nextInt();
    
    
    int[] arr = new int [3];
    
    
   
    
    
    void bubbleSort(int arr[]){
        
    arr[3] = a;
    arr[1] = b;
    arr[2] = c;
    
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {                
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
  */  
   /*
int a,b,c,d,e,f,g,h,j,k,l;
int last;
  
System.out.println("Enter the ISNB digits: ");
Scanner input = new Scanner(System.in);

a = input.nextInt();
b = input.nextInt();    
c = input.nextInt();    
d = input.nextInt();    
e = input.nextInt();    
f = input.nextInt();
g = input.nextInt();
h = input.nextInt();
j = input.nextInt();



last = (a*1 + b*2 + c*3 + d*4 + e*5 + f*6 + g*7 + h*8 + j*9)%11;

System.out.println("ISBN Numaranız:"+a+b+c+d+e+f+g+h+j+last);

*/
   
   /*
   int a,b;
   int temp;
   int sayac=0;
   Random rastgele = new Random();
   
   
   a = rastgele.nextInt(100);
   b = rastgele.nextInt(100);
   
   
   
   if(b>a){
       
       temp =b;
       a=temp;
       b=a;
       
       sayac++;
   }
   
   System.out.println(a-b);
   System.out.println("b a'dan bu kadar kez büyük gelmiştir:"+sayac);
   */
   
   /*
   
   int ay;
   int yıl;
   Scanner input = new Scanner(System.in);
   
   System.out.println("Girmek istediğiniz yılı yazınız: ");
   yıl = input.nextInt();
   System.out.println("Girmek istediğiniz ayı yazınız: ");
   ay = input.nextInt();
   
      switch(ay){
       
      case 1:
      if(ay==1)
        System.out.println(yıl+"ının "+"Ocak ayı 30 gündür...");  
      case 2: 
      if(ay==2){
      if(yıl%4==0 || yıl%400==0){
        System.out.println(yıl+"ının "+"Şubat ayı 29 gündür...");
       }
       else{
         System.out.println(yıl+"ının "+"Şubat ayı 28 gündür...");
       }
      }
      case 3: 
      if(ay==3)
        System.out.println(yıl+"ının "+"Mart ayı 31 gündür...");     
      case 4: 
      if(ay==4)
        System.out.println(yıl+"ının "+"Nisan ayı 30 gündür...");      
      case 5:
       if(ay==5)
        System.out.println(yıl+"ının "+"Mayıs ayı 31 gündür...");     
      case 6: 
        if(ay==6)
        System.out.println(yıl+"ının "+"Haziran ayı 30 gündür...");    
      case 7: 
          if(ay==7)
        System.out.println(yıl+"ının "+"Temmuz ayı 31 gündür...");  
      case 8: 
          if(ay==8)
        System.out.println(yıl+"ının "+"Ağustos ayı 31 gündür...");  
      case 9: 
          if(ay==9)
        System.out.println(yıl+"ının "+"Eylül ayı 30 gündür...");  
      case 10: 
          if(ay==10)
        System.out.println(yıl+"ının "+"Ekim ayı 31 gündür...");  
      case 11:  
          if(ay==11)
        System.out.println(yıl+"ının "+"Kasım ayı 30 gündür...");  
      case 12:
          if(ay==12)
        System.out.println(yıl+"ının "+"Aralık ayı 31 gündür...");  
       
   }
    */
   
   /*
   int sayi;
   int ilk;
   int kalan,deger =0;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Girmek istediğiniz bir sayıyı giriniz: ");
   sayi = input.nextInt();
   ilk = sayi;
   int length = String.valueOf(sayi).length();
   
   for(int i=0;i<length;i++){
       
       kalan = sayi % 10;
       deger = deger * 10 + kalan;
       sayi = sayi /10;
        }
         
        if(deger == ilk){
            System.out.println(deger + " Palindrom Sayidir.");
        }else{
            System.out.println(deger + " Palindrom Sayi Degildir.");
        }
     
*/
   
   // YAZI MI TURA MI
   
   /*
   String a;
   int b;
   
   Scanner input = new Scanner(System.in);
   
   
   System.out.println("Yazı mı Tura mı tahmin ediniz: ");
 
   Random rastgele = new Random();
   b = rastgele.nextInt(2);
   a = input.nextLine();
   System.out.println(b);
   System.out.println();
   
   if(a == "yazı"){
       
       if(b == 0){
         System.out.println("Tebrikler tahmininiz doğru...");
       }
       else{
         System.out.println("Tahmininiz yanlış...");    
       }
   }else if(a == "tura"){
        if(b == 1){
         System.out.println("Tebrikler tahmininiz doğru...");
       }
       else{
         System.out.println("Tahmininiz yanlış...");    
       }        
               
       }   
       */
   
  /* 
   int sayi;
   int number;
   int ilk;
   int orta;
   int son;     
   int first;
   int last;
   int mid;


   Random sans = new Random();
   Scanner input = new Scanner(System.in);
   
   System.out.println("tahmininizi giriniz: ");
   sayi = input.nextInt();
   number = sans.nextInt(1000)+100;
   
   
       ilk = number%10;
       orta =(number/10)%10;
       son =(number/100)%10;
       
       first = sayi%10;
       mid =(sayi/10)%10;
       last =(sayi/100)%10;
       
       
       
       
       
       if(first == ilk && orta == mid && last ==son){   
        System.out.println("Tebrikler 50.000$ kazandınız..."+"Talihli sayı="+number);
       }else if( (first == orta && mid == ilk && last == son) || (first == son && mid == orta && last == ilk) || (first == ilk && mid == son && last == orta)){
         System.out.println("Tebrikler 10.000$ kazandınız..."+"Talihli sayı="+number);   
       }else if( (first == ilk || first == orta || first == last) || (mid == ilk || mid == orta || mid == last) || (last == ilk || last == orta || last == son)){
       System.out.println("Tebrikler 1.000$ kazandınız..."+"Talihli sayı="+number); 
       }else{
        System.out.println("Tekrar deneyiniz..."+"Talihli sayı= "+number); 
}
        
    */
   /*
   int sayi;
   int lucky_number;
  
   Random sans = new Random();
   Scanner input = new Scanner(System.in);
   
   
   
   
   System.out.println("Makas(0) Taş(1) Kağıt(2) :");
   sayi = input.nextInt();
   
   lucky_number = sans.nextInt(3);
  
 
   if(sayi == lucky_number ){
       
       System.out.println("Berabere!!!");
       
   }else if( (lucky_number == 0 && sayi ==2)|| (lucky_number == 1 && sayi==0)||(lucky_number ==2 && sayi==1) ){
       
       System.out.println("Bilgisayar kazandı...");
    
   }else{
       System.out.println("Kazandınız!!!");
   }
  
   
   
    if(lucky_number==0)   
    System.out.println("Bilgisayarın seçimi:"+"Makas");
    else if(lucky_number ==1)
    System.out.println("Bilgisayarın seçimi:"+"Taş");    
    else if(lucky_number ==2)
    System.out.println("Bilgisayarın seçimi:"+"Kağıt");
    }
*/
   
  /*
 int gun,ay,yıl,day,year,a,b,d,g,h;  
   
 Scanner input = new Scanner(System.in);  
   
  System.out.println("Yılı giriniz: "); 
  yıl = input.nextInt();
  System.out.println("Ayı giriniz(1-12): ");  
  ay = input.nextInt();
  System.out.println("Ayın kaçı olduğunu giriniz(1-31): ");   
  day = input.nextInt();
   
  a = yıl%100;
  b = yıl/100;
 
  gun = (day+ 26*(ay+1)/10 +a+ a/4 + b/4 +5*b)%7;
      
   if(gun==0){
       System.out.println("Day of the week is cumartesi");  
   }else if(gun ==1){
        System.out.println("Day of the week is pazar"); 
   }else if(gun ==2){
        System.out.println("Day of the week is pazartesi"); 
   }else if(gun ==3){
        System.out.println("Day of the week is salı"); 
   }else if(gun ==4){
        System.out.println("Day of the week is çarşamba"); 
   }else if(gun ==5){
        System.out.println("Day of the week is perşember"); 
   }else if(gun ==6){
        System.out.println("Day of the week is cuma"); 
   }
   */
  
  /*
  int r,x,y,a,k;
  double h;
  Scanner input = new Scanner(System.in); 
  
  r = 10;
  System.out.print("X,Y noktasının koordinatlarını giriniz:");
  x = input.nextInt(); y = input.nextInt();
  
  k = (x*x + y*y);
  h = Math.pow(k,0.5);
  
  
  if(h <= r){
      
     System.out.println("Nokta çemberin içinde ...");
  
  }else{
      
      System.out.println("Nokta çemberin dışında....");
  }
  */
  
  // genişliği 10 yüksekliği 5 dikdörtgen
  /*
  int r,h,a,b,n,y,x;
  
  
  Scanner input = new Scanner(System.in); 
  
  r = 10;
  System.out.print("X,Y noktasının koordinatlarını giriniz:");
  x = input.nextInt(); y = input.nextInt();
  
  if( (-5<=x && x<=5) && (-5<=y && y<=5) ) {
      
      System.out.print("Noktanız dikdörtgenin içinde..");
  }else{
      System.out.print("Noktanız dikdörtgenin içinde değil..");
}
*/
  
  
  /*
  int [][] deck =new int[13][4];
  
  int sayi=2;
  int a,b;
  Random rastgele = new Random();
  
  a = rastgele.nextInt(13);
  b = rastgele.nextInt(4);
  
  
  deck[0][0] =1;
  deck[0][1] =1;
  deck[0][2] =1;
  deck[0][3] =1;
  
  deck[10][0] =11;
  deck[10][1] =11;
  deck[10][2] =11;
  deck[10][3] =11;
  
  deck[11][0] =12;
  deck[11][1] =12;
  deck[11][2] =12;
  deck[11][3] =12;
  
  deck[12][0] =13;
  deck[12][1] =13;
  deck[12][2] =13;
  deck[12][3] =13;
  
  for(int i=0;i<9;i++){
      
      deck[i+1][0] = sayi;
      deck[i+1][1] = sayi;
      deck[i+1][2] = sayi;
      deck[i+1][3] = sayi;
      
      sayi++;
    
      }
  
   
  if(b==0 && a<10 && 0<a){
      System.out.println("Kartınız"+" "+a+" "+"Kupadır");
  }else if((b==1 && a<10 && 0<a)){
      System.out.println("Kartınız"+" "+a+" "+"Maça");
  }else if(b==2 && a<10 && 0<a){
      System.out.println("Kartınız"+" "+a+" "+"Karo");
  }else if(b==3 && a<10 && 0<a){
      System.out.println("Kartınız"+" "+a+" "+"Sinek");
}else if( (a==0 && b==0)){
    System.out.println("Kartınız As kupadır");
}else if((a==0) && b==1){
     System.out.println("Kartınız As Maça");
}else if((a==0) && b==2){
     System.out.println("Kartınız As Karo");
}else if((a==0) && b==3){
     System.out.println("Kartınız As Sinek");
}else if( (a==10 && b==0)){
    System.out.println("Kartınız joker kupadır");
}else if((a==10) && b==1){
     System.out.println("Kartınız joker Maça");
}else if((a==10) && b==2){
     System.out.println("Kartınız joker Karo");
}else if((a==10) && b==3){
     System.out.println("Kartınız joker Sinek");
}else if( (a==11 && b==0)){
    System.out.println("Kartınız quenn kupadır");
}else if((a==11) && b==1){
     System.out.println("Kartınız quenn Maça");
}else if((a==11) && b==2){
     System.out.println("Kartınız quenn Karo");
}else if((a==11) && b==3){
     System.out.println("Kartınız quenn Sinek");
}else if( (a==12 && b==0)){
    System.out.println("Kartınız kral kupadır");
}else if((a==12) && b==1){
     System.out.println("Kartınız kral Maça");
}else if((a==12) && b==2){
     System.out.println("Kartınız kral Karo");
}else if((a==12) && b==3){
     System.out.println("Kartınız kral Sinek");
}
  */
  /*
  int luckynumber; // 1-100 arasında bir sayı
  int guess;
  guess = -1;
  int sayac=1;
  
  
  Random rastgele = new Random();
  Scanner input = new Scanner(System.in);
  
  luckynumber = rastgele.nextInt(101);
  
  while(guess != luckynumber){
      System.out.println("Sayıyı tahmin ediniz: ");
      guess = input.nextInt();
    if(guess>luckynumber){
        
        System.out.println("Şanslı sayı daha küçük...");
    }else if(luckynumber > guess){
         System.out.println("Şanslı sayı daha büyük...");
        
    }else if(luckynumber == guess){
        
         System.out.println("Tebrikler şanslı sayıyı buldunuz...");
         System.out.println(+sayac + ". denemede buldunuz...");
    }
        
        
      sayac++;
  }
  */
  
  /*
  int sayi;
  int number;
  int sayac;
  int sorusayisi;
  int sayac2 =0;
  int sayac3 =0;
  long startTime = System.currentTimeMillis();
  sorusayisi=5;
  sayac=0;
  
  
  
  Random rastgele = new Random();
  Scanner input = new Scanner(System.in);
  
  while(sayac<sorusayisi){
      
      sayi = rastgele.nextInt(101);
      number = rastgele.nextInt(101);
     
      if(number > sayi){
          int swap;
          swap = number;
          number = sayi;
          sayi = swap;
      }
       
       System.out.println("İşlemin sonucu nedir?"+"("+sayi+"-"+number+")");
      int answer = input.nextInt();
       if(answer == (sayi-number)){
           
           System.out.println("Tebrikler doğru cevap...");
           sayac2++;
           
       }else{
           System.out.println("Üzgünüz yanlış cevap...");
           sayac3++;
       }
       
       
      sayac++;
  }
      long endtime =System.currentTimeMillis();
      long testtime =endtime - startTime;
  
   System.out.println("çözümü bulana kadar geçen süre: "+testtime);
   
  
  System.out.println("Başarı puanınız: "+sayac2*20);
  
  */
  /*
  System.out.println("              MultiplicationTable");
   System.out.print("    ");
  
  for(int j=1;j <= 9;j++){
       System.out.print("   "+j);
  }
  System.out.println("\n---------------------------------------------"); 
  
  for(int i=1;i<=9;i++){
      
      System.out.print(i+" | ");
      for(int j=1;j <= 9;j++){
       System.out.printf("%4d",+i*j);
  }
      System.out.println();
      
  }
  */
  /*
  double toplam =0;
  
  for(double i = 00.1d;i<=100000000.0d;i = i +00.1d){
      
      toplam += i;
  }
  System.out.println("Sonucunuz: "+toplam);
  */
 /* int sayi;
  int number;
  Scanner input = new Scanner(System.in);
  System.out.println("İlk sayıyı giriniz: ");
  sayi = input.nextInt();
  System.out.println("İkinci sayıyı giriniz: ");
  number = input.nextInt();
  
  int gcd =1;
  int k =2;
  while(k <= sayi && k <= number){
      gcd =k;
      k++;
  }
*/
 
 /*double odeme;
 odeme = 10000;
 int yıl = 1;
 while(odeme <= 20000){
     
     System.out.println(+yıl+" "+". yıl ödenen miktar:"+odeme);
     odeme = odeme * 1.07;
     yıl++;
     
 }
 System.out.println("kaç yıl sonra iki katı oldu: "+yıl);
  */
 
 
 /*int dusennokta;
 int atılannokta;
 
 Random rastgele = new Random();
 
 dusennokta = 0;
 atılannokta = 10000000;
 
 for(int i=0;i<atılannokta;i++){
     
     
     double x = Math.random() * 2.0 -1;
     double y = Math.random() * 2.0 -1;    
     if(x*x + y*y <= 1){
         dusennokta++;
     }
     
       
 }
 double pisayısı = 4.0 * dusennokta / atılannokta;
 System.out.println("ikinci sayımız: "+pisayısı);
 */
 /*
 int sum = 0;
 int number =0;
 
 while(number < 20){
     
    number++;
     
     if(number == 10 || number ==15 || number ==12){   // ilk veyadan sonraki gelen sayıları toplama koyma(!) demek
         continue; }
         
     
     sum += number; 
         
     
 
 }
 
 System.out.print(sum);
 */
/* 
 int sayac;
 int asal;
 final int a;
 int b;
 a=50;
 sayac =0;        
 asal = 2;
 
 
while(sayac<a){
    
    
    boolean isPrime = true;
    sayac++;
 }
 
 
 boolean isPrime = true;
 */

/*
int sum = 0;

int option = JOptionPane.YES_OPTION;
while(option == JOptionPane.YES_OPTION){
    
    String dataString = JOptionPane.showInputDialog("Sayınızı giriniz: ");
    
  int data = Integer.parseInt(dataString);

    sum += data;
    
    option = JOptionPane.showConfirmDialog(null, "Devam mı?");
    
}


JOptionPane.showMessageDialog(null,"Toplam eşittir "+sum);
*/
/*
int a;
int b;
a = 101;

while(100 < a &&  a<1000 ){
    
    if(a%5==0 ^ a%6 == 0){
        
        System.out.println(a);
        
    }
    
    
    a++;
    */
 /*  
int a;
double b = 24.6;
a=1;
double küp = 5;
double top = b*b*b;
System.out.println(top);
while(true){
    
    int kare =a * a *a;
    if(kare>15000){
        System.out.println(a +" "+kare);
        break;
  
    }
    
a++;
*/
/*  mükemmel sayı
 int sayi;
 int toplam;

for(int i=1 ; i<10000;i++){
    toplam = 0;

for(int j = 1;j<i;j++){
if(i % j == 0) toplam += j;
  }

if(toplam == i) System.out.println(i);
     
}
 
     
     
      
 }
 
 */
/*
double x,y,a,b,sayac;
sayac=0;
int toplam =0;

Random rastgele = new Random();

for(int i=0;i<1000000;i++){


x = rastgele.nextDouble()-0.5;
y = rastgele.nextDouble()-0.5;




if(x<0){
   
  sayac ++;
    
 
      
}
if(x>0 && y>0 && x+y<=0.5){
    sayac++;
    
     
    
}


}
        System.out.println(sayac);

*/
     /*  int  n, i;       
       int[] a = new int[10];
       Scanner input = new Scanner(System.in);
        System.out.println("Dönüştürmek istediğiniz sayıyı girin: ");    
      n= input.nextInt();
        
       for(i=0; n>0; i++)      
        {      
         a[i]=n%2;      
         n= n/2;    
        }      
       System.out.println("Girdiğiniz sayının binary sistemdeki karşılığı: ");      
       for(i=i-1 ;i>=0 ;i--)      
       {      
        System.out.print(a[i]); 
       }                 
*/
/*     
int sayi,sayi2;
Scanner input = new Scanner(System.in);    
     
     
  System.out.println("İlk sayıyı giriniz: ");
  sayi = input.nextInt();
  System.out.println("İkinci sayıyı giriniz: ");
  sayi2 = input.nextInt();
  
  
  
  
  System.out.print(ebobbul(sayi,sayi2));
  
  
  
  
    }   
     
 public static int ebobbul(int sayi,int sayi2){    
     
     int k=2;
     int gdc = 1;
     
    while(k <= sayi && k <= sayi2 ){
        
        if(sayi % k == 0 && sayi2 % k == 0){
            
            gdc = k;
            
           
            
        }
       k++; 
    } 
     
     return gdc;
}
*/

/*

    System.out.println("ilk 20 asal sayılar \n");
    asalsayılar(100);
   
    }

public static void asalsayılar(int asalsayi){

final int satır = 10;
int sayac= 0;
int sayi = 2;

while(sayac<asalsayi){
    
    if(isPrime(sayi)){
        
        sayac++;
    
    
    if(sayac % satır == 0){
        
        System.out.printf("%-5s\n",sayi);
    }else{

        System.out.printf("%-5s",sayi);
        
    }
    }

sayi ++;

}


}

    private static boolean isPrime(int sayi) {
    
        for(int bolen=2;bolen< sayi;bolen++){
            
            if(sayi % bolen ==0){
                
                return false;
                 
            }
            
        }
        
        return true;
    }
}
*/


    
 
  
   
    
    
   /*
    System.out.println("ilk 30 Mersenne prime sayıları(2^n-1): ");
    int sayi =2; 
    int tur =6;
    
    while(0<=tur){
        
   
    if(isPrime(Math.pow(2,sayi)-1) == true ){
            
       System.out.printf(Math.pow(2,sayi)-1+" "+" ");
      tur--;
      
      if(tur%3 == 0){
          
         System.out.println();
          
      }
     }
        
        sayi++;    
    }
    */
   
   
    
/*
    public static boolean isPrime(double sayi){
        
       for(double i=sayi-1;1<i;i--){ 
        
        if(sayi%i == 0){
            
            return false;
            
        }
        
       }
        return true;
        
    }
    
   /*public static boolean tersi_asal_mı(int sayi){
    int toplam =0;
    int a,b;    
    a = sayi;
     
    while(sayi>0){
        
      b = sayi %10;
      toplam =(toplam*10)+b; 
      sayi = sayi/10;
    }
    
    if(isPrime(toplam) == true && a != toplam){
     
     return true;
        
    }else
    
    return false;
    
   }
   */
    /*
    int zar_bir;
    int zar_iki;
    int toplam;
    
    
    Random rastgele = new Random();
 
    zar_bir = rastgele.nextInt(6)+1;
    zar_iki = rastgele.nextInt(6)+1;

    toplam = zar_bir + zar_iki;
    
    if(toplam ==2 || toplam ==3 || toplam==12 ){
        
        System.out.println("Attığınız zarlar "+zar_bir+"+"+zar_iki+": "+toplam);
        System.out.println("Kaybettiniz...");
    }else if(toplam == 7 || toplam ==11){
        
         System.out.println("Attığınız zarlar "+zar_bir+"+"+zar_iki+": "+toplam);
         System.out.println("Kazandınız!!!");
    }else{
        
        //System.out.println("Attığınız zarlar "+zar_bir+"+"+zar_iki+": "+toplam);
        //System.out.println("Noktanız :"+toplam);
        int tut = toplam;
        int toplam_iki =0;
        int sayac=1;
        
        while(true){
            
            int k = rastgele.nextInt(6)+1;
            int j = rastgele.nextInt(6)+1;
           
            toplam_iki = k+j;
            
            if(toplam_iki == tut){
                System.out.println("Noktanız:"+tut+" "+"ilk attığınız zarlar:"+zar_bir+"+"+zar_iki+": "+"Sonraki attığınız zarlar:"+k+"-"+j+" "+" "+"diğer attığınız zarların toplamı:"+toplam_iki);
                System.out.println("Kazandınız!!!");
                System.out.println("Atılan tur sayısı: "+sayac);
                break;
            }else if(toplam_iki == 7){
                System.out.println("Noktanız: "+tut);
                System.out.println("Sonraki attığınız zarlar:"+k+"-"+j+" "+"diğer attığınız zarların toplamı:"+toplam_iki);
                System.out.println("Atılan tur sayısı: "+sayac);
                System.out.println("Kaybettiniz...");
                break;
            }
            sayac++;
            
        }
        
        */
        
   /*
		validateCreditCardNumber("");
		String imei = "";
		validateCreditCardNumber("");
	

    }
     private static void validateCreditCardNumber(String str) {

		int[] ints = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ints[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		for (int i = ints.length - 2; i >= 0; i = i - 2) {
			int j = ints[i];
			j = j * 2;
			if (j > 9) {
				j = j % 10 + 1;
			}
			ints[i] = j;
		}
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			sum += ints[i];
	
                }
                
                if(sum%10 ==0){
                    
                    System.out.print("Kart numaranız geçerlidir...");
                    
                    
                }else{
                 
                    System.out.print("Geçersiz kart numarası...");
                    
                }
                
            for(int k=0;k<ints.length;k++){
                
                System.out.print(ints[k]);
                
                
            }
                
                
     }
}
*/
 
   
   
   /*
     System.out.print(area(15,5.5));
   
    }
    
   public static double area(int n,double side){
   
       double alan;
       double tanjant;
   
       tanjant = 4 * Math.tan(Math.PI/n);
       alan = n * Math.pow(side,2)/tanjant;
       
      
   
        return alan;
    }
}
*/
 
   /*
   Random rastgele = new Random();
   
   
   int gecici_iki;
   int gecici;
   int temp;
   int index_1 =0;
   int index_2 =0;
   int[] sırala = new int[10];
   
   for(int i=0;i<sırala.length-1;i++){
       
       sırala[i] = rastgele.nextInt(100);
   }
   
  
   for(int h=0;h<sırala.length-1;h++){
       
       
       if(sırala[h]>sırala[h+1]){
           temp =sırala[h];
           sırala[h+1]=temp;
           sırala[h]=sırala[h+1];
           
       }
       
   }
       
   
       /* for (int i = 0; i < sırala.length; i++) {
          
            for(int j=1;j<sırala.length;j++){
                
              if(sırala[i]>sırala[j]){
                  
                 en_kucuk = sırala[j]; 
                 en_buyuk = sırala[i];
                 index_1 =j;
                 index_2 =i;
              }else{
                  
                  en_kucuk=sırala[i];
                  en_buyuk = sırala[j];
                   index_1 = i;
                   index_2 =j;
              } 
            
        }
       
       double tut = sırala[0];
       double tut_2 = sırala[sırala.length-1];       
       
       sırala[0]= en_kucuk;
       sırala[sırala.length-1] = en_buyuk;
       
       sırala[index_1] = tut;
       sırala[index_2] = tut_2;
   }
   
   
        
        for (int k = 0; k < sırala.length; k++) {
        
            System.out.print(sırala[k]+" ");
            
        }
        
        
        
     /*
        
     /*
   
   */   
   /*     
   try{
   Scanner input = new Scanner(System.in);
   
   String ogrenciler[] = new String[3];
   int ogrenciNo[] = new int[3];
   int ogrenciNot[] = new int [3];
   
  
   
   for(int i=0;i<3;i++){
 
       System.out.println("Öğrencinin adını giriniz: ");
       ogrenciler[i] =input.next();
       System.out.println("Öğrencinin numarasını giriniz: ");
       ogrenciNo[i] =input.nextInt();
       System.out.println("Öğrencinin notunu giriniz: ");
       ogrenciNot[i] = input.nextInt();
       System.out.println();
      
   }
  
   for(int j=0;j<3;j++){
       
       
       System.out.println("Öğrencinin adı: "+ogrenciler[j]+"  "+"Öğrencinin numarası: "+ogrenciNo[j]+"  "+"Öğrencinin notu: "+ogrenciNot[j]+" ");
       
   }
   
   
   for(int h=0;h<3;h++){
       
       int temp;
       if(ogrenciNot[h]>ogrenciNot[h+1]){
           
           temp=ogrenciNot[h];
           ogrenciNot[h+1] = temp;
           ogrenciNot[h] = ogrenciNot[h+1];
        
       }
     
   }
   
   
   for(int k=0;k<ogrenciNot.length-1;k++){
       
       System.out.print(ogrenciNot[k]);
       
       
   }
   
   
   
   } catch( ArrayIndexOutOfBoundsException exception){
 
            System.out.println(exception.toString());
            System.out.println("Dizi Aşım Hatası");
           }
       
   
   }
   
  */
   
 

   
   int dizi[][] = new int[7][7];

    
   while( )
   

   
    
    
}
    
    
 public static boolean kontrol(int dizi[][]){
     
     Scanner input = new Scanner(System.in);
     
     for(int i=0;i<dizi.length-1;i++){
         
         
         for(int j=0;j<dizi.length;j++){
             
          
             String a=input.findInLine("Q");
                dizi[i][j] = a;
             
         }
         
         
     }
     
     
     
 }   
    
    
    
}
    



 
