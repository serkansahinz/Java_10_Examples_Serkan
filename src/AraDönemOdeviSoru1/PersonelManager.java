package AraDönemOdeviSoru1;

import java.util.List;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.*;


public class PersonelManager implements IMetodlar{
	 Scanner scanner = new Scanner(System.in);
	    private static List<Departman> departmanlar = new ArrayList<>();
	    private static List<Personel> personeller = new ArrayList<>();
	    private static Map<String, Personel> personelById = new HashMap<>();

	public static void main(String[] args) {
		
		
		 PersonelManager personelManager = new PersonelManager();
	        personelManager.createDepartment();
	        personelManager.createEmployee();
	        personelManager.actualMenu();
	       

	}
	
		
	
	private void createEmployee() {
		BüroPersoneli büroPersoneli=new BüroPersoneli("Can", 22, 26000f, LocalDate.of(2010, 5, 5));
		GenelMüdür genelMüdür=new GenelMüdür("Zafer", 40, 100000f, LocalDate.of(2000, 1, 1));
		Hizmetli hizmetli=new Hizmetli("Serkan", 32, 20000f, LocalDate.of(2020, 4, 20));
		İKPersoneli ikPersoneli=new İKPersoneli("Özge", 5, 999999999f, LocalDate.of(2019, 2, 11));
		MuhasebePersoneli muhasebePersoneli = new MuhasebePersoneli("Çiçek", 45, 26000f, LocalDate.of(2012, 4, 22));
		Müdür müdür=new Müdür("Mustafa", 35, 55000f, LocalDate.of(2018, 5, 19));
		Müdür müdür2=new Müdür("Mimar", 40, 65000f, LocalDate.of(2020, 4, 20));
		TeknikPersonel teknikPersonel = new TeknikPersonel("Mehmet", 31, 14000f, LocalDate.of(2019, 9, 15));
		
		
	}
	private void createDepartment() {
		 departmanlar.add(new Departman("Buro Personeli")); //0
		 departmanlar.add(new Departman("Genel Müdür"));    //1
		 departmanlar.add(new Departman("Hizmetli"));       //2
		 departmanlar.add(new Departman("İnsan Kaynakları")); //3
		 departmanlar.add(new Departman("Muhasebe"));         //4  
		 departmanlar.add(new Departman("Müdür"));            //5
	     departmanlar.add(new Departman("Teknik Personel"));  //6		
	}
	 public void addEmployee() {
	        String selection;
	        int counter = 1;
	        String name = Utility.stringDegerAlma("Personel adi girin");
	        int age = Utility.intDegerAlma("Personel yaşını girin");
	        float salary = Float.parseFloat(Utility.stringDegerAlma("Personelin maaşını girin."));
	        LocalDate startDate = Utility.stringTarihAlma("İşe başlama tarihi ( yil-ay-gün ) girin");
	        
	        System.out.println("Eklenen personel departmanını seçin :");
	        for (Departman a : departmanlar) {
	            System.out.println(counter + "-" + a.getIsim());
	            counter++;
	        }
	        
	        System.out.println("0. Çıkış");
	        selection = scanner.nextLine();
	        if (Integer.parseInt(selection) <= 7 && Integer.parseInt(selection) >= 1) {
	            switch (selection) {
	                case "1":
	                	  BüroPersoneli büroPersoneli= new BüroPersoneli(name, age, salary, startDate);
		                  System.out.println("Personel ekleme başarılı. Eklenen personel => " + büroPersoneli);
	                	  break;
	                case "2":
	                	GenelMüdür genelMudur = new GenelMüdür(name, age, salary, startDate);
	                    System.out.println("Personel ekleme başarılı. Eklenen personel => " + genelMudur);
	                    break;
	                case "3":
	                	Hizmetli hizmetli = new Hizmetli(name, age, salary, startDate);
	                    System.out.println("Personel ekleme başarılı. Eklenen personel => " + hizmetli);
	                    break;
	                case "4":
	                    İKPersoneli iK = new İKPersoneli(name, age, salary, startDate);
	                    System.out.println("Personel ekleme başarılı. Eklenen personel => " + iK);
	                    break;
	                case "5":
	                    MuhasebePersoneli muhasebePersoneli = new MuhasebePersoneli(name, age, salary, startDate);
	                    System.out.println("Personel ekleme başarılı. Eklenen personel => " + muhasebePersoneli);
	                    break;
	                case "6":
	                	Müdür mudur = new Müdür(name, age, salary, startDate);
	                    System.out.println("Personel ekleme başarılı. Eklenen personel => " + mudur);
	                    break;
	                case "7":
	                    TeknikPersonel teknikPersonel = new TeknikPersonel(name, age, salary, startDate);
	                    System.out.println("Personel ekleme başarılı. Eklenen personel => " + teknikPersonel);
	                    break;
	                default:
	                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
	                    break;
	            }
	        } else {
	            if (Integer.parseInt(selection) > 7 && Integer.parseInt(selection) <= departmanlar.size()) {
	                Personel personel = new Personel(name, age, salary, startDate);
	                personel.setDepartment(departmanlar.get(Integer.parseInt(selection)-1));
	                departmanlar.get(Integer.parseInt(selection)-1).getDepartmandakiPersoneller().add(personel);
	                System.out.println("Personel ekleme başarılı => "+personel);

	            }
	        }
	    }

