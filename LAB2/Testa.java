package LAB2;

public class Testa {
    public static void main (String[] args){

       Cliente c1 = new Cliente("Carlos Azevedo",2009,"133.456.777-99","+1 (555) 678-9012");
       c1.imprimedados();


       Cliente c2 = new Cliente("Maria da silva",1998,"369.457.120-69","+44 (20) 7123 4567");
       c2.imprimedados();
         
        Ingresso ing01 = new Ingresso("Os Incríveis 2", "01/03/2023", "19h", 2, 25.0, c1);
        ing01.imprimeIngresso();

        Ingresso ing02 = new Ingresso("Vingadores: Ultimato",  "01/03/2023", "21h", 3, 30.0, c2);
        ing02.imprimeIngresso();
    
        
    }
    

}

