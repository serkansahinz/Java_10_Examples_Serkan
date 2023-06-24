package havayoluSinav;

import java.util.HashMap;
import java.util.Map;

public class BusinessYolcu extends Yolcu{
	
	private final int BUSINESSFIYAT=200;
	private final int BUSINESSVIPFIYAT=150;
	Map<EFirmaAdi, Integer> businessYolcuBilet= new HashMap<>();
	private boolean isVIP;
	public BusinessYolcu(int iD, String isim, String soyisim, boolean isVIP) {
		super(iD, isim, soyisim);
		this.isVIP = isVIP;
	}
	public Map<EFirmaAdi, Integer> getBusinessYolcuBilet() {
		return businessYolcuBilet;
	}
	public void setBusinessYolcuBilet(Map<EFirmaAdi, Integer> businessYolcuBilet) {
		this.businessYolcuBilet = businessYolcuBilet;
	}
	public boolean isVIP() {
		return isVIP;
	}
	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}
	public int getBUSINESSFIYAT() {
		return BUSINESSFIYAT;
	}
	public int getBUSINESSVIPFIYAT() {
		return BUSINESSVIPFIYAT;
	}
//	@Override
//	public String toString() {
//		return "BusinessYolcu [BUSINESSFIYAT=" + BUSINESSFIYAT + ", BUSINESSVIPFIYAT=" + BUSINESSVIPFIYAT
//				+ ", businessYolcuBilet=" + businessYolcuBilet + ", isVIP=" + isVIP + ", random=" + random
//				+ ", getBusinessYolcuBilet()=" + getBusinessYolcuBilet() + ", isVIP()=" + isVIP()
//				+ ", getBUSINESSFIYAT()=" + getBUSINESSFIYAT() + ", getBUSINESSVIPFIYAT()=" + getBUSINESSVIPFIYAT()
//				+ "]";
//	}
	@Override
	public void yolcuBilgileriniGetir() {
    
		System.out.println("Yolcu adi: " + getIsim()+ " biletleri: " + businessYolcuBilet);
		
	}
		
	@Override
	public void biletAl(EFirmaAdi firmaAdi) {
		int biletFiyat=0;
		if (isVIP) {
			biletFiyat=getBASEFIYAT()+getBUSINESSFIYAT()+getBUSINESSVIPFIYAT();
			businessYolcuBilet.put(firmaAdi, biletFiyat);
			System.out.println(getIsim() + " adli yolcu "  + firmaAdi +  " dan VIP bilet aldi. Bilet : " + businessYolcuBilet);
		} else {
			biletFiyat=getBASEFIYAT()+getBUSINESSFIYAT();
			businessYolcuBilet.put(firmaAdi, biletFiyat);
			System.out.println(getIsim()+ " adli yolcu "+ firmaAdi + " dan BUSINESS aldi. Bilet : "+ businessYolcuBilet);
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
