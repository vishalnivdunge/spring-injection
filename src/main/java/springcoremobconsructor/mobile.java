package springcoremobconsructor;

public class mobile {
	
	private String name ;
	private String type ;
	private sim s;
	public mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public mobile(String name, String type, sim s) {
		super();
		this.name = name;
		this.type = type;
		this.s = s;
	}
	@Override
	public String toString() {
		return "mobile [name=" + name + ", type=" + type + ", s=" + s + "]";
	}
	
	
}
