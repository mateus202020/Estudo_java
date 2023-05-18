package LAB2;

class Ingresso {
    String nomeFilme;
    String dataFilme;
    String horario;
    int sala;
    double valor;
    Cliente cliente;
    Cliente anoNasc;


    public Ingresso(String nomeFilme, String dataFilme, String horario, int sala, double valor, Cliente cliente) {
        this.nomeFilme = nomeFilme;
        this.dataFilme = dataFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
        this.cliente = cliente;
    }


    public double calculaDescontoIdade(int anoAtual){
        
            anoAtual = 2023;
            int idade = cliente.ano(anoNasc) - anoAtual;
            double desconto;
        
            if (idade >= 12 && idade <= 15) {
                desconto = 0.40;
            } else if (idade >= 16 && idade <= 20) {
                desconto = 0.30;
            } else {
                desconto = 0.20;
            }
        
            double valorDesconto = this.valor * desconto ;
            double valorFinal = this.valor - valorDesconto;
            
            return valorFinal;
            
        }

    

    void imprimeIngresso(){
        System.out.println("\n --- INGRESSO --- ");
        System.out.println("Filme: "+ this.nomeFilme);
        System.out.println("Data: "+ this.dataFilme);
        System.out.println("Horario: "+ this.horario);
        System.out.println("Sala: "+ this.sala);
        System.out.println("Valor do ingresso: "+ this.valor);
        System.out.println("Valor do desconto: " + calculaDescontoIdade(sala));
        System.out.println("Dados do Cliente: ");
        cliente.ImprimeClinteDados();
    
       
    }
}


