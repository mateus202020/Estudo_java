package LAB3;

public class Caminhao {
    private String marca;
    private String cor;
    private int capacidade;

    public Caminhao(String marca, String cor, int capacidade){
        this.marca = marca;
        this.cor = cor;
        this.capacidade = capacidade;

    }
    
    public void exibidados(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Cilindradas: " + capacidade + " Kg");
    }
}
