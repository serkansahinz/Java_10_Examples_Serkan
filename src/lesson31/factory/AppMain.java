package lesson31.factory;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
//		MongoDb mongoDb=new MongoDb();
//		PostgreSql postgreSql= new PostgreSql();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen kullanmak istediğiniz DataBase'i secin: MongoDB veya Postgresql");
		String dbName=scanner.nextLine().toLowerCase();
		ILogger logger=DataBaseFactory.createDataBase(dbName);
		logger.logToDatabase("Log mesajı");
		
//		do {
//			System.out.println("Lutfen kullanmak istediğiniz DataBase'i secin: MongoDB veya Postgresql");
//			whichDataBase=scanner.nextLine().toLowerCase();
//			System.out.println("Lutfen girmek istediğiniz mesajı yazın");
//			String message2=scanner.nextLine();
//			switch (whichDataBase) {
//			case "mongodb":
//				 mongoDb.logToDatabase(message2);
//				 logger=new MongoDb();
//				break;
//			case "postgresql":
//				postgreSql.logToDatabase(message2);
//				logger=new PostgreSql();
//				break;
//
//			default:
//				System.out.println("Lutfen geçerli bir seçim yapın: MongoDB veya Postgresql");
//				break;
//			}
//		} while (whichDataBase!="mongodb" || whichDataBase!="postgresql");
		
		
		
		
		

	}

}
