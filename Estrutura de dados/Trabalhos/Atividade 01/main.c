#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int line(int);
void vet();
void mat();
void str();
void fnc(int dia, int mes, int ano);
void pnt();

//Limpa o buffer do scan
void flush_in() {
	int ch;
	while ((ch = fgetc(stdin)) != EOF && ch != '\n') {}
}

//Constroi o menu e chama os procedimentos
int main(){
	
	int mn = 0;

	while (mn != -1) {
		int res = 0;
		char op = 'n';
		line(0);
		printf("1-Vetores\n2-Matrizes\n3-Structs\n4-Funcoes\n5-Ponteiros\n");
		line(7);

		while (res == 0) {
			printf(">>");
			res = scanf("%d", &mn);
			if (res == 0) printf("Valor Invalido!\n");
			flush_in();
		}
		system("cls");

		switch (mn) {
		case 1:
			vet();
			break;
		case 2:
			mat();
			break;
		case 3:
			str();
			break;
		case 4:
			fnc(5, 4, 2022);
			break;
		case 5:
			pnt();
			break;
		default:
			printf("Opcao nao existe!\n");
			mn = 0;
		}
		printf("Deseja sair?(s/n)\n>>");
		res = 0;
		while (res == 0) {
			res = scanf("%c", &op);
			if (res == 0) printf("Valor Invalido!\n>>");
			flush_in();
		}
		if (op == 's' || op == 'S') {
			mn = -1;
		}
		system("cls");
	}
	return 0;
}

//Escreve um linha
int line(int tp) {
	char ln[8][22] = { "========MENU========\n\0", "-------VETOR--------\n\0", "-------MATRIZ-------\n\0", "-------STRUCT-------\n\0", "-------FUNCAO-------\n\0", "------PONTEIRO------\n\0", "--------------------\n\0", "====================\n\0"};

	printf(ln[tp]);

	return 0;
}

//Atividade 1: Vetores
void vet() {

	line(1);

	int vet[6] = { 1, 0, 5, -2, -5, 7 }, sm = 0;
	
	sm = vet[0] + vet[1] + vet[5];

	printf("Soma = %i\n", sm);

	vet[4] = 70;

	for (int x = 0; x < 6; x++) {
		printf("Indice %i: %i\n", x, vet[x]);
	}

	line(6);

	return;
}

//Atividade 2: Matrizes
void mat() {
	line(2);

	int res = 0, val = 0, ec = 0;
	int mat[4][4] = { 1, 2, 3, 4,
					  2, 4, 6, 8,
					  3, 5, 7, 9,
					  0, 2, 5, 1 };

	while (res == 0) {
		printf("Informe um valor inteiro\n>>");
		res = scanf("%d", &val);
		if (res == 0) printf("Valor Invalido!\n");
		flush_in();
	}

	for (int x = 0; x < 4; x++) {
		for (int y = 0; y < 4; y++) {
			if (val == mat[x][y]) printf("O valor foi encontrado na linha %d, coluna %d\n", x, y), ec = 1;
		}
	}
	if (ec == 0) printf("Valor nao encontrado na matriz!\n");
	for (int x = 0; x < 4; x++) {
		for (int y = 0; y < 4; y++) {
			printf("[%d] ", mat[x][y]);
		}
		printf("\n");
	}

	line(6);
}

//Atividade 3: Structs
void str() {
	line(3);

	typedef struct Pessoa{

		char nome[40];
		int dia, mes, ano, idd;

	} __Pessoa;

	__Pessoa p1[3];

	int dt[3] = {5, 4, 2022};

	strcpy(p1[0].nome, "Joao Lucas");
	p1[0].dia = 22;
	p1[0].mes = 2;
	p1[0].ano = 2003;
	p1[0].idd = dt[2] - p1[0].ano;

	strcpy(p1[1].nome, "Maria");
	p1[1].dia = 21;
	p1[1].mes = 1;
	p1[1].ano = 2003;
	p1[1].idd = dt[2] - p1[0].ano;

	strcpy(p1[2].nome, "Ana Clara");
	p1[2].dia = 15;
	p1[2].mes = 7;
	p1[2].ano = 2003;
	p1[2].idd = dt[2] - p1[0].ano;

	for (int x = 0; x < 3; x++) {
		if (p1[x].mes > dt[1]) {
			p1[x].idd -= 1;
		}
		else if (p1[2].mes == dt[1] && p1[x].dia > dt[0]) {
			p1[x].idd -= 1;
		}
	}

	for (int x = 0; x < 3; x++) {
		printf("Nome: %s\nData de Nascimento: %d/%d/%d\nIdade: %d\n\n", p1[x].nome, p1[x].dia, p1[x].mes, p1[x].ano, p1[x].idd);
	}

	line(6);
}

//Atividade 4: Funcoes e Procedimentos
void fnc(int dia, int mes, int ano) {
	line(4);

	char nMes[12][10] = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
	
	printf("%d de %s de %d\n", dia, nMes[mes - 1], ano);

	line(6);
}

//Atividade 5: Ponteiros
void pnt() {
	line(5);

	int res = 0, a = 0, b = 0;

	while (res == 0) {
		printf("Informe um valor inteiro\n>>");
		res = scanf("%d", &a);
		if (res == 0) printf("Valor Invalido!\n");
		flush_in();
	}
	res = 0;
	while (res == 0) {
		printf("Informe um valor inteiro\n>>");
		res = scanf("%d", &b);
		if (res == 0) printf("Valor Invalido!\n");
		flush_in();
	}

	printf("A: %d\nB: %d\n", a, b);

	int* pA;
	int* pB;

	pA = &a;
	pB = &b;

	*pA = 2 * a;
	*pB = 2 * b;

	printf("A*2: %d\nB*2: %d\n(A*2)+(B*2)=%d\n", *pA, *pB, *pA+*pB);

	line(6);
}
