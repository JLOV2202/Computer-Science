#include <stdio.h>

void insertionSort();
void selectionSort();
void bubbleSort();

int main() {

	insertionSort();
	printf("\n");
	selectionSort();
	printf("\n");
	bubbleSort();

	return 0;
}

void insertionSort() {

	int i, j, x, elemento, vetor[10] = {7, 4, 1, 5, 6, 9, 2, 8, 3, 0};

	for (j = 0; j < 10; j++) {

		elemento = vetor[j];
		i = j - 1;

		while (i >= 0 && vetor[i] > elemento) {

			vetor[i + 1] = vetor[i];
			i = i - 1;
			vetor[i + 1] = elemento;

		}
	}

	for (x = 0; x < 10; x++) {
		printf("[%d]", vetor[x]);
	}
}

void selectionSort() {

	int i, j, menor, aux, vetor[10] = { 7, 4, 1, 5, 6, 9, 2, 8, 3, 0 };

	for (i = 0; i < 10; i++) {

		menor = i;

		for (j = i + 1; j < 10; j++) {

			if (vetor[j] > vetor[menor]) menor = j;

		}
		aux = vetor[menor];
		vetor[menor] = vetor[i];
		vetor[i] = aux;
	}

	for (int x = 0; x < 10; x++) {
		printf("[%d]", vetor[x]);
	}
}

void bubbleSort() {

	int i, j, aux, vetor[10] = { 7, 4, 1, 5, 6, 9, 2, 8, 3, 0 };

	for (i = 10; i >= 1; i--) {

		for (j = 1; j <= i - 1; j = j + 1) {

			if (vetor[j - 1] < vetor[j]) {
				aux = vetor[j];
				vetor[j] = vetor[j - 1];
				vetor[j - 1] = aux;
			}
		}
	}

	for (int x = 0; x < 10; x++) {
		printf("[%d]", vetor[x]);
	}
}
