import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //Criar o tamanho do vetor
        System.out.println("Quantos fornecedores cadastrar?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] fornecedor = new String[n];
        String[] cnpj = new String[n];
        String[] telefone = new String[n];
        Double[] valor = new Double[n];

        //Gravar dados do fornecedor no vetor
        for (int i=0; i<n; i++) {
            System.out.println("Digte o nome do fornecedor:");
            fornecedor[i] = sc.nextLine();

            System.out.println("Digte o cnpf do fornecedor:");
            cnpj[i] = sc.nextLine();

            System.out.println("Digte o telefone do fornecedor:");
            telefone[i] = sc.nextLine();

            System.out.println("Digte o valor do produto do fornecedor:");
            valor[i] = sc.nextDouble();
            sc.nextLine();
        }

        //Exibir as informações do fornecedores
        double total = 0;
        for (int i=0; i<n; i++) {
            System.out.printf(
                "Fornecedor: %s - CNPJ: %s - Telefone: %s - valor do produto: %.2f%n%n",
                fornecedor[i], cnpj[i], telefone[i], valor[i]);
            total += valor[i];
        }

        //Exibindo o total dos produtos        
        System.out.printf("\nSoma total dos produtos: R$ %.2f%n", total);

        sc.close();
    }
}
