package Herença_Polimorfismo;

public class Principal {
    public static void main(String[] args) {
        System.out.println(" ---Informações do paciente--- ");
        Pessoa pac = new Paciente("1234","Sulamerica","Jose",25,"1234567");
        pac.imprimirInfo();

        System.out.println(" ---Informações do Enfermeiro--- ");
        Pessoa ef = new Enfermeiro(12, "UTI", "1234567", "Fernanda", 35, "2345566");
        ef.imprimirInfo();
    }   
}
