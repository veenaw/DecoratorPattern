public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {

		return "Thin dough";
	}

	@Override
	public double getCost() {
		System.out.println("cost of Dough = " + "4.00");
		return 4.00;
	}

}