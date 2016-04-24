public class PizzaMaker {

	public static void main(String[] args) {

		// The PlainPizza object is sent to the Mozzarella constructor
		// and then to the TomatoSauce constructor

		Pizza cheesePizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredients: " + cheesePizza.getDescription());
		System.out.println("Price: " + cheesePizza.getCost());

		Pizza simplePizza = new TomatoSauce(new PlainPizza());
		System.out.println("Ingredients: " + simplePizza.getDescription());
		System.out.println("Price: " + simplePizza.getCost());

	}

}