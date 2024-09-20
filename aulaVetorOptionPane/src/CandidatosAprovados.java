import java.util.Scanner;

public class CandidatosAprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar o tamanho do vetor (máx. 10)
        System.out.println("Qual o número de candidatos(as)? (máx. 10)");
        int t = sc.nextInt();
        
        // Verificar se o tamanho está dentro do limite
        if (t > 10) {
            System.out.println("O número de candidatos(as) não pode ser maior que 10.");
            sc.close();
            return;
        }

        String[] nomes = new String[t];
        double[] notas1 = new double[t];
        double[] notas2 = new double[t];
        double[] medias = new double[t];

        // Receber os nomes e notas
        for (int i = 0; i < t; i++) {
            sc.nextLine();  // Consumir a nova linha
            System.out.println("Digite o nome do(a) candidato(a):");
            nomes[i] = sc.nextLine();
            
            System.out.println("Digite a nota da primeira prova (0 a 10):");
            notas1[i] = sc.nextDouble();

            System.out.println("Digite a nota da segunda prova (0 a 10):");
            notas2[i] = sc.nextDouble();

            // Calcular a média de cada candidato(a)
            medias[i] = (notas1[i] + notas2[i]) / 2;
        }

        // Imprimir os aprovados (média >= 7)
        System.out.println("\nCandidatos(as) aprovados(as):");
        boolean temAprovados = false;
        for (int i = 0; i < t; i++) {
            if (medias[i] >= 7) {
                System.out.println("Nome: " + nomes[i] + " - Média: " + medias[i]);
                temAprovados = true;
            }
        }

        // Verificar se há algum aprovado
        if (!temAprovados) {
            System.out.println("Nenhum(a) candidato(a) aprovado(a).");
        }

        sc.close();
    }
}

