import java.util.Scanner;

public class ExercicioVetorMaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criar o tamanho do vetor (máximo = 10)
        System.out.println("Qual o tamanho do vetor? (máx. 10)");
        int t = sc.nextInt();
        
        // Verificar se o tamanho está dentro do limite
        if (t > 10) {
            System.out.println("O tamanho do vetor não pode ser maior que 10.");
            sc.close();
            return;
        }
        
        double[] valores = new double[t];

        // Gravar dados do vetor
        for (int i = 0; i < t; i++) {
            System.out.println("Digite um valor real:");
            valores[i] = sc.nextDouble();
        }

        // Encontrar o maior valor e sua posição
        double maiorValor = valores[0];
        int posicao = 0;

        for (int i = 1; i < t; i++) {
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
                posicao = i;
            }
        }

        // Imprimir o maior valor e sua posição
        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("Sua posição no vetor é: " + posicao);

        sc.close();
    }
}
