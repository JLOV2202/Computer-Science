#define _CRT_SECURE_NO_WARNINGS
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <locale.h>

typedef struct {

	char nome[50];
	char tel[16];
	char email[50];

} pessoa;

void newContato(pessoa *contato);
void searchContato(pessoa contato[], int index);
void listContato(pessoa contato[], int index);

//Limpa o buffer do scan
void flush_in() {
	int ch;
	while ((ch = fgetc(stdin)) != EOF && ch != '\n') {}
}

int main() {

	setlocale(LC_ALL, "Portuguese");

	pessoa contato[100] = { "null", "null", "null"};

	int op = 0;
	int index = 0;
	int id = 0;
	int i = 0;

	do {

		system("cls");
		printf("====== Agenda de Contatos ======\n");
		printf("\n       ------ MENU ------\n\n");
		printf(" [ 1 ] Cadastrar Contato \n");
		printf(" [ 2 ] Consultar Contato \n");
		printf(" [ 3 ] Listar os Contatos \n");
		printf(" [ 4 ] Excluir um Contato \n");
		printf(" [ 5 ] Sair \n");

		printf("\n Informe um Opção: ");
		scanf("%d", &op);
		flush_in();

		switch (op) {
		case 1:
			newContato(&contato[index]);
			index++;
			break;
		case 2:
			searchContato(contato, index);
			break;
		case 3:
			listContato(contato, index);
			break;
		case 4:
			system("cls");
			printf("\n------ Excluir Contato ------\n");
			printf("\nInforme o Código: ");
			scanf("%d", &id);
			printf("\n\n Código: %d", id);
			printf("\n Nome: %s", contato[id].nome);
			printf("\n Telefone: %s", contato[id].tel);
			printf("\n Email: %s", contato[id].email);
			printf("\n\nDeseja Excluir o Contato?\n [ 1 ] Sim\n [ 2 ] Não\n\nInforme uma Opção: ");

			scanf("%i", &i);
			if (i == 1) {
				for (i = id; i < index; i++) {
					strcpy(contato[i].nome, contato[i + 1].nome);
					strcpy(contato[i].tel, contato[i + 1].tel);
					strcpy(contato[i].email, contato[i + 1].email);
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

void newContato(pessoa *contato) {

	system("cls");
	printf("\n------ Cadastro de Contato ------");
	printf("\nNOME: ");
	gets((*contato).nome);
	printf("TELEFONE: ");
	gets((*contato).tel);
	printf("EMAIL: ");
	gets((*contato).email);

}

void searchContato(pessoa contato[], int index) {

	int op = 0;
	int i = 0;
	char search[50];

	do {
		system("cls");
		printf("\n------ Cunsultar Contato ------\n\n");
		printf(" [ 1 ] Buscar por ID \n");
		printf(" [ 2 ] Buscar por Nome \n");
		printf(" [ 3 ] Buscar por Telefone \n");
		printf(" [ 4 ] Buscar por Email \n");
		printf(" [ 5 ] Sair \n");

		printf("\n Informe um Opção: ");
		scanf("%d", &op);
		flush_in();

		switch (op) {
		case 1:
			system("cls");
			printf("\n---- Consuta por ID ----");
			printf("\nInforme o ID: ");
			scanf("%d", &i);
			if (i < index && i >= 0) {
				printf("\n Código...: %i ", i);
				printf("\n Nome.....: %s", contato[i].nome);
				printf("\n Telefone.: %s", contato[i].tel);
				printf("\n Email....: %s", contato[i].email);
			} else {
				printf("\n Contato Não Encontrado!");
			}
			printf("\n\n");
			system("pause");
			break;
		case 2:
			system("cls");
			printf("\n---- Consuta por Nome ----");
			printf("\nInforme o Nome: ");
			gets(search);
			for (i = 0; i < index; i++) {
				if (strcmp(search, contato[i].nome) == 0) {
					printf("\n Código...: %i ", i);
					printf("\n Nome.....: %s", contato[i].nome);
					printf("\n Telefone.: %s", contato[i].tel);
					printf("\n Email....: %s", contato[i].email);
					break;
				}
			}
			if (strcmp(search, contato[i].email) != 0){
				printf("\n Contato Não Encontrado!!!");
			}
			printf("\n\n");
			system("pause");
			break;
		case 3:
			system("cls");
			printf("\n---- Consuta por Telefone ----");
			printf("\nInforme o Telefone: ");
			gets(search);
			for (i = 0; i < index; i++) {
				if (strcmp(search, contato[i].tel) == 0) {
					printf("\n Código...: %i ", i);
					printf("\n Nome.....: %s", contato[i].nome);
					printf("\n Telefone.: %s", contato[i].tel);
					printf("\n Email....: %s", contato[i].email);
					break;
				}
			}
			if (strcmp(search, contato[i].email) != 0){
				printf("\n Contato Não Encontrado!!!");
			}
			printf("\n\n");
			system("pause");
			break;
		case 4:
			system("cls");
			printf("\n---- Consuta por Email ----");
			printf("\nInforme o Email: ");
			gets(search);
			for (i = 0; i < index; i++) {
				if (strcmp(search, contato[i].email) == 0) {
					printf("\n Código...: %i ", i);
					printf("\n Nome.....: %s", contato[i].nome);
					printf("\n Telefone.: %s", contato[i].tel);
					printf("\n Email....: %s", contato[i].email);
					break;
				}
			}
			if (strcmp(search, contato[i].email) != 0){
				printf("\n Contato Não Encontrado!!!");
			}
			printf("\n\n");
			system("pause");
			break;
		case 5:
			break;
		}

	} while (op != 5);
}

void listContato(pessoa contato[], int index) {
	int i = 0;
	
	system("cls");
	printf("\n----- Listagem de Contatos -----\n");
	for (i = 0; i < index; i++) {
		printf("\n Código...: %d", i);
		printf("\n Nome.....: %s", contato[i].nome);
		printf("\n Telefone.: %s", contato[i].tel);
		printf("\n Email....: %s", contato[i].email);
		printf("\n--------------------------------\n");
	}
	system("pause");
}
