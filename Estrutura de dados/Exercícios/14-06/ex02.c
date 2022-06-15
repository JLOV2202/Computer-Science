#define _CRT_SECURE_NO_WARNINGS
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

typedef struct clientes {
	int num_conta;
	char nome[20], sobrenome[20];
	float saldo;
} tipo_cliente;

int main() {
	FILE* arq;
	tipo_cliente clientes;
	arq = fopen("clientes.txt", "r");
	if (arq != NULL) {
		while (fread(&clientes, sizeof(clientes), 1, arq)) {
			printf("Numero da conta: %d\nNome: %s\nSobrenome: %s\nSaldo: %.2f\n\n", clientes.num_conta, clientes.nome, clientes.sobrenome, clientes.saldo);
		}
		fclose(arq);
	}
	else {
		printf("Erro na abertura do arquivo.");
	}
	return 0;
}