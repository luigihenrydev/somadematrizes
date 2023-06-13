import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho das matrizes: ");
        int tamanho = scanner.nextInt();

        System.out.println("Preencha a primeira matriz:");
        int[][] matriz1 = criarMatriz(tamanho);

        System.out.println("Preencha a segunda matriz:");
        int[][] matriz2 = criarMatriz(tamanho);

        int[][] matrizResultante = somarMatrizes(matriz1, matriz2);

        System.out.println("A matriz resultante da soma é:");
        exibirMatriz(matrizResultante);
    }

    public static int[][] criarMatriz(int tamanho) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("Digite um valor inteiro para a matriz: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int tamanho = matriz1.length;
        int[][] resultado = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public static void exibirMatriz(int[][] matriz) {
        int tamanho = matriz.length;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}