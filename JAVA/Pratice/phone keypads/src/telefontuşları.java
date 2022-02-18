
/**
 *
 * @author  ßæ®ı$
 */
public class telefontuşları {


    public static void main(String[] args) {


         //NOT EKSİKLERİ VAR TAM OLARAK MESAJI ÇEVİREMİYOR SIKINTI ARADA BOŞLUK VEYA HERHANGİ BİR SAYI GELİRSE ESKİ DÖNGÜ ARTMAYA DEVAM EDİYOR
         
                
        
        çevir_yazdır("BARIŞ-222333444555666677788899955522227777");
        System.out.println();
        çevir_yazdır("BARIŞ-243246357696579356392497582233438358");
        System.out.println();
        çevir_yazdır("BARIŞ-436378463432526632647432477777247262");
        System.out.println();
        çevir_yazdır("7777");
        System.out.println();
  

    }


    public static void çevir_yazdır(String str){

        String sayılar ="23456789";

        int sayac = 0;
        int sayac_iki = 0;
        int sayac_uc=0;
        int sayac_dort = 0;
        int sayac_bes = 0;
        int sayac_altı =0;
        int sayac_yedi = 0;
        int sayac_sekiz = 0;

        char dizi[]=new char[sayılar.length()];
        char tut[] = new char[str.length()];

        tut = str.toCharArray();
        dizi= sayılar.toCharArray();

        char kaydet = ' ';


        for(int i=0;i<tut.length;i++){
            try{


                for(int j=0;j<dizi.length;j++){


                    if(tut[i] == dizi[j]){

                        kaydet = dizi[j];
                    }

                } if(tut[i] != kaydet) {
                    System.out.print(tut[i]);
                }

                if(tut[i] == '0'){
                     sayac++;
                     sayac_iki++;
                     sayac_uc++;
                     sayac_dort++;
                     sayac_bes++;
                     sayac_altı++;
                     sayac_yedi++;
                     sayac_sekiz++;

                }
                if (tut[i] == '1'){
                    sayac--;
                    sayac_iki--;
                    sayac_uc--;
                    sayac_dort--;
                    sayac_bes--;
                    sayac_altı--;
                    sayac_yedi--;
                    sayac_sekiz--;

                }


                if (kaydet == '2'){

                    if (sayac%3 ==0)
                        System.out.print("A");
                    if (sayac%3 ==1)
                        System.out.print("B");
                    if (sayac%3 == 2) {
                        System.out.print("C");
                    }
                    

                    sayac++;

                }else if (kaydet == '3') {

                    if (sayac_iki%3==0)
                        System.out.print("D");
                    if (sayac_iki%3==1)
                        System.out.print("E");
                    if (sayac_iki%3==2) {
                        System.out.print("F");
                    }
                    sayac_iki++;

                }else if (kaydet == '4') {

                    if (sayac_uc%3==0)
                        System.out.print("G");
                    if (sayac_uc%3==1)
                        System.out.print("H");
                    if (sayac_uc%3==2) {
                        System.out.print("I");
                    }
                    sayac_uc++;

                }else if (kaydet == '5') {

                    if (sayac_dort%3 == 0)
                        System.out.print("J");
                    if (sayac_dort%3 == 1) {
                        System.out.print("K");
                    }
                    if (sayac_dort%3 == 2) {
                        System.out.print("L");
                    }
                    sayac_dort++;

                }else if (kaydet == '6') {

                    if (sayac_bes%3 == 0)
                        System.out.print("M");
                    if (sayac_bes%3 == 1)
                        System.out.print("N");
                    if (sayac_bes%3 == 2) {
                        System.out.print("O");
                    }

                    sayac_bes++;

                }else if (kaydet == '7') {

                    if (sayac_altı%4 ==0)
                        System.out.print("P");
                    if (sayac_altı%4 == 1)
                        System.out.print("Q");
                    if (sayac_altı%4 == 2)
                        System.out.print("R");
                    if (sayac_altı%4 == 3) {
                        System.out.print("S");
                    }

                    sayac_altı++;

                }else if (kaydet == '8') {


                    if (sayac_yedi%3 == 0)
                        System.out.print("T");
                    if (sayac_yedi%3 == 1)
                        System.out.print("U");
                    if (sayac_yedi%3 == 2) {
                        System.out.print("V");
                    }
                    sayac_yedi++;

                }else if (kaydet == '9') {

                    if (sayac_sekiz%4 ==0)
                        System.out.print("W");
                    if (sayac_sekiz%4 == 1)
                        System.out.print("X");
                    if (sayac_sekiz%4 == 2)
                        System.out.print("Y");
                    if (sayac_sekiz%4 == 3)
                        System.out.print("Z");

                    sayac_sekiz++;
                }


            }catch(ArrayIndexOutOfBoundsException e){

            }

        }


    }





}







