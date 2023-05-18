package classes_objetos;


public class ClassOb {
    public String modelo;
    public String cor;      //atributos
    private float ponta;
    protected int carga;
    protected boolean tampada;


public void status(){
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Uma caneta " + this.cor);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Carga: " + this.carga);
    System.out.println("Esta tampa? " + this.tampada);
    
}
public void rabiscar(){
    if (this.tampada == true){
        System.out.println("Erro! não posso rabiscar");
    }else{
        System.out.println("Estou Rabiscando");
    }
}

protected void tampar(){       // metodos
    this.tampada = true;
}

protected void destampar(){
    this.tampada = false;
}

}