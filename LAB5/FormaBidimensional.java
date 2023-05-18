package LAB5;

abstract class FormaBidimensional implements FormaGeometrica{
    protected double lado;

    FormaBidimensional(double lado){
        this.lado = lado;
        

    }

    @Override
    public abstract double calcularArea();

    @Override
    public abstract double calcularPerimetro();




}