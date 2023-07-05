package lesson31.factory;

public class MongoDb implements ILogger {

	@Override
	public void logToDatabase(String message) {
		System.out.println(message + "---> MongoDb'ye loglandı");
	}

}
