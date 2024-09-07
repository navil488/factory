package factory;

public class Main {
	 public static void main(String[] args) {
	        System.out.println("App: Ejecutado con ConcreteCreatorA.");
	        clientCode(new ConcreteCreatorA());

	        System.out.println("\nApp: Ejecutado con ConcreteCreatorB.");
	        clientCode(new ConcreteCreatorB());
	    }

	    public static void clientCode(Creator creator) {
	      
	        System.out.println("Cliente: No sé exactamente qué creador tengo, pero todavía funciona.\n"
	                + creator.someOperation());

	}

}
