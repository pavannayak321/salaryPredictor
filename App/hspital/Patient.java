package hospitalrecord;

public class Patient {
	private String name;
	private int daysAdmitted;
	private String[] illness;
	private float amount;
	private String[] doctorsTreated;

	public Patient(String name,int daysAdmitted,String[] illness,float amount,String[] doctorTreated) 
	{
		this.name = name;
		this.daysAdmitted = daysAdmitted;
		this.illness = illness;
		this.amount = amount;
		this.doctorsTreated = doctorTreated;	
	}
	
	
	//Setter name
	public void setName(String name) {
		this.name = name;
	}
	
	//no of days admitted setter method
	public void setdaysAdmitted(int daysAdmitted) {
		this.daysAdmitted = daysAdmitted;
	}
	
	//illness setter method
	public void setIllness(String[] illness) {
		this.illness = illness;
	}
	
	//total amount setter
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	//no of doctors treated
	public void setDoctorsTreated(String[] doctorsTreated) {
		this.doctorsTreated = doctorsTreated;
	}
	
	/* <<<<<<------------------------------------------------------>>>>>>> */
	
	//Getters Methods
	public String getName() {
		return this.name;
	}
	
	//GEtter for the 
	public float getDaysAdmitted() {
		return this.daysAdmitted;
	}
	
	//Getter method for list of illness
	public String[] illnessTreated() {
		return this.illness;
	}
	
	//Getter Method for the Bill Amount
	public float getAmount() {
		return this.amount;
	}
	
	public String[] getDoctorsTreated() {
		return this.doctorsTreated;
	}
}
