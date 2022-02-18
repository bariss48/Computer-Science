import java.util.Random;
import java.util.Scanner;

public class sezar {


    // Author Barı$

    public static void main(String[] args) {

        int boyut;
        int bos ;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();


        System.out.println("DİZİNİN BOYUTUNU GİRİNİZ...");

        boyut = scanner.nextInt();


        int a[] = new int[boyut];


        for (int i = 0; i < boyut; i++) {

            a[i] = random.nextInt(100);
            System.out.print(a[i] + "\t");

        }
        for (int i = 0; i < boyut - 1; i++) {

            int enk = i;

            for (int j = i + 1; j < boyut; j++) {

                if (a[enk] > a[j]) {

                    enk = j;

                }
            }

                bos = a[i];
                a[i] = a[enk];
                a[enk] = bos;


            }

            System.out.println();
            System.out.println("DİZİMİZİN SIRALANMIŞ HALİ...");

            for (int k = 0; k < boyut; k++) {

                System.out.print(a[k] + "\t");


            }


        }

    }





