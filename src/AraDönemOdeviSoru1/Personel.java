package AraDönemOdeviSoru1;

import java.time.LocalDate;
import java.util.Objects;

public class Personel {
	
	private String name;
	private int age;
    private int iD;
    private double salary;
    private LocalDate startDate;
    private Departman department;
    
    public Personel(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

    public Personel(String name, int age, float salary) {
        this.name = name;
        this.setAge(age);
        this.salary = salary;
    }

    public Personel(String name, int age, float masalaryas, LocalDate startDate) {
        this.name = name;
        this.setAge(age);
        this.salary = salary;
        this.startDate = startDate;
    }
    
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	
	

	public Departman getDepartment() {
		return department;
	}

	public void setDepartment(Departman department) {
		this.department = department;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personel [name=");
		builder.append(name);
		builder.append(", iD=");
		builder.append(iD);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", department=");
		builder.append(department);
				
		builder.append("]");
		return builder.toString();
	}
	
	

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
}
