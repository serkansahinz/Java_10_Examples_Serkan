package kutuphaneSinav;

import java.util.List;

public interface ISahaf {
	
	boolean kiralamaYap() throws SahafException;

	Kitap kitapAra() throws SahafException;

	Musteri musteriAra() throws SahafException;

	List<Kitap> kiralananKitaplar() throws SahafException;

}
