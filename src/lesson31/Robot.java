package lesson31;



public class Robot {
	
	private static Robot instanceRobot=new Robot();
	private Robot () {
		
	}
	
	public synchronized static Robot getRobot() {
		if(instanceRobot==null) {
			instanceRobot = new Robot();
			
		}  return instanceRobot;
		
	}
	public void calis() {
		System.out.println(hashCode() + "---> numaralı robot çalışıyor");
	}

}
