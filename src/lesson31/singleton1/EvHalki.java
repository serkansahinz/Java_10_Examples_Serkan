package lesson31.singleton1;

public class EvHalki extends Thread {
	
	@Override
	public void run() {
		robotCagir();
	}
	
	public void robotCagir() {
		
		
		Robot.getRobot().calis();
	}

}
