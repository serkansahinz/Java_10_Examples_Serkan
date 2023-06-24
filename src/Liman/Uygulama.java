package Liman;

import java.time.LocalDate;
import java.util.Optional;

public class Uygulama {
	
	
	public Optional<Yuk> yukOlustur(){
		try {
			String isim = Utility.stringDegerAlma("Lutfen bir yuk ismi giriniz");
			double agirlik=agirlikBelirle();
			LocalDate date=tarihBelirle();
			yuk=new Yuk(isim, agirlik, date);
			
		} catch (LimanException e) {
			e.printStackTrace();
			return Optional.empty();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Beklenmedik bir hata olustu: " + e.toString());
		}
		
		return Optional.ofNullable(yuk);
	} 
	public void yukKabulu() {
		int index=-1;
		try {
			index=yukYeriSec2();
			Optional<Yuk> yuk = yukOlustur();
			
		} catch (LimanException e) {
			e.printStackTrace();
		} finally {
			if(yuk.isEmpty()) {
				System.out.println("Yukunuz kabul olmamistir");
			} else {
				System.out.println("Yukunuz kabul olmustur " + index+ " nolu yere yerleşmistir");
				liman.getYukler()[index] = yuk.get();
			}
		}
		
	} 
	public void yukYeriSec(Yuk yuk) {
		
	}

}
