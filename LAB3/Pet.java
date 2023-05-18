package LAB3;

public class Pet {
    String raça;
    int idade;
    double peso;

    public Pet(String raça){
        this.raça = raça;
    }

    public Pet(int idade){
        this.idade = idade;
    }

    public Pet(Double peso){
        this.peso = peso;
    }

    public Pet(String raça, int idade, double peso){
        this.raça = raça;
        this.idade = idade;
        this.peso = peso;
    }

    public void exibidados(){
        System.out.println("\nRaça: " + raça);
        System.out.println("Idade: " + idade + " ano");
        System.out.println("Peso: " + peso + " Kg");
    }

    public void setidade(int idade){
        this.idade = idade;
    }

}



