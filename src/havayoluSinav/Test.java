package havayoluSinav;

public class Test {

	public static void main(String[] args) {
		
		Yolcu yolcu1 = new BusinessYolcu(1, "Serkan", "Sahin", false);
        Yolcu yolcu2 = new EkonomiYolcu(6, "Ahmet", "Demir");
        Yolcu yolcu3 = new BusinessYolcu(2, "Asli", "Bahar", true);
        System.out.println("*****BUSINESS VIP YOLCU******");
        yolcu3.biletAl(EFirmaAdi.ADJ);
        yolcu3.biletAl(EFirmaAdi.THY);
        System.out.println("*****");
        yolcu3.ucagaBin();
        yolcu3.ucagaBin();
        yolcu3.checkInYap();
        yolcu3.checkInYap();
        yolcu3.ucagaBin();
        yolcu3.yolcuBilgileriniGetir();
        System.out.println("***** EKONOMI YOLCUSU *****");
        yolcu2.biletAl(EFirmaAdi.ADJ);
        yolcu2.biletAl(EFirmaAdi.THY);
        yolcu2.biletAl(EFirmaAdi.THY);
        yolcu2.biletAl(EFirmaAdi.THY);
        System.out.println("*****");
        yolcu2.ucagaBin();
        yolcu2.ucagaBin();
        yolcu2.checkInYap();
        yolcu2.checkInYap();
        yolcu2.ucagaBin();
        yolcu2.yolcuBilgileriniGetir();
        System.out.println("** BUSINESS YOLCU**");
        yolcu1.biletAl(EFirmaAdi.ADJ);
        yolcu1.biletAl(EFirmaAdi.THY);
        System.out.println("*****");
        yolcu1.ucagaBin();
        yolcu1.ucagaBin();
        yolcu1.checkInYap();
        yolcu1.checkInYap();
        yolcu1.ucagaBin();
        yolcu1.yolcuBilgileriniGetir();

	}

}
