public class StreetBar extends BarPlace {
	Drink createDrink(String item) {
		if (item.equals("martini")) {
			return new StreetBarMartini();
		} else if (item.equals("mojito")) {
			return new StreetBarMojito();
		}  
		else return null;
	}
}