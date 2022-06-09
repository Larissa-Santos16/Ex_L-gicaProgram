#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv){
	/*Fazer um programa que lê valores para uma matriz do tipo
	"float" de 5 linhas por 3 colunas e imprime a diferença entre a média
	dos elementos das colunas pares e a média dos elementos das linhas ímpares.*/


	float mat[5][3];
	int i;
	int j;
	float par;
	float impar;
	float diferenca;



	for(i = 0; i < 5; i++){
		for( j = 0; j < 3; j++){
			printf("Digite um numero:\n");
			scanf("%f", &mat[i][j]);
		}
	}


	for(i = 0; i < 5; i++){
		for(j = 0; j < 3; j++){
			printf("\n\n%f\n", mat[i][j]);
		}
	}



	for(i = 0; i < 5; i++){
		for(j = 0; j < 3; j++){
			if(j % 2 != 0){
				par += mat[i][j] / 5;
			}else if((i+1) % 2 != 0){
				impar += mat[i][j] / 9;			
			}
		}
	}

	printf("\n \nA media dos elementos das colunas pares, sera: %f", par);
	printf("\n \nA media dos elementos das linhas impares, sera: %f", impar);



	diferenca = par - impar;
	printf("\n \nA diferenca entre as duas medias, sera: %f", diferenca);

	return 0;
}

