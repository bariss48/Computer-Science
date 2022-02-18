import java.util.ArrayList;
import java.util.Scanner;

public class Test { //Test sınıfı

	public static void main(String[] args) { 
		ArrayList<String> arr=new ArrayList<String>(); //ArrayList tanımlıyoruz.
		Scanner tscan=new Scanner(System.in); //Kullanıcıdan girdi alabilmek için 
		Scanner kscan=new Scanner(System.in); 
		System.out.println("Tavsan sayısını giriniz:");
		int a=tscan.nextInt(); //Kullanıcıdan aldığımız değeri 'a' ya atıyoruz. a burada tavşan sayısı oluyor.
		System.out.println("Kaplumbaga sayısını giriniz:");
		int b=kscan.nextInt(); //Kullanıcıdan aldığımız değeri 'b' ya atıyoruz. b burada kaplumbaga sayısı oluyor.
		Turtle k[] = new Turtle[b]; //Kaplumbaga sınıfından bir dizi tanımlıyoruz ve bunun ismine k[] diyoruz. 
											//Bu dizinin boyutu kullanıcıdan alınan b değeri kadar oluyor.
		Rabbit t[] = new Rabbit[a]; 		//Tavşan sınıfından bir dizi tanımlıyoruz ve bunun ismine t[] diyoruz.
											//Bu dizinin boyutu kullanıcıdan alınan a değeri kadar oluyor.
		for(int i=0;i<k.length;i++) {		
			k[i]=new Turtle();			//Bir for döngüsünün içerisinden oluşturduğumuz dizi objelerine değer atıyoruz.
											//Bu işlem yapılmazsa NullPointerException hatası alınıyor.
			k[i].setId(i);					//Her kaplumbağa nesnesine bir id ve yer tanımlıyoruz.
			k[i].setYer(1);
		}
		
		
		for(int i=0;i<t.length;i++) {		
			t[i]=new Rabbit();			//Bir for döngüsünün içerisinden oluşturduğumuz dizi objelerine değer atıyoruz.
										//Bu işlem yapılmazsa NullPointerException hatası alınıyor.
			t[i].setId(i);				//Her kaplumbağa nesnesine bir id ve yer tanımlıyoruz.
			t[i].setYer(1);
		}
		while(true) { 					//False olana kadar dönecek bir while döngüsü yazıyoruz.
		
			for(int i = 0;i<t.length;i++) {	//t dizisinin uzunluğu kadar her nesneye Tavsan sınıfında yazdığımız hareketleri yaptırtıyoruz.
				t[i].hareketlerT();
			}
			
			for(int i = 0;i<k.length;i++) {	//k dizisinin uzunluğu kadar her nesneye Kaplumbaga sınıfında yazdığımız hareketleri yaptırtıyoruz.
				k[i].hareketlerK();		
			}
			
			for(int i = 0;i<t.length;i++) { //70 uzunluğu geçen Tavşan var ise oluşturduğumuz ArrayList'e bu tavşanı veya tavşanları ekliyoruz.
				if(t[i].getYer() >=70) {
					arr.add(t[i].toString());
				}
			}
			for(int i = 0;i<k.length;i++) {//70 uzunluğu geçen Kaplumbağa var ise oluşturduğumuz ArrayList'e bu kaplumbağayı veya kaplumbağaları ekliyoruz.
				if(k[i].getYer() >=70) {
					arr.add(k[i].toString());
				}
			}
			for(int j=0;j<t.length;j++) { //Tavşanların yerlerini göstermelerini sağlayacak döngüyü oluşturuyoruz.
				for(int i=1;i<=70;i++ ) {
					if(t[j].getYer()==i) {
						System.out.print("T");
					}
					else {
						System.out.print("_");
					}
				}
				System.out.println();
			}
			for(int j=0;j<k.length;j++) { //Kaplumbağaların yerlerini göstermelerini sağlayacak döngüyü oluşturuyoruz.
				for(int i=1;i<=70;i++ ) {
					if(k[j].getYer()==i) {
						System.out.print("K");
					}
					else {
						System.out.print("_");
					}
				}
				System.out.println();
			}
			if(arr.size() > 0) {
				break;
			}
		}
		for(int i=0;i<arr.size();i++) { //Eğer kazanan sınıfın sonu 'n' (Tavşa'n') ile bitiyorsa bu döngü
			if(arr.get(i).endsWith("n")) {
				System.out.println(arr.get(i));
			}
		}		
		for(int i=0;i<arr.size();i++) { //Eğer kazanan sınıfın sonu 'a'(Kaplumbağ'a') ile bitiyorsa bu döngü çalışıyor.
			if(arr.get(i).endsWith("a")) {
				System.out.println(arr.get(i));
			}
		}	
		if(arr.size() > 1) { //Eğer birden fazla kazanan varsa bu döngü çalışıyor.
		//	System.out.println("BERABERE");
			for(int i=0;i<arr.size();i++) {
				System.out.println(arr.get(i));
			}
			System.out.println("It's a tie between");
		}	
	}
	
}