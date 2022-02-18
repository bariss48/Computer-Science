import java.util.Random;

public class Rabbit { 				//Tavsan sınıfı tanımlıyoruz.

	private int yer; 				//Tavsan sınıfına ait özellikleri belirtiyoruz.
	private int id;
	String a="Hare";
	String b="[";	
	String c="]";
	@Override
	public String toString() {		//Kaçıncı sırada ki tavşanın kazandığını gösterebilmek için id değişkenini toString metotu ile yazıyoruz.
		return a+b+(getId()+1)+c+" "+"win";
	}
	
	public int getId() { 			//id'nin get metotunu yazarak kullanıcının bu değeri görebilmesini sağlıyoruz.
		return id;
	}
	public void setId(int id) { 	//id'nin set metotunu yazarak kullanıcının bu değeri değiştirebilmesini sağlıyoruz.
		this.id = id;
	}
	public int getYer() {			//yer'in get metotunu yazarak kullanıcının bu değeri görebilmesini sağlıyoruz.
		return yer;
	}
	public void setYer(int yer) { 	//yer'in set metotunu yazarak kullanıcının bu değeri değiştirebilmesini sağlıyoruz.
		this.yer=yer;
	}
	public void hareketlerT() { 	//Random sayı oluşturarak tavşanın hangi sayıya karşı hangi hareketi yapacağınını belirten metotu oluşturuyoruz.
		Random rand=new Random(); 
		int r=1+rand.nextInt(10);	//Random sayı üretiyoruz.
		if(r==1 || r==2) { 			//Sayı 1 veya 2 gelirse hangi hareketi yapacağını gösteriyoruz. (Sleep)
			yer = yer;
		}
		if(r==3 || r==4) { 			//Sayı 3 veya 4 gelirse hangi hareketi yapacağını gösteriyoruz.	(Big Hop)
			yer += 9;
		}
		if(r==5) { 					//Sayı 5 gelirse hangi hareketi yapacağını gösteriyoruz. (Big Slip)
			if(yer>12) { 			//Tavşanın bulunduğu yer 12. konumdan büyükse bu if çalışıyor.
				yer-=12;
			}
			else { 					//Bulunduğu yer 12. konumdan küçükse bu if çalışıyor.(Konumun - değerlere düşmemesi için)
				yer=1;
			}
		}
		if(r==6 || r==7 || r==8) { //Sayı 6,7 veya 8 gelirse hangi hareketi yapacağını gösteriyoruz. (Small Hop)
			yer+=1;
		}
		if(r==9 || r==10) { 		//Ve sayı üstteki durumlar haricinde gelirse(9 ve 10) Bu if bloğu çalışıyor. (Small Slip)
			                		//Fakat burada da iç içe if kullanıcaz çünkü konumun - olmamasını istiyoruz.
			if(yer>2) {     		//Tavşanın konumu 2 den büyükse bu blok
				yer-=2;
			}
			else { 					//Tavşanın konumu 2 den küçükse bu blok çalışıyor.
				yer=1;
			}
		}
	}
}