package AraDönemOdeviSoru1;

import java.time.LocalDate;

public class BüroPersoneli extends Personel{
	private static int idNu = 1;
    private String iD;

    public BüroPersoneli(String name, int age, float salary, LocalDate startDate) {
        super(name, age, salary, startDate);
        this.iD = "BP-" + idNu++;
        PersonelManager.getPersoneller().add(this);
        PersonelManager.getPersonelById().put(this.iD, this);
        setDepartment(PersonelManager.getDepartmanlar().get(5));
        getDepartment().getDepartmandakiPersoneller().add(this);
    }

    public String getId() {
        return iD;
    }

    public void setId(String id) {
        this.iD = id;
    }

    public static int getIdNu() {
        return idNu;
    }

    public static void setIdNu(int idNu) {
    	BüroPersoneli.idNu = idNu;
    }

    @Override
    public String toString() {
        return "BuroPersoneli{" +
                "id='" + iD + '\'' +
                "} " + super.toString();
    }
}
