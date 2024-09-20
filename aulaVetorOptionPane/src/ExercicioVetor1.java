import java.util.Scanner;

public class ExercicioVetor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Criar o tamanho do vetor
        System.out.println("Qual o tamanho do vetor?");
        int t = sc.nextInt();
        sc.nextLine();

        int[] tamanho = new int[t];

        //Gravar dados do vetor
        for (int i=0; i<t; i++) {
            System.out.println("Digte valores inteiros(positivos e negativos):");
            tamanho[i] = sc.nextInt();
            sc.nextLine();
        }

         // Exibir os valores negativos
         System.out.println("Valores negativos no vetor:");
         for (int i = 0; i < t; i++) {
             if (tamanho[i] < 0) {
                 System.out.println(tamanho[i]);
                }
            }

        sc.close();
    }
}
