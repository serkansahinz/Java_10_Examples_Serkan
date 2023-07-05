package lesson31.singleton;

public class EvHalki extends Thread {
	
	@Override
	public void run() {
		robotCagir();
	}
	
	public void robotCagir() {
		
		
		Robot.getRobot().calis();
	}

}
