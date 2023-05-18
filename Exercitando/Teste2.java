package Exercitando;


public class Teste2 {
    public static void main(String[] args){
        Cliente2 c1 = new Cliente2("Carlos Azevedo", 2009, "133.456.777-99", "(35) 99924-1929 ");
        c1.Dados2();

        Cliente2 c2 = new Cliente2("Maria da Silva", 1998, "369.457.120-69", "(31) 9 9191-8956");
        c2.Dados2();

        Ingresso2 ing1 = new Ingresso2("Birdman", "06/03/2023", "22h00", 1, 20.6, c2);
        ing1.imprimeIngresso();

        Ingresso2 ing2 = new Ingresso2("x - A Marca da Morte", "01/02/2023", "23h10", 3, 18, c2);
        ing2.imprimeIngresso();
    } 

    
    
}
