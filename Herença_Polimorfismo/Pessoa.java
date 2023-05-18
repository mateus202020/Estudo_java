package Herença_Polimorfismo;

public class Pessoa {
    String nome;
    int idade;
    String documento;

    Pessoa(String nome, int idade, String documento){
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }

    public void imprimirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Documento: " + this.documento);
    }
}
