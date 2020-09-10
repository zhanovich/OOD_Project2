public class BarJoint {
	public static void main(String[] args) {
		BarPlace streetBar = new StreetBar();
		BarPlace elevatedBar = new ElevatedBar();
		Drink streetMartini = streetBar.orderDrink("martini");
		System.out.println("Customer ordered a " + streetMartini.getName() + "\n");
		Drink elevatedMojito = elevatedBar.orderDrink("mojito");
		System.out.println("Customer ordered a " + elevatedMojito.getName() + "\n");
		Drink streetMojito = streetBar.orderDrink("mojito");
		System.out.println("Customer ordered a " + streetMojito.getName() + "\n");
		Drink elevatedMartini = elevatedBar.orderDrink("martini");
		System.out.println("Customer ordered a " + elevatedMartini.getName() + "\n");
	}
}
