package AraDönemOdeviSoru1;

import java.time.LocalDate;

public class TeknikPersonel extends Personel{
	 private static int iDNu = 1;
	    private String id;


	    public TeknikPersonel(String name, int age, float salary, LocalDate startDate) {
	        super(name, age, salary, startDate);
	        setDepartment(PersonelManager.getDepartmanlar().get(6));
	        getDepartment().getDepartmandakiPersoneller().add(this);
	        this.id = "TP-" + iDNu++;
	        PersonelManager.getPersoneller().add(this);
	        PersonelManager.getPersonelById().put(this.id, this);
	    }

	    public static int getiDNu() {
	        return iDNu;
	    }

	    public static void setiDNu(int iDNu) {
	        TeknikPersonel.iDNu = iDNu;
	    }

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

		@Override
		public String toString() {
			return "TeknikPersonel [id=" + id + "]";
		}


	    
}
