/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package separarparimpar;
import java.util.Scanner;

public class SepararParImpar {
    public static void main(String[] args) {
       // Inicializa os vetores para armazenar números, pares e ímpares
        int[] numeros = new int[20];
        int[] pares;
        int[] impares;
        
        // Inicializa contadores para acompanhar o número de pares e ímpares
        int countPares = 0;
        int countImpares = 0;

        Scanner scanner = new Scanner(System.in);

        // Preenche o vetor com 20 números inteiros
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Conta a quantidade de pares e ímpares
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        // Inicializa os vetores de pares e ímpares com o tamanho correto
        pares = new int[countPares];
        impares = new int[countImpares];

        // Preenche os vetores de pares e ímpares
        int indexPares = 0;
        int indexImpares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[indexPares] = numero;
                indexPares++;
            } else {
                impares[indexImpares] = numero;
                indexImpares++;
            }
        }

        // Imprime os vetores
        System.out.println("Números originais:");
        imprimirVetor(numeros);

        System.out.println("\nNúmeros pares:");
        imprimirVetor(pares);

        System.out.println("\nNúmeros ímpares:");
        imprimirVetor(impares);

        // Fecha o scanner
        scanner.close();
    }

    // Método auxiliar para imprimir um vetor de inteiros
    private static void imprimirVetor(int[] vetor) {
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
        System.out.println(); 
    }
    
}
