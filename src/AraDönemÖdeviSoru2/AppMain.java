package AraDönemÖdeviSoru2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.naming.LimitExceededException;

public class AppMain {

	public static void main(String[] args) {
		List <Personel> personelListesi=new ArrayList<>();
		
		personelListesi.add(new Personel("Ahmet", 30));
		personelListesi.add(new Personel("Ayşe", 25));
		personelListesi.add(new Personel("Mehmet", 35));
		personelListesi.add(new Personel("Fatma", 28));
		personelListesi.add(new Personel("Ali", 32));
		personelListesi.add(new Personel("Zeynep", 29));
		personelListesi.add(new Personel("Mustafa", 40));
		personelListesi.add(new Personel("Esra", 27));
		personelListesi.add(new Personel("Ömer", 33));
		personelListesi.add(new Personel("Gül", 26));
		personelListesi.add(new Personel("Hakan", 31));
		personelListesi.add(new Personel("Elif", 24));
		personelListesi.add(new Personel("Serkan", 38));
		personelListesi.add(new Personel("Deniz", 23));
		personelListesi.add(new Personel("Sevgi", 30));
		personelListesi.add(new Personel("Murat", 37));
		personelListesi.add(new Personel("Selin", 22));
		personelListesi.add(new Personel("Cem", 29));
		personelListesi.add(new Personel("Pınar", 36));
		personelListesi.add(new Personel("Emre", 27));
		
		//Örnek çözüm
		List <String> isimler = personelListesi.stream().map(Personel::getAdı).sorted().collect(Collectors.toList());
		System.out.println(isimler);

		//2.1. yaşı 30'dan büyük olanlar
		List <Integer> yaşı30danBüyükPersoneller = personelListesi.stream().map(Personel::getYaşı).sorted().filter(x-> x>30).collect(Collectors.toList());
		System.out.println("Yaşı 30'dan Büyük Personel sayisi: "+yaşı30danBüyükPersoneller.size());
	
		//2.2 isimleri A harfi ile başlayan personel sayisi
		List<String> adiA_İleBaslayanPersonelSayisi=
		personelListesi.stream().map(x -> x.getAdı()).filter(x->x.startsWith("A")).collect(Collectors.toList());
		System.out.println(adiA_İleBaslayanPersonelSayisi);
		
		//2.3 Yaşı en büyük olan personelin adı
		System.out.println("en yaşlı personel: " + enBüyükYaş(personelListesi));
		
		//2.4 İsmi "Ali" olan personelin yaşı
		int alininYasi = personelListesi.stream()
                .filter(x -> x.getAdı().equals("Ali"))
                .mapToInt(Personel::getYaşı)
                .findFirst()
                .orElse(0);
            
		System.out.println("İsmi Ali olan personelin yaşı: "+alininYasi);
		
		//2.5 Yaşı en küçük olan 3 personelin isimleri
		List<String> enKucukUcPersonel=personelListesi.stream().
				sorted(Comparator.comparingInt(Personel::getYaşı)).
				limit(3).map(Personel::getAdı).
				collect(Collectors.toList());
		System.out.println("Yaşı en küçük olan 3 personelin isimleri: "+ enKucukUcPersonel);
		
		//2.6 Yaşı 25 ile 35 arasında olan personellerin sayısı
		int yaşAralığı25_35=personelListesi.stream().
				filter(x->x.getYaşı()>25 && x.getYaşı()<35).
				collect(Collectors.toList()).size();
		System.out.println("Yaşı 25 ile 35 arasında olan personellerin sayısı: "+ yaşAralığı25_35);
		
		//2.7. İsimleri 4 harften uzun olan personellerin isimleri
		List <String> adı4HarftenUzunlar= personelListesi.stream().
				filter(x-> x.getAdı().length()>4).map(a->a.getAdı()).collect(Collectors.toList());
		System.out.println(adı4HarftenUzunlar);
		
		//2.8. Yaşı en büyük 2 personelin isimleri
		List <String> yasiEnBüyükİlk2=personelListesi.stream().
				sorted(Comparator.comparingInt(Personel::getYaşı).reversed()).limit(2)
				.map(Personel::getAdı)
				.collect(Collectors.toList());
		System.out.println(yasiEnBüyükİlk2);
		
		//2.9. İsimleri "a" harfi ile biten personellerin isimleri, büyük harf dönüşümü yapılarak yazdırınız.
		List <String> aİleBitenİsimler=personelListesi.stream().filter(x->x.getAdı().endsWith("a")).map(y->y.getAdı().toUpperCase()).collect(Collectors.toList());
		System.out.println("İsimleri a harfi ile biten personellerin isimleri: "+aİleBitenİsimler);
		//2.10. İsimlerin uzunluğunun ortalaması kaçtır?
		double isimUzunlukOrtalaması=personelListesi.stream().
				mapToDouble(x->x.getAdı().length()).average().orElse(0.0);
		
		System.out.println("İsimlerin uzunluğunun ortalaması: "+isimUzunlukOrtalaması);
		//2.11. İsmi en uzun olan personelin yaşı kaçtır?
		int enUzunIsım = personelListesi.stream().mapToInt(a -> a.getAdı().length()).max().orElse(0);
		int ismiEnUzununYaşı=personelListesi.stream().filter(x->x.getAdı().length()==enUzunIsım).mapToInt(z->z.getYaşı()).findFirst().orElse(0);
		
		System.out.println("İsmi en uzun olan personelin yaşı: "+ismiEnUzununYaşı);
		//2.12. İsimlerin herhangi biri "ahmet" mi? (boolean dönüş yapmalı)
		boolean ahmetMi=personelListesi.stream().anyMatch(x->x.getAdı().equalsIgnoreCase("ahmet"));
		System.out.println("İsimlerin herhangi biri ahmet mi? "+ahmetMi);
		//2.13. İsimleri ters çevirilmiş olarak alfabetik olarak sıralanmış bir liste oluşturun.
		List <String> isimlerTersSıralıListe=personelListesi.stream().
				map(x->new StringBuilder(x.getAdı()).reverse().toString()).sorted().collect(Collectors.toList());
		System.out.println("İsimleri ters çevirilmiş olarak alfabetik olarak sıralanmış liste: " + isimlerTersSıralıListe);
		//2.14. İsimlerinde "e" harfi geçen personellerin isimlerini bir listeye ekleyin.
//		List <String> eİçerenİsimler= personelListesi.stream().
//				filter(x-> x.getAdı().contains("e") || x.getAdı().contains("E")).
//				map(y -> y.getAd()).
//				collect(Collectors.toList());
		List<String> eHarfiOlanlar = personelListesi.stream().filter(x->x.getAdı().contains("e") || x.getAdı().contains("E")).
				map(y->y.getAdı()).
				collect(Collectors.toList());
		System.out.println("e harfi içeren personel isimleri: " + eHarfiOlanlar);
		//2.15. Yaşı en küçük olan personelin adı ve yaşını bir Map olarak döndürün.
		Map<String, Integer> enGenç = personelListesi.stream().min(Comparator.comparing(Personel::getYaşı)).
				map(x-> Map.of(x.getAdı(), x.getYaşı())).orElse(Map.of());

        System.out.println("Yaşı en küçük olan personelin adı ve yaşı, map formatında: " + enGenç);
		
		
		
	} public static  Personel enBüyükYaş(List <Personel> personelListesi) {
	   Integer max = Integer.MIN_VALUE;
	   Personel enYaşlıPersonel= new Personel();
	 
	   
	    for (Personel personel : personelListesi)
	    	
	    {
	        
	        if (max < personel.getYaşı()) {
	            max = personel.getYaşı();
	            enYaşlıPersonel=personel;
	        }
	    }
	 
	    return enYaşlıPersonel;
	}
//	 public static void aliYas(List <Personel> personelListesi) {
//		Personel personel=new Personel();
//		List <Personel> aliList = personelListesi.stream().map(x->x.getAdı()).filter(x->x.equalsIgnoreCase("Ali")).collect.(Collectors.toList());
//		if (personel.getAdı().equals("Ali")) {
//			System.out.println("Ali adli personelin yaşı: " + aliList.getYaşı());
//		}
//	}

}
