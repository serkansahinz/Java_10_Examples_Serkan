package lesson31.factory;

public class DataBaseFactory {
	
	public static ILogger createDataBase(String dbName) {
		switch (dbName) {
		case "mongodb":
			 return new MongoDb();
		
		case "postgresql":
			return new PostgreSql();
			

		default:
			throw new RuntimeException("Girdiğiniz DataBase desteklenmemektedir");
			
	}

} }
