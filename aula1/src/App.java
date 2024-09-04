import celular.Celular;

public class App {
    public static void main(String[] args) throws Exception {
        // Iphone 12, tela de 6.1, 256gb
        // Galaxy Note 20 Ultra, tela de 6.9, 256gb
        // Xiaomi Mi 11 pro, tela de 6.81, 128gb
        
        // declarando um objeto do tipo Celular = Instanciando um objeto
        Celular celularA = new Celular();        
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "ios";

        Celular celularB = new Celular();        
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "android";

        Celular celularC = new Celular();        
        celularC.nome = "Xiaomi Mi 11 pro";
        celularC.tamanhoTela = 6.81f;
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOperacional = "android";

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.2f, com %dgb e SO %s\n", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);

        // Testando os métodos ligar e desligar
        celularA.ligar();
        celularA.desligar();
        celularA.desligar();  // Tentativa de desligar já estando desligado
        
        celularB.ligar();
        celularB.ligar();  // Tentativa de ligar já estando ligado
        celularB.desligar();
    }
}