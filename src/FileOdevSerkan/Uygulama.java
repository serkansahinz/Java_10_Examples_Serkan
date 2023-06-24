package FileOdevSerkan;

public class Uygulama {

	public static void main(String[] args) {
		FileDersCozum ogrenciFileIslemler=new FileDersCozum();
		ogrenciFileIslemler.dosyadanVeriOkuma(FileSabitler.OGRENCI_LIST_FILE);

	}

}
