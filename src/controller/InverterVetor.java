package controller;

public class InverterVetor {

	public InverterVetor() {
		super();
	}
	
	public void inverterNumerosVetor(int[] vetor, int inicio, int fim) {
		if(inicio >= fim) {
			return;
		}
		
		int aux = vetor[inicio];
		vetor[inicio] = vetor[fim];
		vetor[fim] = aux;
		
		inverterNumerosVetor(vetor, inicio + 1, fim - 1);
	}
}
