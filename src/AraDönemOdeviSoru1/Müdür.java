package AraDönemOdeviSoru1;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Müdür extends Personel{

	 private static int iDNu = 1;
	    private String id;
	    private List<Departman> müdürünDepartmanlari;

	    public Müdür(String isim, int yas, float maas, LocalDate iseGiris) {
	        super(isim, yas, maas, iseGiris);
	        setDepartment(PersonelManager.getDepartmanlar().get(6));
	        getDepartment().getDepartmandakiPersoneller().add(this);
	        this.id = "M-" + iDNu++;
	        PersonelManager.getPersoneller().add(this);
	        PersonelManager.getPersonelById().put(this.id, this);
	        this.müdürünDepartmanlari = new ArrayList<>();
	    }

	    public static int getiDNu() {
	        return iDNu;
	    }

	    public static void setiDNu(int iDNu) {
	    	Müdür.iDNu = iDNu;
	    }

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public List<Departman> getMüdürünDepartmanlari() {
	        return müdürünDepartmanlari;
	    }

	    public void setMüdürünDepartmanlari(List<Departman> müdürünDepartmanlari) {
	        this.müdürünDepartmanlari = müdürünDepartmanlari;
	    }


	    @Override
	    public String toString() {
	        return "Müdür{" +
	                "id='" + id + '\'' +
	                ", müdürünDepartmanlari=" + müdürünDepartmanlari +
	                "} " + super.toString();
	    }
}
