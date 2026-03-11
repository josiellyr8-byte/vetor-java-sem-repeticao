import java.util.Scanner;

public class VetorSemRepetidos {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        preencherVetor(numeros);
        imprimir(numeros);
    }

    public static void preencherVetor(int[] v) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {

            System.out.print("Digite um número: ");
            int valor = input.nextInt();

            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (v[j] == valor) {
                    repetido = true;
                }
            }

            if (repetido) {
                System.out.println("Número repetido! Digite outro.");
                i--;
            } else {
                v[i] = valor;
            }
        }
    }

    public static void imprimir(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}