package AraDönemOdeviSoru1;

import java.time.LocalDate;

public class MuhasebePersoneli extends Personel{
	private static int iDNu = 1;
    private String id;

    public MuhasebePersoneli(String name, int age, float salary, LocalDate startDate) {
        super(name, age, salary, startDate);
        setDepartment(PersonelManager.getDepartmanlar().get(4));
        getDepartment().getDepartmandakiPersoneller().add(this);
        this.id = "MP-" + iDNu++;
        PersonelManager.getPersoneller().add(this);
        PersonelManager.getPersonelById().put(this.id, this);
    }

    public static int getiDNu() {
        return iDNu;
    }

    public static void setiDNu(int iDNu) {
        MuhasebePersoneli.iDNu = iDNu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MuhasebePersoneli{" +
                "id='" + id + '\'' +
                "} " + super.toString();
    }

}
