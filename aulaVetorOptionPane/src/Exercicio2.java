import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Criando o tamnanho do vetor
        int[] numeroInsc = new int[3];
        Double[] notaProvaEscrita = new Double[3];
        Double[] notaProvaPratica = new Double[3];
        Double[] mediaNotas = new Double[3];  // Vetor para armazenar as médias

        //Gravar os dados no vetor
        for (int i=0; i<3; i++) {
            System.out.println("Digite o número da inscrição:");
            numeroInsc[i] = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Digite a nota da prova escrita:");
            notaProvaEscrita[i] = sc.nextDouble();
            sc.nextLine();

            System.out.println("Digiete a nota da prova prática:");
            notaProvaPratica[i] = sc.nextDouble();
            sc.nextLine();

            // Calculando a média das provas
            mediaNotas[i] = (notaProvaEscrita[i] + notaProvaPratica[i]) / 2;
        }
        // Exibir os dados       
        System.out.println("\nResultado dos alunos:\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("Número de inscrição: " + numeroInsc[i]);
            System.out.printf("Nota da prova escrita: %.2f\n", notaProvaEscrita[i]);
            System.out.printf("Nota da prova prática: %.2f\n", notaProvaPratica[i]);
            System.out.printf("Média das provas: %.2f\n", mediaNotas[i]);
            System.out.println();
        }

        sc.close();
    }
}
