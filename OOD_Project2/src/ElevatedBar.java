public class ElevatedBar extends BarPlace {
	Drink createDrink(String item) {
		if (item.equals("martini")) {
			return new ElevatedBarMartini();
		} else if (item.equals("mojito")) {
			return new ElevatedBarMojito();
		} 
		else return null;
	}
}