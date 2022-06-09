#include <stdio.h>
#include <stdlib.h>

/* Fazer um programa em "C" que lê o preço de um produto e inflaciona esse preço em 10% se ele for menor que 100 e em 20% se ele for maior ou igual a 100. */

int main(int argc, char *argv[]) {
	
	int preco;
	int infla;
	
	printf("Digite o valor do produto: \n");
	scanf("%d", &preco);
	
	if (preco < 100 ) {
		
		infla = preco * 1.1;
		
		printf("\nO valor do produto inflacionado sera:\n%d ", infla);
		
	}
	
	else if (preco > 100 ) {
		
		infla = preco * 1.2;
		
		printf("\nO valor do produto inflacionado sera:\n%d ", infla);
		
	}
	
	return 0;
}
