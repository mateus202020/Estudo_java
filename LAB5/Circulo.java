package LAB5;

public class Circulo extends FormaBidimensional {

    public Circulo(double raio){
        super(raio);
    }

    @Override
    public double calcularArea() {
        return 3.14 * lado * lado;
    }
       
    @Override
    public double calcularPerimetro() {
       return 2 * 3.14 * lado;
    }
    
    public void exibidados(){
        System.out.println("\n ---CIRULO--- ");
        System.out.println("Área do Circulo: " + calcularArea());
        System.out.println("Perímetro do Circulo: " + calcularPerimetro());
    }
}

