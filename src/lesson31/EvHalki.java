package lesson31;

public class EvHalki extends Thread {
	
	@Override
	public void run() {
		robotCagir();
	}
	
	public void robotCagir() {
		
		
		Robot.getRobot().calis();
	}

}
