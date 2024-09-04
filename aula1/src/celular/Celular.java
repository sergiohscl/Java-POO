package celular;

public class Celular {
    public String nome;
    public String sistemaOperacional;
    public int espacoArmazenamento;
    public float tamanhoTela;
    boolean ligado;

    // Metodo para ligar o celuar
    public void ligar(){
        if (!ligado) {
            ligado = true;
            System.out.println(nome + " está ligado.");
        } else {
            System.out.println(nome + " já está ligado.");
        }
    }
    
    // Método para desligar o celular
     public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(nome + " está desligado.");
        } else {
            System.out.println(nome + " já está desligado.");
        }
    }
}
