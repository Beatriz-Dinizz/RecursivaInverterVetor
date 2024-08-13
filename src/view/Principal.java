package view;

import controller.InverterVetor;

public class Principal {

	public static void main(String[] args) {
		InverterVetor inverterVetor = new InverterVetor();
		
		int[] vetor10 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println("Vetor de 10 posições: ");
		carregarVetor(vetor10);
		inverterVetor.inverterNumerosVetor(vetor10, 0, vetor10.length - 1);
		System.out.println("Vetor de 10 posições invertido:");
        carregarVetor(vetor10);
        
        int[] vetor11 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        System.out.println("\nVetor de 11 posições:");
        carregarVetor(vetor11);
        inverterVetor.inverterNumerosVetor(vetor11, 0, vetor11.length - 1);
        System.out.println("Vetor de 11 posições invertido: ");
        carregarVetor(vetor11);
	}
	
	public static void carregarVetor(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
