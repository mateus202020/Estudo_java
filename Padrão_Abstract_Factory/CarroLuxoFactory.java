package Padrão_Abstract_Factory;

public class CarroLuxoFactory extends CarroFactor {

 
    public Roda montarRoda() {
       return new RodaLigaLeve();
    }

    public Som montarSom() {
        return new CDPlayer();
    }
    
}