	    public void personelList() {
	        int sayac = 0;
	        try {
	            if (!personeller.isEmpty()) {
	                for (Personel personel :
	                        personeller) {
	                    sayac++;
	                    System.out.println(sayac + ".personel=> " + personel.getName() + " - " + personel.getDepartment().getIsim());
	                }
	            } else throw new PersonelTrackingException(Errors.EMPTY_LIST, "Personel bulunmadığından işlem başarısız");
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	        sayac = 0;
	    }

	    public void updateEmployee() {
	        try {
	            if (!personeller.isEmpty()) {
	            	personelList();
	                int personelSirasi = Utility.intDegerAlma("Düzenlemek istediğiniz personeli seçin.");
	                String name = Utility.stringDegerAlma("Personelin adini girin");
	                personeller.get(personelSirasi - 1).setName(name);
	                float salary = (float) Utility.doubleDegerAlma("Personel maaşını girin.");
	                personeller.get(personelSirasi - 1).setSalary(salary);
	                for (Departman departman : departmanlar
	                ) {
	                    System.out.println(departman);
	                }
	                int departmanSecim = Utility.intDegerAlma("Departmanı seçin");
	                if (departmanSecim < departmanlar.size() && departmanSecim >= 1) {
	                    delete(personeller.get(personelSirasi - 1).getDepartment().getDepartmandakiPersoneller(), personeller.get(personelSirasi - 1));
	                    personeller.get(personelSirasi - 1).setDepartment(departmanlar.get(departmanSecim - 1));
	                    departmanlar.get(departmanSecim - 1).getDepartmandakiPersoneller().add(personeller.get(personelSirasi - 1));
	                    System.out.println("Personel düzenlenmiştir.==");
	                    System.out.println(personeller.get(personelSirasi - 1));
	                } else throw new RuntimeException("Yanlış departman girişi");
	            } else throw new PersonelTrackingException(Errors.NOT_IN_THE_LIST, "Personel bulunmadı, işlem başarısız");
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	    }

	    public void addDepartment() {
	        String departmanAdi = Utility.stringDegerAlma("Eklenecek departmanın adını girin");
	        try {
	            if (!departmanlar.stream().anyMatch(x -> x.equals(departmanAdi))) {
	                save(departmanlar, new Departman(departmanAdi));
	                System.out.println("Departman ekleme işlemi başarılı");
	            } else throw new PersonelTrackingException(Errors.ALREADY_EXISTS, "Departman mevcut");
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	        departmanList();
	    }

	    public void departmanList() {
	        try {
	            if (!departmanlar.isEmpty()) {
	                for (Departman departman :
	                        departmanlar) {
	                    System.out.println(departman.getIsim());
	                }
	            } else throw new PersonelTrackingException(Errors.EMPTY_LIST, "Departman bulunamadı");
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	    }

	    public void defineSalaryEmployee() {
	        try {
	            if (!personeller.isEmpty()) {
	            	personelList();
	                int personelSirasi = Utility.intDegerAlma("Düzenlemek istediğiniz personeli seçiniz.");
	                float salary = (float) Utility.doubleDegerAlma("Personelin maaşını giriniz.");
	                personeller.get(personelSirasi - 1).setSalary(salary);
	                System.out.println("Personel maaşı düzenlenmiştir.");
	                System.out.println(personeller.get(personelSirasi - 1));
	            } else throw new PersonelTrackingException(Errors.EMPTY_LIST, "Personel bulunmadığından işlem başarısız");
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	    }

	    public void payList() {
	        for (Personel personel : personeller
	        ) {
	            System.out.println(personel.getName() + "isimli personelin maasi=>" + personel.getSalary());
	        }
	    }

	    public void departmentsEmployees() {
	        Map<Departman, List<Personel>> departmandakiPersoneller = new HashMap<>();
	        for (Departman departman : departmanlar
	        ) {
	            departmandakiPersoneller.put(departman, departman.getDepartmandakiPersoneller());
	        }
	        try {
	            if (!departmandakiPersoneller.isEmpty()) {
	                departmandakiPersoneller.forEach((departman, list) ->
	                {
	                    System.out.println("Departman => " + departman.getIsim());
	                    System.out.println("Personeller => ");
	                    list.stream().map(x -> x.getName()).forEach(System.out::println);
	                });
	            } else throw new PersonelTrackingException(Errors.EMPTY_LIST, "Departmanda personel bulunamadı");
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	    }

	    public void mostEmployeeDepartment() {
	        Optional<Departman> enCokPersonel = departmanlar.stream().max(Comparator.comparingInt(x -> x.getDepartmandakiPersoneller().size()));
	        try {
	            if (enCokPersonel.isPresent()) {
	                Departman departman = enCokPersonel.get();
	                System.out.println("En çok personele sahip departman =>" + departman.getIsim());
	                System.out.println("Personel sayisi => " + departman.getDepartmandakiPersoneller().size());
	            } else {
	                throw new PersonelTrackingException(Errors.EMPTY_LIST, "Departman bulunamadı");
	            }
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	    }

	    private void meanSalaryPerDepartment() {
	        Map<Departman, Double> departmanMaasOrt = departmanlar.stream()
	                .collect(Collectors.toMap(x -> x,
	                        x -> x.getDepartmandakiPersoneller()
	                                .stream().mapToDouble(y -> y.getSalary()).average().orElse(0.0)));
	        try {
	            if (!departmanMaasOrt.isEmpty()) {
	                for (Entry<Departman, Double> departmanOrtMaas : departmanMaasOrt.entrySet()
	                ) {
	                    System.out.println(departmanOrtMaas.getKey().getIsim() + " departmanının maaş ortalaması => " + departmanOrtMaas.getValue());
	                }
	            } else throw new PersonelTrackingException(Errors.EMPTY_LIST, "Ortalama bulunamadı");
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	    }

	    public void departmentsOfManagers() {
	        try {
	            Map<Müdür, List<Departman>> müdürDepartmanMap = personeller.stream()
	                    .filter(x -> x instanceof Müdür)
	                    .collect(Collectors.toMap(x -> (Müdür) x, x -> ((Müdür) x).getMüdürünDepartmanlari()));
	            for (Entry<Müdür, List<Departman>> mudurDepartmanEntry : müdürDepartmanMap.entrySet()) {
	                System.out.println(mudurDepartmanEntry.getKey().getName() + " => " + mudurDepartmanEntry.getValue().stream().map(Departman::getIsim)
	                        .collect(Collectors.toList()));
	            }
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
	    }

	    public void EmployeesAccordingToRegistrationDate() {
	        List<Personel> siraliListe = personeller.stream().sorted((Comparator.comparing(Personel::getStartDate))).collect(Collectors.toList());
	        for (Personel personel : siraliListe
	        ) {
	            System.out.println(personel.getName() + " adlı personelin işe girişi -> " + personel.getStartDate());
	        }
	    }

	    public void employedTheSameDay() {
	        Map<LocalDate, List<Personel>> tarhiGorePersonelMap = personeller.stream()
	                .collect(Collectors.groupingBy(Personel::getStartDate));
	        for (LocalDate tarih : tarhiGorePersonelMap.keySet()) {
	            if (tarhiGorePersonelMap.get(tarih).size() >= 2) {
	                System.out.println("Başlangıç günü : " + tarih);
	                for (Personel personel : tarhiGorePersonelMap.get(tarih)) {
	                    System.out.println(personel.getName());
	                }
	            }
	        }
	    }


	    public static Map<String, Personel> getPersonelById() {
	        return personelById;
	    }

	    public static void setPersonelById(Map<String, Personel> personelById) {
	        PersonelManager.personelById = personelById;
	    }
	    
	public void initialMenu() {



        System.out.println("1. Personel İşlemleri");
        System.out.println("2. Muhasebe İşlemleri");
        System.out.println("3. Raporlamalar");
        System.out.println("0. Çıkış");
        System.out.print("Seçiminizi yapın: ");
    } public void actualMenu() {
    	
    	int choice;
        do {
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("1. Personel İşlemleri");
            System.out.println("2. Muhasebe İşlemleri");
            System.out.println("3. Raporlamalar");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");
        	choice= Integer.parseInt(scanner.nextLine());
        	
        switch (choice) {
        
            case 1:
                System.out.println("1. Personel İşlemleri");
                System.out.println("    1. Personel Ekleme");
                System.out.println("    2. Personel Listesi");
                System.out.println("    3. Personel Düzenleme");
                System.out.println("    4. Departman Ekleme");
                System.out.println("    5. Departman Listesi");
                int subChoiceOne;
                do {
                	
                	subChoiceOne= Integer.parseInt(scanner.nextLine());
                	switch (subChoiceOne) {
					case 1:
						 System.out.println("    1. Personel Ekleme");
						 addEmployee();
						 break;
					case 2:
						System.out.println("    2. Personel Listesi");
						personelList();
						break;
					case 3:
						System.out.println("    3. Personel Düzenleme");
						updateEmployee();
						break;
					case 4:
						System.out.println("    4. Departman Ekleme");
						addDepartment();
						break;
					case 5:
						System.out.println("    5. Departman Listesi");
						departmanList();
						break;

					default:
						 System.out.println("Geçersiz seçim");
						break;
					}                
                break;
                } while (subChoiceOne!=0);
                break;
            case 2:
                System.out.println("2. Muhasebe İşlemleri");
                System.out.println("    2.1. Maaş Personel tanımlama");
                System.out.println("    2.2. Ödeme Listesi");
                
                int subChoiceTwo;
                do {
                	subChoiceTwo= scanner.nextInt();
                	
                	switch (subChoiceTwo) {
					case 1:
						System.out.println("    1. Maaş Personel tanımlama");
						defineSalaryEmployee();
						break;
					case 2:
						System.out.println("    2. Ödeme Listesi");
						payList();
						break;
					

					default:
						 System.out.println("Geçersiz seçim");
						break;
					}                
                break;
                } while (subChoiceTwo!=0);
                break;
            case 3:
                System.out.println("3. Raporlamalar");
                System.out.println("    3.1. Departman Personel Listesi");
                System.out.println("    3.2. En Çok Personel Bulunan Departman");
                System.out.println("    3.3. Departmanlara göre maaş ortalamaları");
                System.out.println("    3.4. Müdürlerin sorumlu olduğu departman listesi");
                System.out.println("    3.5. Kayıt tarihlerine göre personellerin sıralı listesi.");
                System.out.println("    3.6. Aynı gün içinde işe başlayan personellerin listesi.");
                int subChoice3;
                do {
                	subChoice3= scanner.nextInt();
                	
                	switch (subChoice3) {
					case 1:
						System.out.println("    3.1. Departman Personel Listesi");
						departmentsEmployees();
						break;
					case 2:
						System.out.println("    3.2. En Çok Personel Bulunan Departman");
						mostEmployeeDepartment();
						break;
					case 3:
						System.out.println("    3.3. Departmanlara göre maaş ortalamaları");
						meanSalaryPerDepartment();
						break;
					case 4:
						System.out.println("    3.4. Müdürlerin sorumlu olduğu departman listesi");
						departmentsOfManagers();
						break;
					case 5:
						System.out.println("    3.5. Kayıt tarihlerine göre personellerin sıralı listesi.");
						EmployeesAccordingToRegistrationDate();
						break;
					case 6:
						System.out.println("    3.6. Aynı gün içinde işe başlayan personellerin listesi.");
						employedTheSameDay();
						break;	
					default:
						System.out.println("Geçersiz seçim");
						break;
					}                
                break;
                } while (subChoice3!=0);
                break;
                
            case 0:
                System.out.println("Çıkış");
               
                break;
            default:
                System.out.println("Lutfen geçerli bir seçim yapınız");
            }
        } while(choice!=0);
    }
    public static void mainMenu() {
        System.out.println("Ana Menü");
        System.out.println("1. Personel İşlemleri");
        System.out.println("2. Muhasebe İşlemleri");
        System.out.println("3. Raporlamalar");
        System.out.println("0. Çıkış");
        System.out.print("Seçiminizi yapın: ");
    }

    public static void personelTransactionsMenu() {
        System.out.println("Personel İşlemleri");
        System.out.println("1. Personel Ekleme");
        System.out.println("2. Personel Listesi");
        System.out.println("3. Personel Düzenleme");
        System.out.println("4. Departman Ekleme");
        System.out.println("5. Departman Listesi");
        System.out.println("0. Ana Menüye Dön");
        System.out.print("Seçiminizi yapın: ");
    }

    public static void AccountTransactionsMenu() {
        System.out.println("Muhasebe İşlemleri");
        System.out.println("1. Maaş Personel tanımlama");
        System.out.println("2. Ödeme Listesi");
        System.out.println("0. Ana Menüye Dön");
        System.out.print("Seçiminizi yapın: ");
    }

    public static void reportMenu() {
        System.out.println("Raporlamalar");
        System.out.println("1. Departman Personel Listesi");
        System.out.println("2. En Çok Personel Bulunan Departman");
        System.out.println("3. Departmanlara göre maaş ortalamaları");
        System.out.println("4. Müdürlerin sorumlu olduğu departman listesi");
        System.out.println("5. Kayıt tarihlerine göre personellerin sıralı listesi");
        System.out.println("6. Aynı gün içinde işe başlayan personellerin listesi");
        System.out.println("0. Ana Menüye Dön");
        System.out.print("Seçiminizi yapın: ");
    }

    public static List<Departman> getDepartmanlar() {
        return departmanlar;
    }

    public static void setDepartmanlar(List<Departman> departmanlar) {
        PersonelManager.departmanlar = departmanlar;
    }

    public static List<Personel> getPersoneller() {
        return personeller;
    }

    public static void setPersoneller(List<Personel> personeller) {
        PersonelManager.personeller = personeller;
    }
	
	@Override
	public <T> void save(List<T> list, T t) {
		list.add(t);
		
	}
	@Override
	public <T> void delete(List<T> list, T t) {
		list.remove(t);
		
	}
	@Override
	public <T> List<T> findAll(List<T> list, T t) {
		 List<T> bulunanlar = new ArrayList<>();
	        for (T eleman : list) {
	            if (eleman.equals(t)) {
	                bulunanlar.add(eleman);
	            }
	        }
	        return bulunanlar;
	}
	@Override
	public void findById() {
		 int arananId = Utility.intDegerAlma("Aranacak idyi girin");
	        Optional<Personel> arananPersonel = personeller.stream()
	                .filter(x -> x.getDepartment().getDepartmandakiPersoneller().stream()
	                        .anyMatch(y -> y.getiD()==arananId))
	                .findFirst();
	        try {
	            if (arananPersonel.isPresent()) {
	                Personel personel = arananPersonel.get();
	                System.out.println("Aranan id bulundu. Personel bilgileri ->\n" + personel);
	            } else throw new PersonelTrackingException(Errors.NOT_IN_THE_LIST, "Aranan id bulunamadı");
	        } catch (Exception e) {
	            System.out.println(e.toString());
	        }
		
	}
	@Override
	public void deleteById() {
		int arananId = Utility.intDegerAlma("Aranacak idyi girin");
        Personel arananPersonel = personeller.stream()
                .filter(x -> x.getDepartment().getDepartmandakiPersoneller().stream()
                        .anyMatch(y -> y.getiD()==(arananId)))
                .findFirst().orElse(null);
        try {
            if (arananPersonel != null) {
                System.out.println("Aranan id bulundu ve silindi ->\n" + arananPersonel);
                delete(personeller, arananPersonel);
            } else throw new PersonelTrackingException(Errors.NOT_IN_THE_LIST, "Aranan id bulunamadı");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
		
	}

}
