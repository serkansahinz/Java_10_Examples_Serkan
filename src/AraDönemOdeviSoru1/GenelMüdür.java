package AraDönemOdeviSoru1;

import java.time.LocalDate;

public class GenelMüdür extends Personel {
	
	  private static int iDNu = 1;
	    private String id;


	    public GenelMüdür(String name, int age, float salary, LocalDate startDate) {
	        super(name, age, salary, startDate);
	        setDepartment(PersonelManager.getDepartmanlar().get(2));
	        getDepartment().getDepartmandakiPersoneller().add(this);
	        this.id = "GM-" + iDNu++;
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
	    	GenelMüdür.iDNu = iDNu;
	    }

	    @Override
	    public String toString() {
	        return "GenelMudur{" +
	                "id='" + id + '\'' +
	                "} " + super.toString();
	    }

}
