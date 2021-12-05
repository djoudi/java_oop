package dz.cnfpcl;

public class Linux extends OS2{

	@Override
	public void start2() {
		System.out.println("Start 2 Linux");
		
	}
	
	
	public void foo() {
		System.out.println("Hiiii");
	}

	public void foo(int c) {
		System.out.println("Not work");
	}
	
	public void foo(int c,int p) {
		System.out.println("Not work");
	}
	
	/*
	 * public Float kerenlVersion;
	 * 
	 * public void launchGet() { System.out.println("apt-get update -y");
	 * System.out.println("test"); }
	 */
}
