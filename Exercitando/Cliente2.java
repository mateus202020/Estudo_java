package Exercitando;

public class Cliente2 {
    String nome;
    int anoNasc;
    String cpf;
    String telefone;

    public Cliente2(String nome, int anoNasc, String cpf, String telefone){
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void Dados2(){
        System.out.println("\n--- DADOS DO CLIENTE ---");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNasc);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
    }
    
    
    public int getanoNasc(){
       return this.anoNasc = anoNasc;
    }
}
