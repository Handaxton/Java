public class MAT {
    
    public static void main(String[] args) {
        // Criando a matriz de 5 linhas e 10 colunas
        int[][] MAT = new int[5][10];

        // Preenchendo a matriz com números inteiros (pode adaptar conforme necessário)
        // Aqui, estou preenchendo com valores aleatórios para demonstração
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                MAT[i][j] = (int) (Math.random() * 100); // Números aleatórios entre 0 e 99 
            }
        }

        
        System.out.println("Soma dos elementos de cada linha e paridade:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 10; j++) {
                somaLinha += MAT[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": Soma = " + somaLinha + ", Paridade = " + (somaLinha % 2 == 0 ? "Par" : "Ímpar"));
        }

        // 1. Soma dos elementos de cada linha e verificação par ou ímpar
        System.out.println("\nSoma dos elementos de cada coluna e paridade:");
        for (int j = 0; j < 10; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += MAT[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": Soma = " + somaColuna + ", Paridade = " + (somaColuna % 2 == 0 ? "Par" : "Ímpar"));
        }
    }

}
