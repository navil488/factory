package factory;

public abstract class Creator {
	
    public abstract Product factoryMethod();

    
    public String someOperation() {
       
        Product product = factoryMethod();
        return "Creator: El mismo código del creador acaba de trabajar con " + product.operation();
    }

}
