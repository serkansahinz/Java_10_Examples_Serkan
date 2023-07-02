package kutuphaneSinav;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Sahaf implements ISahaf{
	
	private final  List<Kitap> kitaplar = new ArrayList<>();
	private static List<Musteri> musteriler = new ArrayList<>();
	private        List<Kasiyer> kasiyerler = new ArrayList<>();
	private        List<Kiralama> kiralamalar = new ArrayList<>();
	
	
	public static <A> void spesyelListe(List<A> list, A nesne) {
		list.add(nesne);
	}
	public void musteriOlustur() {
		Musteri musteri1 = new Musteri("Mimar Aslan", 1);
		Musteri musteri2 = new Musteri("Mustafa Ozturk", 2);
		Musteri musteri3 = new Musteri("Ünal Berk", 3);
		Musteri musteri4 = new Musteri("Gani Berk", 4);
		Musteri musteri5 = new Musteri("Mehmet Oksuz", 5);
		Musteri musteri6 = new Musteri("Caner Oksuz", 6);
		Musteri musteri7 = new Musteri("Amine Goynuk", 7);
		Musteri musteri8 = new Musteri("Osman Bas", 8);
		Musteri musteri9 = new Musteri("Onur Bas", 9);
		Musteri musteri10 = new Musteri("Ahmet Akkoyun", 10);
		
		spesyelListe(musteriler, musteri1);
		spesyelListe(musteriler, musteri2);
		spesyelListe(musteriler, musteri3);
		spesyelListe(musteriler, musteri4);
		spesyelListe(musteriler, musteri5);
		spesyelListe(musteriler, musteri6);
		spesyelListe(musteriler, musteri7);
		spesyelListe(musteriler, musteri8);
		spesyelListe(musteriler, musteri9);
		spesyelListe(musteriler, musteri10);
		
	}
	
	public void KasiyerOlustur() {
		
		Kasiyer kasiyer1 = new Kasiyer("Ozge Zorlu", 1, 50000.0f);
		Kasiyer kasiyer2 = new Kasiyer("Lutfiye Zorlu", 2, 45000.0f);
		Kasiyer kasiyer3 = new Kasiyer("Mehmet Zorlu", 3, 85000.0f);
		Kasiyer kasiyer4 = new Kasiyer("Gamze Zorlu", 4, 65000.0f);
		Kasiyer kasiyer5 = new Kasiyer("Serkan Zorlu", 5, 15000.0f);
		spesyelListe(kasiyerler, kasiyer1);
		spesyelListe(kasiyerler, kasiyer2);
		spesyelListe(kasiyerler, kasiyer3);
		spesyelListe(kasiyerler, kasiyer4);
		spesyelListe(kasiyerler, kasiyer5);
	} public void kitapKoy() {
		Kitap kitap1=new Kitap(1, "Carrie", EStatus.RAFTA);
		Kitap kitap2=new Kitap(2, "‘Salem’s Lot", EStatus.RAFTA);
		Kitap kitap3=new Kitap(3, "The Shining", EStatus.RAFTA);
		Kitap kitap4=new Kitap(4, "Rage", EStatus.RAFTA);
		Kitap kitap5=new Kitap(5, "The Stand", EStatus.RAFTA);
		Kitap kitap6=new Kitap(6, "Nightshift", EStatus.RAFTA);
		Kitap kitap7=new Kitap(7, "The Long Walk", EStatus.RAFTA);
		Kitap kitap8=new Kitap(8, "The Dead Zone", EStatus.RAFTA);
		Kitap kitap9=new Kitap(9, "Firestarter", EStatus.RAFTA);
		spesyelListe(kitaplar, kitap1);
		spesyelListe(kitaplar, kitap2);
		spesyelListe(kitaplar, kitap3);
		spesyelListe(kitaplar, kitap4);
		spesyelListe(kitaplar, kitap5);
		spesyelListe(kitaplar, kitap6);
		spesyelListe(kitaplar, kitap7);
		spesyelListe(kitaplar, kitap8);
		spesyelListe(kitaplar, kitap9);
		spesyelListe(kitaplar, new Kitap(10, "Roadwork", EStatus.RAFTA));
		
	} public void kirayaVer() {
		Kiralama kiralama1 = new Kiralama(1, kasiyerler.get(0), musteriler.get(0), kitaplar.get(0), LocalDate.of(2023, 9, 7));
		kitaplar.get(0).setDurum(EStatus.KIRALIK);
		Kiralama kiralama2 = new Kiralama(2, kasiyerler.get(1), musteriler.get(2), kitaplar.get(1), LocalDate.of(2023, 6, 8));
		kitaplar.get(1).setDurum(EStatus.KIRALIK);
		Kiralama kiralama3 = new Kiralama(3, kasiyerler.get(0), musteriler.get(4), kitaplar.get(7), LocalDate.of(2023, 6, 9));
		kitaplar.get(7).setDurum(EStatus.KIRALIK);
		Kiralama kiralama4 = new Kiralama(4, kasiyerler.get(3), musteriler.get(6), kitaplar.get(6), LocalDate.of(2023, 6, 10));
		kitaplar.get(6).setDurum(EStatus.KIRALIK);
		Kiralama kiralama5 = new Kiralama(5, kasiyerler.get(4), musteriler.get(8), kitaplar.get(5), LocalDate.of(2023, 6, 11));
		kitaplar.get(5).setDurum(EStatus.KIRALIK);
		Kiralama kiralama6 = new Kiralama(6, kasiyerler.get(4), musteriler.get(9), kitaplar.get(9), LocalDate.of(2023, 6, 12));
		kitaplar.get(5).setDurum(EStatus.KIRALIK);
		spesyelListe(kiralamalar, kiralama1);
		spesyelListe(kiralamalar, kiralama2);
		spesyelListe(kiralamalar, kiralama3);
		spesyelListe(kiralamalar, kiralama4);
		spesyelListe(kiralamalar, kiralama5);
		spesyelListe(kiralamalar, kiralama6);
	}
	
	@Override
	public boolean kiralamaYap() throws SahafException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen musteri id girin");
		int musteriID= Integer.parseInt(scanner.nextLine());
		Musteri musteri=musteriler.get(musteriID-1);
		
		System.out.println("Lutfen kasiyer id girin");
		int kasiyerID=Integer.parseInt(scanner.nextLine());
		Kasiyer kasiyer = kasiyerler.get(kasiyerID-1);
		
		System.out.println("Kiralik olmayan kitap listesi");
		kitaplar.stream().filter(x -> x.getDurum().equals(EStatus.RAFTA)).forEach(a -> {
			System.out.println(a.getId()+"-"+a.getIsim());
		});
		System.out.println("Lutfen bir secim yapin");
		int kitapId=Integer.parseInt(scanner.nextLine());
		Kitap kitap=kitaplar.get(kitapId-1);
		if (kitap.getDurum().equals(EStatus.KIRALIK)) {
			throw new SahafException("Kitap halihazırda kiralik");	
		} else {
			Kiralama kiralama=new Kiralama(kiralamalar.size()+1, kasiyer, musteri, kitap, LocalDate.of(2023, 8, 9));
			kiralamalar.add(kiralama);
			return true;
		}
	}
	@Override
	public Kitap kitapAra() throws SahafException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen kitap adi girin");
		String isim=scanner.nextLine();
		Optional<Kitap> kitap=kitaplar.stream().filter(x->x.getIsim().equalsIgnoreCase(isim)).findFirst();
		
		if (kitap.isEmpty()) {
			throw new SahafException("aranan kitap yok");	
		} else {
			return kitap.get();
		}		
	}
	@Override
	public Musteri musteriAra() throws SahafException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen musteri adi girin");
		String isim=scanner.nextLine();
		Optional <Musteri> musteri=musteriler.stream().filter(z->z.getIsimVeSoyisim().equalsIgnoreCase(isim)).findFirst();
		if (musteri.isEmpty()) {
			throw new SahafException("Musteri yok");
		} 
		return musteri.get();
	}
	@Override
	public List<Kitap> kiralananKitaplar() throws SahafException {
		List<Kitap> kiralananKitaps=kitaplar.stream().filter(x->x.getDurum().equals(EStatus.KIRALIK)).collect(Collectors.toList());
		if(kiralananKitaps.isEmpty()) {
			throw new SahafException("Kirada kitap yok");
		} 
			return kiralananKitaps;
	} public Musteri IDyeGöreSonKiralayan(int KitapID) throws SahafException {
		List<Kiralama> kiralama = kiralamalar.stream().filter(x->x.getKitap().getId()==KitapID).collect(Collectors.toList());
		Musteri musteri = null;
		try {
			musteri=kiralama.get(kiralama.size()-1).getMusteri();
		} catch (Exception e) {
			throw new SahafException("Kitabın kira kaydı yok");
		}
		return musteri;
	} public List<Musteri> kitapAdinaGoreKiralayanlar(String kitapAd){
		List<Musteri> musteriList = 
				kiralamalar.
				stream().
				filter(x-> x.getKitap().getIsim().equalsIgnoreCase(kitapAd)).
				map(x->x.getMusteri()).
				collect(Collectors.toList());
		return musteriList;
	} public List<Musteri> ahmLiMusteriler(){
		List<Musteri> ahMusteris= musteriler.stream().filter(x->x.getIsimVeSoyisim().startsWith("Ahm")).collect(Collectors.toList());
		return ahMusteris; 
	} public List<Kitap> musteriIDUzerindenKitaplar(int musteriID){
		List<Kitap> musteriidyeGöreKitapList= kiralamalar.stream().filter(x->x.getMusteri().getId()==musteriID).map(x->x.getKitap()).collect(Collectors.toList());
		return musteriidyeGöreKitapList;
	}
	public static void main(String[] args) {
		Sahaf sahaf=new Sahaf();
		sahaf.musteriOlustur();
		sahaf.KasiyerOlustur();
		sahaf.kitapKoy();
		sahaf.kirayaVer();
		try {			
			System.out.println(sahaf.IDyeGöreSonKiralayan(11));
		} catch (SahafException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			System.out.println("Ahm ile baslayan musteriler");
			sahaf.ahmLiMusteriler().forEach(System.out::println);
			System.out.println("kitap adina gore kiralayanlar");
			sahaf.kitapAdinaGoreKiralayanlar("Carrie").forEach(System.out::println);
			System.out.println("id'li musterinin kiraladigi kitaplar");
			sahaf.musteriIDUzerindenKitaplar(1).forEach(System.out::println);
		}
}