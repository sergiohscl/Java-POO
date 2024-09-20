import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        // Cadastro de Usuario
        String nomeCompleto = JOptionPane.showInputDialog("Dgite o nome completo:");
        String endereco = JOptionPane.showInputDialog("Dgite o endereço:");
        int numeroVoo = Integer.parseInt(JOptionPane.showInputDialog("Digite o n° do voo:"));
        String cidadeDestino = JOptionPane.showInputDialog("Digite a cidade de destino:");
        
        // Mostar em popup
        JOptionPane.showMessageDialog(null,
            "Nome Completo: " + nomeCompleto + "\n" +
            "Endereço: " + endereco + "\n" +
            "N° do voo: " + numeroVoo + "\n" +
            "Cidade de Destino: " + cidadeDestino
        );

    }
}
