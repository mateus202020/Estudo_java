package Exercitando;

public class Ingresso2 {
    String nomeFilme;
    String dataFilme;
    String horario;
    int sala;
    double valor;
    double desconto;
    Cliente2 cliente;

    public  Ingresso2(String nomeFilme,String dataFilme,String horario, int sala, double valor, Cliente2 cliente){
        this.nomeFilme = nomeFilme;
        this.dataFilme = dataFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
        //this.desconto = desconto;
        this.cliente = cliente;
    }


    public double calculaDescontoIdade(int anoAtua){

        anoAtua = 2023;
        int idade = cliente.getanoNasc() - anoAtua;
        double desconto;

        
        if (idade >= 12 && idade <= 15) {
            desconto = 0.40;
        } else if (idade >= 16 && idade <= 20) {
            desconto = 0.30;
        } else{
            desconto = 0.20;
        }

       double valorDesconto = this.valor * desconto;
       double valorFinal = this.valor - valorDesconto;

       return valorFinal;

    }



    public void imprimeIngresso(){
        System.out.println("\n--- INGRESSO ---");
        System.out.println("Nome do filme: " + nomeFilme);
        System.out.println("Data do Filme: " + dataFilme);
        System.out.println("Hora do filme: " + horario);
        System.out.println("Sala: " + sala);
        System.out.println("Valor: " + "$" + valor);
        System.out.println("Valor do Desconto: " + calculaDescontoIdade(sala));
        cliente.Dados2();
    }


}
