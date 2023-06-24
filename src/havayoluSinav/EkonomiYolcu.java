package havayoluSinav;

import java.util.HashMap;
import java.util.Map;

public class EkonomiYolcu extends Yolcu{
	private final int EKONOMIFIYAT=100;
	Map<EFirmaAdi, Integer> ekonomikYolcuBilet=new HashMap<>();
	public EkonomiYolcu(int iD, String isim, String soyisim) {
		super(iD, isim, soyisim);
	}
	public Map<EFirmaAdi, Integer> getEkonomikYolcuBilet() {
		return ekonomikYolcuBilet;
	}
	public void setEkonomikYolcuBilet(Map<EFirmaAdi, Integer> ekonomikYolcuBilet) {
		this.ekonomikYolcuBilet = ekonomikYolcuBilet;
	}
	public int getEKONOMIFIYAT() {
		return EKONOMIFIYAT;
	}
//	@Override
//	public String toString() {
//		return "EkonomiYolcu [EKONOMIFIYAT=" + EKONOMIFIYAT + ", ekonomikYolcuBilet=" + ekonomikYolcuBilet + ", random="
//				+ random + ", getEkonomikYolcuBilet()=" + getEkonomikYolcuBilet() + ", getEKONOMIFIYAT()="
//				+ getEKONOMIFIYAT() + ", getID()=" + getID() + ", getIsim()=" + getIsim() + ", getSoyisim()="
//				+ getSoyisim() + ", getKoltukNo()=" + getKoltukNo() + ", isCheckIn()=" + isCheckIn() + ", getRandom()="
//				+ getRandom() + ", getBASEFIYAT()=" + getBASEFIYAT() + ", toString()=" + super.toString() + "]";
//	}
	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu adi: " + getIsim()+ " biletleri: " + ekonomikYolcuBilet);
		
	}
	@Override
	public void biletAl(EFirmaAdi firmaAdi) {
		int biletFiyat=0;
		biletFiyat=getBASEFIYAT()+getEKONOMIFIYAT();
		if (ekonomikYolcuBilet.containsKey(firmaAdi)) {
			biletFiyat= biletFiyat + ekonomikYolcuBilet.get(firmaAdi);
			ekonomikYolcuBilet.put(firmaAdi, biletFiyat);
			
			System.out.println(firmaAdi + " adli firmadan daha once bilet alinmistir"  + ekonomikYolcuBilet);
		} else {
			ekonomikYolcuBilet.put(firmaAdi, biletFiyat);
			System.out.println(getIsim()+ " adli yolcu "+ firmaAdi + " dan EKONOMI sinif bilet aldi. Bilet : "+ ekonomikYolcuBilet);
		}
	       
	      
	}
	@Override
	public void checkInYap() {
		if (isCheckIn()) {
		System.out.println("Halihazirda check-in islemi yapilmistir");	
		} else {
			setCheckIn(true);
			System.out.println("Check-in basarili ucun bakalim");	
		}
		
	}
	@Override
	public void ucagaBin() {
		if (isCheckIn()) {
			
			System.out.println("Yolcu adi " + getIsim() + " koltuk no: " + getKoltukNo()+" ucaga buyurun");
			} else {
				System.out.println("Lutfen Check-in yaptirip, geliniz");
			}

	}
	
	
}
