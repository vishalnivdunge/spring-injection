package collectionconstructor;

import java.util.List;
import java.util.Map;

public class car {
	
	private String name ;
	private List<String> types ;
	private Map<String, String> Description ;
	private double price ;
	@Override
	public String toString() {
		return "car [name=" + name + ", types=" + types + ", Description=" + Description + ", price=" + price + "]";
	}
	public car(String name, List<String> types, Map<String, String> description, double price) {
		super();
		this.name = name;
		this.types = types;
		Description = description;
		this.price = price;
	}
	public car() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
