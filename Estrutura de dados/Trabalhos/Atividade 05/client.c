#define _CRT_SECURE_NO_WARNINGS
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <locale.h>

typedef struct clientes {
	int num_conta;
	char nome[20], sobrenome[20];
	float saldo;
} tipo_cliente;

void newClient();
void altClient();
void delClient();
void listClient();

//Limpa o buffer do scan
void flush_in() {
	int ch;
	while ((ch = fgetc(stdin)) != EOF && ch != '\n') {}
}

int main() {

	setlocale(LC_ALL, "Portuguese");

	int op = 0;
	int id = 0;

	do {

		system("cls");
		printf("====== Controle de Clientes ======\n");
		printf("\n       ------- MENU -------\n\n");
		printf(" [ 1 ] Novo Cliente \n");
		printf(" [ 2 ] Listar Clientes \n");
		printf(" [ 3 ] Alterar Cliente \n");
		printf(" [ 4 ] Excluir Cliente \n");
		printf(" [ 5 ] Sair \n");

		printf("\n Informe um Opção: ");
		scanf("%d", &op);
		flush_in();

		switch (op) {
		case 1:
			newClient();
			break;
		case 2:
			listClient();
			break;
		case 3:
			altClient();
			break;
		case 4:
			delClient();
			break;
		case 5:
			system("cls");
			printf("\n------ Você Escolheu Sair ------\n");
			printf("\nFeito por: João Lucas de Oliveira Vieira\n");
			printf("\n--------------------------------\n");
			break;
		}
	} while (op != 5);

	return 0;
}

void newClient() {

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
}

void altClient() {

}

void delClient() {

	system("cls");
	printf("\n------ Excluir Despesa ------\n");
	printf("\nInforme o Código: ");
	scanf("%d", &id);
	printf("\n\n Código: %d", id);
	printf("\n Nome: %s", contas[id].nome);
	printf("\n Valor: %.2f", contas[id].val);
	printf("\n Tipo: %s", (contas[id].tipo == 0 ? "Fixa" : "Extra"));
	printf("\n\nDeseja Excluir a Despesa?\n [ 1 ] Sim\n [ 2 ] Não\n\nInforme uma Opção: ");
}

void listClient() {

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
}