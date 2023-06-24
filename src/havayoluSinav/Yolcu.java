package havayoluSinav;

import java.util.Random;

public abstract class Yolcu {
	private int ID;
	private String isim;
	private String Soyisim;
	private int koltukNo;
	private boolean checkIn;
	private final int BASEFIYAT=100;
	
	//Metotlar
	public abstract void yolcuBilgileriniGetir();
	public abstract void biletAl(EFirmaAdi firmaAdi);
	public abstract void checkInYap();
	public abstract void ucagaBin();
	
	Random random = new Random();
	public Yolcu(int iD, String isim, String soyisim) {
		super();
		ID = iD;
		this.isim = isim;
		Soyisim = soyisim;
		this.koltukNo = random.nextInt(1,200);//aynı verirse
		this.checkIn = false;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return Soyisim;
	}
	public void setSoyisim(String soyisim) {
		Soyisim = soyisim;
	}
	public int getKoltukNo() {
		return koltukNo;
	}
	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}
	public boolean isCheckIn() {
		return checkIn;
	}
	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}
	public Random getRandom() {
		return random;
	}
	public void setRandom(Random random) {
		this.random = random;
	}
	public int getBASEFIYAT() {
		return BASEFIYAT;
	}
	@Override
	public String toString() {
		return "Yolcu [ID=" + ID + ", isim=" + isim + ", Soyisim=" + Soyisim + ", koltukNo=" + koltukNo + ", checkIn="
				+ checkIn + ", BASEFIYAT=" + BASEFIYAT + ", random=" + random + "]";
	}
	
	
	
	

}
