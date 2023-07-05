package lesson31;

public class AppMain {

	public static void main(String[] args) {
		MyPostgreConnection myPostgreConnection1= MyPostgreConnection.getInstance();
		MyPostgreConnection myPostgreConnection2= MyPostgreConnection.getInstance();
		MyPostgreConnection myPostgreConnection3= MyPostgreConnection.getInstance();
		
		System.out.println(myPostgreConnection1);
		System.out.println(myPostgreConnection2);
		System.out.println(myPostgreConnection3);

		EvHalki anne = new EvHalki();
		EvHalki baba = new EvHalki();
		EvHalki cocuk = new EvHalki();
		
//		anne.robotCagir();
//		baba.robotCagir();
//		cocuk.robotCagir();
		
		
		anne.start();
		baba.start();
		cocuk.start();
	}

}
