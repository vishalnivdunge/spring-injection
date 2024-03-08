package springcoremobconsructor;

public class sim {

	private String sim_Type ;
	private String Company_Name;
	private int sim_num;
	public sim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public sim(String sim_Type, String company_Name, int sim_num) {
		super();
		this.sim_Type = sim_Type;
		Company_Name = company_Name;
		this.sim_num = sim_num;
	}
	@Override
	public String toString() {
		return "sim [sim_Type=" + sim_Type + ", Company_Name=" + Company_Name + ", sim_num=" + sim_num + "]";
	}
	
	
	

}
