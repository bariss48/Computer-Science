#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>

#define size 25

struct film_bilgileri{
                char film_adi[size];
                char yonetmen[size];
                char basrol[size];
                char senarist[size];
                int yil;
}filmler;

int Menu();
void filmEkle();
void film_sil();
void filmListele();
int main()
{
                printf("+++++++++++++++++++++++++++++++F�LM ARS�VLEME S�STEM�++++++++++++++++++++++++++++++\n\n");
                Menu();
    getch();
    return 0;
}
int Menu()
{
     char Tercih = 'r';
     printf("\n");
                printf(" Film Ekle-->1\n Filmleri Listele-->2\n Film G�ncelle-->3\n Film Sil-->4\n Film Ara-->5\n Programdan ��k-->E\n"); 
     Tercih = getche();
     while(Tercih != 'E' || Tercih != 'e') {
          switch(Tercih)
          {
                        case '1': {filmEkle();break;}
                        case '2': {filmListele();break;}
                        case '3': {break;}
                        case '4': {film_sil();break;}
                        case '5': {break;}
                                                                                              
                                                                                              
                                                                                              
          }
          printf("\nBa�ka i�lem yapmak istiyor musunuz(E/H)?\n");
          Tercih = getche();
          if(Tercih == 'H' || Tercih == 'h') {
                    break;
          }
          if(Tercih == 'E' || Tercih== 'e'){
               return Menu();
                                 }
     }
}
void filmEkle()
{
                FILE *fp;
                fp = fopen("filmveritaban�.dat","a");
                printf("\nfilm ad�n�,ba�rol�,senaristi,y�netmeni ve yay�nlanma y�l�n� giriniz:\n");
                fflush(stdin);
                gets(filmler.film_adi);
                gets(filmler.basrol);
                gets(filmler.senarist);
                gets(filmler.yonetmen);
                fflush(stdin);
                scanf("%d",&filmler.yil);
                
                fwrite(&filmler,sizeof(film_bilgileri),1,fp);
                fseek(fp,0,SEEK_SET);
                fclose(fp);
                return;
}
void film_sil(){
     char filmad_temp[30];
     FILE *FilmDB;
     FILE *TempFilmDB;
     printf("\nSilmek istedi�iniz filmin ad�n� giriniz: \n");
     scanf("%s", &filmad_temp);
     // Dosyadaki b�t�n kay�tlar taran�r ve silinmesini istedi�imiz kay�t atlanarak ge�ici bir dosyaya, silinecek kay�t d���ndakilerin hepsi yaz�l�r. 
     FilmDB = fopen("filmveritaban�.dat","r");
     TempFilmDB = fopen("TempFile.dat","a");
    
     while(!feof(FilmDB))
     {
            fread(&filmler, sizeof(film_bilgileri),1,FilmDB);
            if(&filmler != NULL)
            {
                if(strcmp(filmler.film_adi,filmad_temp))
                {
                    fwrite(&filmler, sizeof(film_bilgileri),1,TempFilmDB);    
                }
                else if(strcmp(filmler.film_adi,filmad_temp))
                {
                    
                }
            }
     }printf("\nFilm ba�ar�yla silindi!\n");
     fclose(FilmDB);
     fclose(TempFilmDB);
     // Dosya silinir.
     remove("filmveritaban�.dat");
     // ge�ici dosyan�n ismi as�l dosya ismi de�i�tirilir.
     rename("TempFile.dat","filmveritaban�.dat");
}

void filmListele(){
                struct film_bilgileri gecici;
                FILE *filmDosya;
                filmDosya = fopen("filmveritaban�.dat","r");
                struct film_bilgileri filmler[size] = {"","","","",0};
                int i = 0;
                if(filmDosya == NULL)
                {              printf("Dosya acilamadi.\n");
                return;
                }
                else{
                               while(fread(&filmler[i],sizeof(film_bilgileri),1,filmDosya))
                               { i++;
                               }
                for(i = 0; i < 24; i++){      //Bubble sort ile filmler yayinlanma yillarina gore listeleniyor.
                               for(int j = 0; j < 24-i; j++){
                                               if(filmler[j+1].yil > filmler[j].yil){
                                                               gecici = filmler[j];
                                                               filmler[j] = filmler[j+1];
                                                               filmler[j+1] = gecici;

                                                               }
                                               }
                               }

                for (i = 0; i < 25; i++){
                               if(filmler[i].yil == 0 ){
                                               }
                               else{
                               printf("%s\t\t%s\t\t%s\t\t%s\t\t%4d\n",filmler[i].film_adi,filmler[i].basrol,filmler[i].yonetmen,filmler[i].senarist,filmler[i].yil);
                                               }
                               }
                }
rewind(filmDosya); // imleci dosya bas�na yollad�m
fclose(filmDosya);
printf("\n");
return;
}

