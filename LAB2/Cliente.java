package LAB2;

class Cliente {
    String nome;
    int anoNasc;
    String cpf;
    String telefone;
    Ingresso Cliente;
    

     
    public Cliente(String nome, int anoNasc, String cpf, String telefone) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.cpf = cpf;
        this.telefone = telefone;
    }


    public void ImprimeClinteDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Nascimento: " + this.anoNasc);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
    
    }
    
    public void imprimedados(){
    System.out.println("\n--- Dados do cliente ---");
    System.out.println("Nome: " + this.nome);
    System.out.println("Nascimento: " + this.anoNasc);
    System.out.println("CPF: " + this.cpf);
    System.out.println("Telefone: " + this.telefone);
    }


    public int ano(Object anoNasc2) {
        int ano = this.anoNasc;
        return ano;
    }


}


   
   

