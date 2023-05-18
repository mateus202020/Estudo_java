package LAB3;

public class Carro {
    protected String marca;
    protected String cor;
    protected int ano;

    public Carro(String marca,String cor,int ano){
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    
    public void exibidados(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Cilindradas: " + ano);
    }
}
