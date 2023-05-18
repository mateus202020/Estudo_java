package classes_objetos;

public class caneta {
    public static void main(String[] args){
        ClassOb c1 = new ClassOb();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
        c1.rabiscar();


     
    }  
}
