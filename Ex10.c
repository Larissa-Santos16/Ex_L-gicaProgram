#include <stdio.h>
#include <stdlib.h>

/* Fazer um programa em "C" que lê um conjunto de 10 valores inteiros e verifica
se algum dos valores é igual a média dos mesmos. */

int main(int argc, char *argv[]) {
	
	
	int valor[10];
	int i;
	int soma = 0;
	int resultado = 0;
	
	
	for(i=0; i <= 10; i ++){
		
		printf("Digite um numero: \n%d", i);
		scanf("%d", &valor[i]);	
		
		soma = soma + valor[i];
		resultado = soma/10;
		
}
	
for(i = 0; i <= 10; i++){
		if(resultado == valor[i]){
			printf("\nA media e igual ao valor: %d do vetor\n", valor[i]);
		}
	}

	
	
	return 0;
	
}

	
