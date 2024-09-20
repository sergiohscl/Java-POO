import javax.swing.JOptionPane;

public class Cadastro2 {
    public static void main(String[] args) {
        try {
            // Solicitar informações ao usuário
            String nomeCompleto = JOptionPane.showInputDialog("Digite o nome completo:");
            String telefone = JOptionPane.showInputDialog("Digite o telefone:");
            String nomeConcurso = JOptionPane.showInputDialog("Digite o nome do concurso:");

            // Solicitar e validar as notas
            double provaEscrita = getDoubleInput("Digite o valor da prova escrita (0 a 60 pts):", 0, 60);
            double provaPratica1 = getDoubleInput("Digite o valor da primeira prova prática (0 a 40 pts):", 0, 40);
            double provaPratica2 = getDoubleInput("Digite o valor da segunda prova prática (0 a 40 pts):", 0, 40);

            // Calcular a média das provas práticas
            double mediaPratica = (provaPratica1 + provaPratica2) / 2;

            // Calcular o total
            double total = provaEscrita + mediaPratica;

            // Determinar se o candidato está classificado ou desclassificado
            String status = total > 75 ? "classificado(a)" : "desclassificado(a)";

            // Imprimir os resultados
            JOptionPane.showMessageDialog(null,
                "Nome Completo: " + nomeCompleto + "\n" +
                "Telefone: " + telefone + "\n" +
                "Nome do Concurso: " + nomeConcurso + "\n" +
                "Prova Escrita: " + provaEscrita + "\n" +
                "Primeira Prova Prática: " + provaPratica1 + "\n" +
                "Segunda Prova Prática: " + provaPratica2 + "\n" +
                "Média das Provas Práticas: " + mediaPratica + "\n" +
                "Total: " + total + "\n" +
                "Status: " + status
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para obter e validar a entrada de um número dentro de um intervalo
    private static double getDoubleInput(String message, double min, double max) {
        double value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                String input = JOptionPane.showInputDialog(message);
                value = Double.parseDouble(input);

                if (value < min || value > max) {
                    JOptionPane.showMessageDialog(null, "O valor deve estar entre " + min + " e " + max + ".", "Entrada Inválida", JOptionPane.WARNING_MESSAGE);
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        return value;
    }
}
