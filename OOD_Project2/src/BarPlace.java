public abstract class BarPlace {
	public Drink orderDrink(String type) {
		Drink drink;
		drink = createDrink(type);
		drink.prepare();
		drink.mix();
		drink.decorate();
		drink.serve();
		return drink;
	}
	abstract Drink createDrink(String type);
}