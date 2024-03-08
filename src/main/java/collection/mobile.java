package collection;

import java.util.List;
import java.util.Map;
//import java.util.Set;

public class mobile {
	
	
	@Override
	public String toString() {
		return "mobile [name=" + name + ", phones=" + phones + ", course=" + course + "]";
	}
	public mobile(String name, List<String> phones, Map<String, String> course) {
		super();
		this.name = name;
		this.phones = phones;
		this.course = course;
	}
	public mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	private String name ;
	private List<String> phones ;
	//private Set<String> address ;
	private Map<String, String> course ;

}
