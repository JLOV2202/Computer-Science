#define _CRT_SECURE_NO_WARNINGS
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

typedef struct clientes
{
	int num_conta;
	char nome[20], sobrenome[20];
	float saldo;
} tipo_cliente;

//Limpa o buffer do scan
void flush_in() {
	int ch;
	while ((ch = fgetc(stdin)) != EOF && ch != '\n') {}
}

int main() {

	FILE* arq;
	char continuar;
	tipo_cliente clientes;
	arq = fopen("clientes.txt", "w");
	if (arq != NULL) {
		do {
			printf("Numero conta: ");
			scanf("%d", &clientes.num_conta);
			printf("Nome: ");
			scanf("%s", clientes.nome);
			printf("Sobrenome: ");
			scanf("%s", clientes.sobrenome);
			printf("Saldo: ");
			scanf("%f", &clientes.saldo);
			fwrite(&clientes, sizeof(clientes), 1, arq);
			printf("Continuar (S/N): ");
			scanf(" %c", &continuar);
		} while (continuar == 's' || continuar == 'S');
		fclose(arq);
	}
	else {
		printf("Erro na abertura do arquivo.");
	}

	return 0;
}