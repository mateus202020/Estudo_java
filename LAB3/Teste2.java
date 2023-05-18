package LAB3;

public class Teste2 {
    public static void main (String[] args){
        Moto moto1 = new Moto("Suzuki","Azul",2000);
        moto1.marca = "Yamaha";
        moto1.exibidados();

        Carro carro1 = new Carro("Porsche Cayenne", "Preto", 2019);
        carro1.marca = "Corsa";
        carro1.exibidados();

        Caminhao  caminhao1 = new Caminhao("Volvo", "Prata", 74);
        //caminhao1.marca = "Mercedes-Benz";
        caminhao1.exibidados();

    }
}
