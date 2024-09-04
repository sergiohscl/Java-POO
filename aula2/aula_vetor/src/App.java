// import java.util.Locale;
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Locale.setDefault(new Locale("pt", "BR"));
//         Scanner sc = new Scanner(System.in);
//         double[] vetor = new double[3];

//         // GRAVAR AS ALTURAS NO VETOR
//         for (int i = 0; i < 3; i++) {
//             System.out.println("Digite a altura");
//             vetor[i] = sc.nextDouble();
//         }

//         // IMPRIMIR AS ALTURAS DO VETOR
//         // for (int i = 0; i < 3; i++) {
//         //     System.out.printf("\nAltura: %.2f", vetor[i]);
//         // }
//         // sc.close();

//         for (double altura : vetor) {
//             System.out.println( altura);
//         }

//         sc.close();
//     }
// }

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);
        int quantidadeAlunos = 3; // Quantidade de alunos
        double[][] notas = new double[quantidadeAlunos][2]; // Array 2D para armazenar duas notas por aluno
        double[] medias = new double[quantidadeAlunos]; // Array para armazenar as médias

        // Leitura das notas
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        // Cálculo das médias
        for (int i = 0; i < quantidadeAlunos; i++) {
            medias[i] = (notas[i][0] + notas[i][1]) / 2.0;
        }

        // Exibição das médias
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.printf("Aluno %d: Média = %.2f\n", (i + 1), medias[i]);
        }
        
        // Exibição das médias usando foreach
        // System.out.println("\nMédias dos alunos usando foreach:");
        // int aluno = 1; // Variável para contar o número do aluno
        // for (double media : medias) {
        //     System.out.printf("Aluno %d: Média = %.2f\n", aluno, media);
        //     aluno++;
        // }

         // Exibição das notas e médias usando foreach
         System.out.println("\nNotas e médias dos alunos:");
         int aluno = 1; // Variável para contar o número do aluno
         for (double[] notaAluno : notas) {
             System.out.print("Aluno " + aluno + ": Notas = ");
             for (double nota : notaAluno) {
                 System.out.printf("%.2f ", nota);
             }
             System.out.printf(" | Média = %.2f\n", medias[aluno - 1]);
             aluno++;
         }
 

        sc.close();
    }
}

