package denemekutup;

import java.util.List;

public interface IKutuphane {

	boolean kiralamaYap() throws KutuphaneException;

	Kitap kitapAra() throws KutuphaneException;

	Musteri musteriAra() throws KutuphaneException;

	List<Kitap> kiralananKitaplar() throws KutuphaneException;

}
