package Okul;

public class Memur extends Calisan{
	

	public Memur(String id, String isim) {
		super(id, isim);
		// TODO Auto-generated constructor stub
	}
	
	public void dersAta(Ogrenci ogrenci, EDersler ders) {
		// Ders sınıfına hashcode ve equals metotları eklenerek sağlanabildi***
		
			if (!ogrenci.getOgrenciDersler().contains(ders)) {
				ogrenci.getOgrenciDersler().add(ders);
				System.out.println(ogrenci.getIsim()+" "+ogrenci.getId() + "  öğrenciye " + ders + " dersi atandı.\nOgrenci Dersler=> "
						+ ogrenci.getOgrenciDersler());
			} else {
				System.out.println("ogreci dersi alıyor");
			}
		 
		
	}

}
