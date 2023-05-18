package Padrão_Abstract_Factory;

import classes_objetos.caneta;

public class TesteFactory {
    private static Carro montarCarro(String tipo){
        CarroFactor cf = null;
        switch (tipo) {
            case "luxo":
                cf = new CarroLuxoFactory();
                break;
            case "popular":
                cf = new CarroPopular();
               
            }
            Carro carro = new Carro();
            carro.setRoda(cf.montarRoda());
            carro.setSom(cf.montarSom());
            return carro;
        }

        public static void main(String[] args){
            Carro c1 = montarCarro("luxo");
            Carro c12 = montarCarro("popular");
            System.out.println("END");
        }
}
