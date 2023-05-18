package LAB5;

public class Quadrado extends FormaBidimensional {

    public Quadrado(double lado){
        super(lado);
    }
    
    @Override
    public double calcularArea(){
        return lado * lado;
    }

    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }

    public void exibidados(){
        System.out.println(" ---QUADRADO--- ");
        System.out.println("Área do Quadrado: " + calcularArea());
        System.out.println("Perímetro do Quadrado: " + calcularPerimetro());
    }
}
