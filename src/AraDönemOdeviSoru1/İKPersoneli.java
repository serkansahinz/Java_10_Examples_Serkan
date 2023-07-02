package AraDönemOdeviSoru1;

import java.time.LocalDate;

public class İKPersoneli extends Personel{
	
	private static int iDNu = 1;
    private String id;

    public İKPersoneli(String isim, int yas, float maas, LocalDate iseGiris) {
        super(isim, yas, maas, iseGiris);
        setDepartment(PersonelManager.getDepartmanlar().get(3));
        getDepartment().getDepartmandakiPersoneller().add(this);
        this.id = "IK-" + iDNu++;
        PersonelManager.getPersoneller().add(this);
        PersonelManager.getPersonelById().put(this.id, this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getiDNu() {
        return iDNu;
    }

    public static void setiDNu(int iDNu) {
    	İKPersoneli.iDNu = iDNu;
    }

    @Override
    public java.lang.String toString() {
        return "InsanKaynaklari{" +
                "id=" + id +
                "} " + super.toString();
    }

}
