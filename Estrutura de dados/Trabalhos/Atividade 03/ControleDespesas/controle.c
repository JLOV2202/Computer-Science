#define _CRT_SECURE_NO_WARNINGS
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <locale.h>

typedef struct {

	char nome[50];
	float val;
	int tipo;

} despesa;

void newDespesa(despesa* contas);
void listDespesa(despesa contas[], int index, float sal);

//Limpa o buffer do scan
void flush_in() {
	int ch;
	while ((ch = fgetc(stdin)) != EOF && ch != '\n') {}
}

int main() {

	setlocale(LC_ALL, "Portuguese");

	despesa contas[100] = { "null", 0, 0 };

	int op = 0;
	int index = 0;
	int id = 0;
	int i = 0;
	float sal = 0;

	do {

		system("cls");
		printf("====== Controle de Despesas ======\n");
		printf("\n       ------- MENU -------\n\n");
		printf(" [ 1 ] Nova Despesa \n");
		printf(" [ 2 ] Listar Despesas \n");
		printf(" [ 3 ] Alterar Salário \n");
		printf(" [ 4 ] Excluir Despesa \n");
		printf(" [ 5 ] Sair \n");

		printf("\n Informe um Opção: ");
		scanf("%d", &op);
		flush_in();

		switch (op) {
		case 1:
			newDespesa(&contas[index]);
			index++;
			break;
		case 2:
			listDespesa(contas, index, sal);
			break;
		case 3:
			system("cls");
			printf("\n------ Salário ------\n");
			printf("\nInforme seu Salário: ");
			scanf("%f", &sal);
			break;
		case 4:
			system("cls");
			printf("\n------ Excluir Despesa ------\n");
			printf("\nInforme o Código: ");
			scanf("%d", &id);
			printf("\n\n Código: %d", id);
			printf("\n Nome: %s", contas[id].nome);
			printf("\n Valor: %.2f", contas[id].val);
			printf("\n Tipo: %s", (contas[id].tipo == 0 ? "Fixa" : "Extra"));
			printf("\n\nDeseja Excluir a Despesa?\n [ 1 ] Sim\n [ 2 ] Não\n\nInforme uma Opção: ");

			scanf("%i", &i);
			if (i == 1) {
				for (i = id; i < index; i++) {
					strcpy(contas[i].nome, contas[i + 1].nome);
					contas[i].val = contas[i + 1].val;
					contas[i].tipo = contas[i + 1].tipo;
				}
				index--;
			}
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

void newDespesa(despesa* contas) {

	int op = 0;

	system("cls");
	printf("\n------ Nova Despesa ------");
	printf("\nNome: ");
	gets((*contas).nome);
	printf("Valor: ");
	scanf("%f", &(*contas).val);
	flush_in();
	printf("Despesa Fixa?\n [ 1 ] Sim\n [ 2 ] Não\n\n>>");
	scanf("%d", &op);

	while (op != 1 && op != 2) {
		printf("\nInforme uma opção válida\n\n>>");
		scanf("%d", &op);
	}

	if (op == 1 ) {
		(*contas).tipo = 0;
	}
	else {
		(*contas).tipo = 1;
	}
}

void listDespesa(despesa contas[], int index, float sal) {

	float tot = 0;

	system("cls");
	printf("\n ---------- Listagem de Despesas ----------\n");

	printf("\n| Cód |    Nome    |    Valor     | Tipo  |\n");
	for (int i = 0; i < index; i++) {
		printf("|  %.2d | %10s | R$%10.2f | %5s |\n", i, contas[i].nome, contas[i].val, (contas[i].tipo == 0 ? "Fixo" : "Extra"));
		tot += contas[i].val;
	}
	printf("\n Salário: R$%.2f\n Gasto: R$%.2f\n Saldo: R$%.2f\n\n", sal, tot, sal-tot);
	system("pause");
}