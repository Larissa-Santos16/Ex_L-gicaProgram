#include <stdio.h>
#include <stdlib.h>

/* Fazer um programa em "C" que lê 10 valores e imprime o maior e o menor
valores lidos. */

int main(int argc, char *argv[]) {
	
	int valores [10];
	int menor = 99999 ;
	int maior = -9999;
	int i;
	
	for (i = 0 ; i <= 10; i++){
		
		printf("Digite um valor:\n%d", i);
		scanf("%d", &valores[i]);
		
		
	}
	
	for (i = 0; i<=10; i++){
		
		if(menor> valores[i]){
			menor= valores[i];
		}
		
		if(maior < valores[i]){
		maior = valores[i];
			
		}
		
		printf("\n\nO Maior valor e: \n%d", maior);
		printf("\n\nO Menor valor e: \n%d", menor);
		
	}
	
	
	return 0;
}
