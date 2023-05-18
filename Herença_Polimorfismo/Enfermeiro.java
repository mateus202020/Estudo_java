package Herença_Polimorfismo;

public class Enfermeiro extends Pessoa{
    int horaTrabalho;
    String setor;
    String numerCadastro;

    Enfermeiro(int horaTrabalho, String setor, String numerCadastro,String nome, int idade, String documento){
        super(nome,idade,documento);
        this.horaTrabalho = horaTrabalho;
        this.setor = setor;
        this.numerCadastro = numerCadastro;
    }

    public void imprimirInfo(){

        super.imprimirInfo();
        System.out.println("Hora de Trabalho: " + this.horaTrabalho);
        System.out.println("Setor: " + this.setor);
        System.out.println("Numero de Cadastro: " + this.numerCadastro);
    }
}


