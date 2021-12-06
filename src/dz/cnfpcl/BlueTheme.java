package dz.cnfpcl;

public class BlueTheme implements Theme {
	
	public String themeName;
	public static final Float PI = 8.14f;
	public Theme th;
	
	public OS s ;

	@Override
	public void setTheme() {
		this.themeName = "bluetheme";
		System.out.println(th.PI);
		
	}

	@Override
	public String getTheme() {
		// TODO Auto-generated method stub
		return this.themeName;
	}

	@Override
	public Boolean installTheme() {
		if (this.themeName != "") {
			return true;
		}
		return false;
	}

}
