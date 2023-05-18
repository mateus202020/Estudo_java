package Herança;

public class Funcionario extends PessoaPrincipal {
    private String setor;
    private boolean trabalhado;

    public void mudaTrabalho(){
        this.trabalhado = ! this.trabalhado;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhado() {
        return trabalhado;
    }

    public void setTrabalhado(boolean trabalhado) {
        this.trabalhado = trabalhado;
    }

    
}
