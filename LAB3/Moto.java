package LAB3;
public class Moto {
    public String marca;
    public String cor;
    public int cilindradas;

    public Moto(String marca,String cor,int cilindradas){
        this.marca = marca;
        this.cor = cor;
        this.cilindradas = cilindradas;
    }

    public void exibidados(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }

}
