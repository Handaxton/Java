/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscanome;
import java.util.Scanner;

public class BuscaNome {
    public static void main(String[] args) {
         // Inicializa o vetor com 10 nomes
        String[] nomes = new String[10];
        Scanner scanner = new Scanner(System.in);

        // Preenche o vetor com 10 nomes (pode ser personalizado conforme necessário)
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome #" + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Solicita que o usuário digite um nome para busca
        System.out.print("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        // Verifica se o nome está presente no vetor
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        // Exibe a mensagem correspondente
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        // Fecha o scanner
        scanner.close();
    }
    
}
