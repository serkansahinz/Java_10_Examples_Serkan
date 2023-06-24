package AraDönemOdevi;

import java.time.LocalDate;

public class Personel {
	private String name;
    private int iD;
    private double baseSalary;
    private LocalDate startDate;
    private Departman departman;
    private int baseLeave;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public Departman getDepartman() {
		return departman;
	}
	public void setDepartman(Departman departman) {
		this.departman = departman;
	}
	public int getBaseLeave() {
		return baseLeave;
	}
	public void setBaseLeave(int baseLeave) {
		this.baseLeave = baseLeave;
	}
}
