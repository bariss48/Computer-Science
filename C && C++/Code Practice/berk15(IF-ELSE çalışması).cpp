#include<stdio.h>

int main(){
	
	int vize1,vize2,final;
	float dersort;
	
	printf("1.vize notunuzu giriniz:");
	scanf("%d",&vize1);
	printf("2.vize notunuzu giriniz:");
	scanf("%d",&vize2);
	printf("Final notunuzu giriniz:");
	scanf("%d",&final);
	
	dersort = (vize1 + vize2 + final) /3.0;
	
	if(dersort > 60){
		
		printf("Dersten gectiniz.");	
	}
    else if (dersort > 50){
    	printf("Dersten bute kaldiniz.");
	}
	else{
		printf("Kaldiniz.");
	}
	
	return 0;
}
