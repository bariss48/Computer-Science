#include<stdio.h>


int main(){
	
	
	int i = 5;
	
	int *p = &i;
	
	printf("%p\n",p);
	
	printf("%d",*p);
	
	// pointer 2 byte int 4 byte printf in i�ine p veya u da yazabiliriz & ampersant de�i�kenin adresini veriyor '*' i�areti ise adresdeki de�eri al�yor.//	
	
	return 0;
}
