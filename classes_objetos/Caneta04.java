package classes_objetos;

public class Caneta04 {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public  Caneta04(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destapar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("MODELO: "+ this.getModelo());
        System.out.println("PONTA: " + this.getPonta());
        System.out.println("TAMPADA: "+ this.tampada);
        System.out.println("COR: " + this.cor);
    }
}
