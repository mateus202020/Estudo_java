package Herança;

public class Teste{
    public static void main(String[] args){
        PessoaPrincipal p1 = new PessoaPrincipal();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claúdio");
        p4.setNome("Fabiano");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        //p3.receberAumento(550.20f);
        //p2.mudaTrabalho();
        //p4.cancelarMatr();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }

}
    

    

