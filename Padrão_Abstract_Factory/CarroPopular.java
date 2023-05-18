package Padrão_Abstract_Factory;

public class CarroPopular extends  CarroFactor{

    
    public Roda montarRoda() {
        
        return new RodaSimples();
    }

 
    public Som montarSom() {
      
        return new TocaFitas();
    }
    
}
