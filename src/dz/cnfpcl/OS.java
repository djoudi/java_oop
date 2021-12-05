package dz.cnfpcl;

public class OS {
     public String name;
     public Float version;
     public Integer year;
     
     public void start() {
    	 System.out.println("Starting ..."+this.name);
     }
     
     public String stop() {
    	 String toStop = "This OS is Stoping";
    	 return toStop;
     }
     
     public Boolean restart(int restart) {
    	 if(restart == 1)  return true;
    	 else return false;
    	 
     }
}
