package pmHome.homeWorks.pmHomeWork1;

public class CruizList extends CruizListExt{
	String name = "";//имя
	String type = "";//тип
	double price = 0;//цена
	double result = 0;

	public void setName (int i) {
		name = "" + i;
	}
	public String getName() {
		return "Name " + name;
	}

	public void setType(int i) {
		type = "" + i;
	}
	public String getType() {
		return "Type " + type;
	}

	public void setPrice(double i) {
		price = i;
	}
	public double getPrice() {
		return price;
	}

	public double getResult() {
		return result = price / capacity + 1;
	}

}
