package dz.cnfpcl;

public class Mobile {
	
	private String model;
	private String color;
	private Long serial;
	
	public Mobile(String model,String color,long serial) {
		this.model  = model;
		this.color = color;
		this.serial = serial;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getSerial() {
		return serial;
	}

	public void setSerial(Long serial) {
		this.serial = serial;
	}

	

}
