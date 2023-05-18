package Exercitando;
public class Começo {
    String modelo;
    public String cor;
    public String marca;
    private int tamanho;

    public Começo(String modelo, String cor, String marca, int tamanho){
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public String getCor(){
        return this.cor;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor do Sapato: " + this.getCor());
        System.out.println("Marca: " + this.marca);
        System.out.println("Tamanho: " + this.getTamanho());
        
    }

    public static void modelo(String string) {
    }
}
