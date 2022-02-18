#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>

#define size 35

// 18253005 Do�ukan ERG�N
// 18253007 Berk Bar�� KARA


struct film{
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
void filmAra();
void filmGuncel();
int main()
{
                printf("+++++++++++++++++++++++++++++++FILM ARSIVLEME SISTEMI++++++++++++++++++++++++++++++\n\n");
                Menu();
    getch();
    return 0;
}
int Menu()
{
     char Tercih = 'r';
     printf("\n");
                printf(" Film Ekle-->1\n Filmleri Listele-->2\n Film Guncelle-->3\n Film Sil-->4\n Film Ara-->5\n Programdan Cik-->E\n"); 
     Tercih = getche();
     while(Tercih != 'E' || Tercih != 'e') {
          switch(Tercih)
          {
                        case '1': {filmEkle();break;}
                        case '2': {filmListele();break;}
                        case '3': {filmGuncel();break;}
                        case '4': {film_sil();break;}
                        case '5': {filmAra();break;}
                                                                                              
                                                                                              
                                                                                              
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
void filmAra(){
                struct film oscar;
                system("cls");
                char aranicak[size];
                int aranicakyil;
                FILE*filmDosyax;
                int flag = 0,tercih;
                filmDosyax=fopen("filmveritaban�.dat","r");
                if(filmDosyax == NULL){
                               printf("dosya acilamadi \n");
                               return;
                }
                printf("arama turunu seciniz \n1 -> Film adina gore \n2 ->basrole gore \n3 -> yonetmene gore \n4 -> senariste gore \n5 -> yayinlama yilina gore \n");
                scanf("%d",&tercih);
                fflush(stdin);
                switch(tercih){
                               case 1: {
                                               printf("Aran�cak filmin adini giriniz : ->");
                                               scanf("%s",&aranicak);
                                               while(fread(&oscar,sizeof(oscar),1,filmDosyax))
{
                if(strcmp(aranicak,oscar.film_adi)== 0){
                               flag =1;
                               printf("\n%s\t\t%s\t\t%s\t\t%s\t\t%4d\n",oscar.film_adi,oscar.basrol,oscar.yonetmen,oscar.senarist,oscar.yil);
                }
                                               }                              
                                                               break;
                               }
                               case 2:{
                                               printf("aran�cak basrolun ad�n� giriniz : ->");
                                               scanf("%s",&aranicak);
                                               while(fread(&oscar,sizeof(oscar),1,filmDosyax)){
                                                               if(strcmp(aranicak,oscar.basrol) == 0){
                                                                               flag=1;
                                                                               printf("\n%s\t\t%s\t\t%s\t\t%s\t\t%4d\n",oscar.film_adi,oscar.basrol,oscar.yonetmen,oscar.senarist,oscar.yil);
                                                               }
                                               }
                                               break;
                               }
                               case 3:{
                                               printf("aran�cak yonetmeni giriniz : ->");
                                                scanf("%s",&aranicak);
                                               while(fread(&oscar,sizeof(oscar),1,filmDosyax))
{
                if(strcmp(aranicak,oscar.yonetmen)== 0){
                               flag = 1;
                               printf("\n%s\t\t%s\t\t%s\t\t%4d\n",oscar.film_adi,oscar.basrol,oscar.yonetmen,oscar.senarist,oscar.yil);
                }
                                               }                                             break;
                               }
                               case 4: {
                                               printf("aranicak senaristi giriniz ->");
                                               scanf("%s",&aranicak);
                                               while(fread(&oscar,sizeof(oscar),1,filmDosyax)){
                                                               if(strcmp(aranicak,oscar.senarist)== 0){
                                                                               flag =1;
                                                                               printf("\n%s\t\t%s\t\t%s\t\t%s\t\t%4d\n",oscar.film_adi,oscar.basrol,oscar.yonetmen,oscar.senarist,oscar.yil);                                       
                                                               }
                                               }
                                               break;
                               }
                               case 5 :{
                                               printf("aran�cak yili giriniz : ");
                                               scanf("%d",&aranicakyil);
                                               while(fread(&oscar,sizeof(oscar),1,filmDosyax))
                                               {
                                                               if(aranicakyil == oscar.yil)
                                                               {   flag=1;
                                                               printf("\n%s\t\t%s\t\t%s\t\t%s\t\t%4d\n",oscar.film_adi,oscar.basrol,oscar.yonetmen,oscar.senarist,oscar.yil);
                                                               }
                                               }
                                               break;
                               }              
                               default :{
                                               printf("hatali secim yaptiniz \n");
                                               break;
                               }
                               }
                if(flag = 0){
                               printf("boyle bir film bulunamadi");
                }
                rewind(filmDosyax);
                fclose(filmDosyax);
                printf("\n");
                return ;}

                

void filmEkle()
{
                FILE *fp;
                fp = fopen("filmveritaban�.dat","a");
                printf("\nfilm adini,basrolu,senaristi,yonetmeni ve yayinlanma yilini giriniz:\n");
                fflush(stdin);
                gets(filmler.film_adi);
                gets(filmler.basrol);
                gets(filmler.senarist);
                gets(filmler.yonetmen);
                fflush(stdin);
                scanf("%d",&filmler.yil);
                
                fwrite(&filmler,sizeof(film),1,fp);
                fseek(fp,0,SEEK_SET);
                fclose(fp);
                return;
}
void filmGuncel(){
                struct film film1;
                system("cls");
                char aranicak[size];
                char secim;
                struct film silinecekfilm = {"","","","",0};
                FILE * fpxa;
                int flag = 0;
  fpxa= fopen("filmveritaban�.dat","r+");
  if(fpxa == NULL)
  {
               printf("dosya acilamadi \n");
               return ;
                }
                else {
                               printf("guncellemek istediginiz filmi giriniz: ");
                               scanf("%s",&aranicak);
                               while(fread(&film1,sizeof(film),1,fpxa)){
                                               if(strcmp(aranicak,film1.film_adi)== 0)
                                               {flag=1;
                                               printf("\n%s\t\t%s\t\t%s\t\t%s\t\t%4d\n",film1.film_adi,film1.basrol,film1.yonetmen,film1.senarist,film1.yil);
                                               printf("filmi guncellemek istediginize eminmisiniz.(devam etmek icin E, iptal icin H)\n)");
                                               fflush(stdin);
                                               scanf("%c",&secim);
                                               if(secim == 'E' || secim == 'e'){
                                                               fseek(fpxa,sizeof(film)*(-1),SEEK_CUR);
                                                               fwrite(&silinecekfilm,sizeof(film),1,fpxa);
                                                               fseek(fpxa,-sizeof(film),SEEK_CUR);
                                                               printf("yeni film adini giriniz \n");
                                                               fflush(stdin);
                                                               gets(film1.film_adi);
                                                               printf("yeni basrol oyuncusu adi giriniz \n");
                                                               gets(film1.basrol);
                                                               printf("yeni senarist adini giriniz \n");
                                                               gets(film1.senarist);
                                                               printf("yeni yonetmen adini giriniz \n");
                                                               gets(film1.yonetmen);
                                                               printf("yayinlama yilini giriniz \n");
                                                               fflush(stdin);
                                                               scanf("%d",&film1.yil);
                                                               fwrite(&film1,sizeof(film),1,fpxa);
                                                               printf("guncelleme basarili \n");
                                                               break ;
                                                               
                                               }
                                               }
                               }
                               if (flag == 0)
                               {     
                               printf("boyle bir film bulunamadi\n");
                               return;
                               }
                }
                fseek(fpxa,0,SEEK_SET);
                fclose(fpxa);
                printf("\n");
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
            fread(&filmler, sizeof(film),1,FilmDB);
            if(&filmler != NULL)
            {
                if(strcmp(filmler.film_adi,filmad_temp))
                {
                    fwrite(&filmler, sizeof(film),1,TempFilmDB);    
                }
                else if
                                                                                                                                (strcmp(filmler.film_adi,filmad_temp))
                                                                                                                              
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
                struct film gecici;
                FILE *filmDosya;
                filmDosya = fopen("filmveritaban�.dat","r");
                struct film filmler[size] = {"","","","",0};
                int i = 0;
                if(filmDosya == NULL)
                {              printf("Dosya acilamadi.\n");
                return;
                }
                else{
                               while(fread(&filmler[i],sizeof(film),1,filmDosya))
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

