
   
import java.util.Random;

public class Turtle { 			//Kaplumbaga sınıfı tanımlıyoruz.

	private int yer; 				//Kaplumbaga sınıfına ait özellikleri belirtiyoruz.
	private int id;
	String a="Tortoise";
	String b="[";
	String c="]";
	@Override
	public String toString() { 		//Kaçıncı sırada ki kaplumbaganın kazandığını gösterebilmek için id değişkenini toString metotu ile yazıyoruz.
		return a+b+(getId()+1)+c+" "+"win";
	}
	public int getYer() {		 	//yer'in get metotunu yazarak kullanıcının bu değeri görebilmesini sağlıyoruz.
		return yer;
	}
	public void setYer(int yer) { 	//yer'in set metotunu yazarak kullanıcının bu değeri değiştirebilmesini sağlıyoruz.
		this.yer=yer;
	}
	public void setId(int id) { 	//id'nin set metotunu yazarak kullanıcının bu değeri değiştirebilmesini sağlıyoruz.
		this.id=id;
	}
	public int getId() { 			//id'nin get metotunu yazarak kullanıcının bu değeri görebilmesini sağlıyoruz.
		return id;
	}
	public void hareketlerK() {		//Kaplumbaga'ya ait hareket metotunu yazıyoruz.
		
		Random rand=new Random(); 
		int r=1+rand.nextInt(10);	//Rastgele sayı üretiyoruz. 
		if(r>=1 && r<=5) 			//Ürettiğimiz sayı 1 ve 5 arasında ise bu if bloğu çalışıyor. (Fast Plod)
		{
			yer+=3;
		}
		else if(r==6 || r==7) 		//Ürettiğimiz sayı 6 ve 7 ise bu if bloğu çalışıyor. (Slip)
		{
			if(yer>6) 				//Eğer kaplumbağanın konumu 6'dan büyükse bu blok
			{
				yer-=6;
			}
			else 					//Kaplumbağanın konumu 6'dan küçükse bu blok çalışıyor.
			{
				yer=1;
			}
		}
		else 						//Ürettiğimiz sayı 8,9 ve 10 ise bu blok çalışıyor. (Slow Plod)
		{
			yer+=1;
		}
	}
}