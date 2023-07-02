package AraDönemOdeviSoru1;

import java.time.LocalDate;

public class Hizmetli extends Personel{
	 private static int iDNu = 1;
	    private String id;

	    public Hizmetli(String name, int age, float salary, LocalDate startDate) {
	        super(name, age, salary, startDate);
	        setDepartment(PersonelManager.getDepartmanlar().get(0));
	        getDepartment().getDepartmandakiPersoneller().add(this);
	        this.id = "H-" + iDNu++;
	        PersonelManager.getPersoneller().add(this);
	        PersonelManager.getPersonelById().put(this.id, this);
	    }

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public static int getIDNu() {
	        return iDNu;
	    }

	    public static void setIDNu(int iDNu) {
	        Hizmetli.iDNu = iDNu;
	    }


	    @Override
	    public String toString() {
	        return "Hizmetli{" +
	                "id='" + id + '\'' +
	                "} " + super.toString();
	    }

}
