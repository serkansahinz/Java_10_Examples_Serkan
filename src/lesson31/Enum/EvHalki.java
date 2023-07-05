package lesson31.Enum;

public class EvHalki extends Thread {
	
	@Override
	public void run() {
		robotCagir();
	}
	
	public void robotCagir() {
		
		
		Robot.ROBOT.calis();
	}

}
