package AraDönemOdevi;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		actualMenu();

	}
	public static void initialMenu() {



        System.out.println("1. Personel İşlemleri");
        System.out.println("2. Muhasebe İşlemleri");
        System.out.println("3. Raporlamalar");
        System.out.println("0. Çıkış");
        System.out.print("Seçiminizi yapın: ");
    } public static void actualMenu() {
    	
    	int choice;
        do {
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("1. Personel İşlemleri");
            System.out.println("2. Muhasebe İşlemleri");
            System.out.println("3. Raporlamalar");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");
        	choice= Integer.parseInt(scanner.nextLine());
        	
        switch (choice) {
        
            case 1:
                System.out.println("1. Personel İşlemleri");
                System.out.println("    1. Personel Ekleme");
                System.out.println("    2. Personel Listesi");
                System.out.println("    3. Personel Düzenleme");
                System.out.println("    4. Departman Ekleme");
                System.out.println("    5. Departman Listesi");
                int subChoiceOne;
                do {
                	
                	subChoiceOne= Integer.parseInt(scanner.nextLine());
                	switch (subChoiceOne) {
					case 1:
						 System.out.println("    1. Personel Ekleme");
						break;
					case 2:
						System.out.println("    2. Personel Listesi");
						break;
					case 3:
						System.out.println("    3. Personel Düzenleme");
						break;
					case 4:
						System.out.println("    4. Departman Ekleme");
						break;
					case 5:
						System.out.println("    5. Departman Listesi");
						break;

					default:
						break;
					}                
                break;
                } while (subChoiceOne!=0);
                break;
            case 2:
                System.out.println("2. Muhasebe İşlemleri");
                System.out.println("    2.1. Maaş Personel tanımlama");
                System.out.println("    2.2. Ödeme Listesi");
                
                int subChoiceTwo;
                do {
                	subChoiceTwo= scanner.nextInt();
                	
                	switch (subChoiceTwo) {
					case 1:
						System.out.println("    1. Maaş Personel tanımlama");
						break;
					case 2:
						System.out.println("    2. Ödeme Listesi");
						break;
					

					default:
						break;
					}                
                break;
                } while (subChoiceTwo!=0);
                break;
            case 3:
                System.out.println("3. Raporlamalar");
                System.out.println("    3.1. Departman Personel Listesi");
                System.out.println("    3.2. En Çok Personel Bulunan Departman");
                System.out.println("    3.3. Departmanlara göre maaş ortalamaları");
                System.out.println("    3.4. Müdürlerin sorumlu olduğu departman listesi");
                System.out.println("    3.5. Kayıt tarihlerine göre personellerin sıralı listesi.");
                System.out.println("    3.6. Aynı gün içinde işe başlayan personellerin listesi.");
                int subChoice3;
                do {
                	subChoice3= scanner.nextInt();
                	
                	switch (subChoice3) {
					case 1:
						System.out.println("    3.1. Departman Personel Listesi");
						break;
					case 2:
						System.out.println("    3.2. En Çok Personel Bulunan Departman");
						break;
					case 3:
						System.out.println("    3.3. Departmanlara göre maaş ortalamaları");
						break;
					case 4:
						System.out.println("    3.4. Müdürlerin sorumlu olduğu departman listesi");
						break;
					case 5:
						System.out.println("    3.5. Kayıt tarihlerine göre personellerin sıralı listesi.");
						break;
					case 6:
						System.out.println("    3.6. Aynı gün içinde işe başlayan personellerin listesi.");
						break;	
					default:
						break;
					}                
                break;
                } while (subChoice3!=0);
                break;
                
            case 0:
                System.out.println("Çıkış");
               
                break;
            default:
                System.out.println("Lutfen geçerli bir seçim yapınız");
            }
        } while(choice!=0);
    }

}
