package Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
/*
1- isminde a gecen ogrencileri getirelim
2- her bir ogrencinin not ortalamsını hesaplayıp double bir listede toplayalım 
3- butun ogrencilerin not oratalamsını hesaplayalım 
4- bolumeGoreMaple metoduyla beraber ogrecnileri bolumlere gore mapleyelim 
5-ortalaması 50 den buyuk olanların durumu gecti kucuklerin durumu kaldı olarak guncellensin 
6-her ogrenciye 4 uncu notuda ekleyelim
7-her ogrencinin herbir notuna 15 puan daha ekleyelim 
8-her ogernciyi idsine karsılık ismi gelecek şekilde mapleyelim

*/
public class Deneme2 {

	static List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		Deneme2 deneme2 = new Deneme2();
		List<Double> notOrtalamaları=new LinkedList<>();
		Map<Student, String> ogrenciBolum= new HashMap<>();
		Map<Integer, String> ogrenciID= new HashMap<>();
		
		
//		deneme2.students.stream().filter(x -> x.toString().contains("A")).forEach(System.out::println);
		deneme2.students.stream().filter(x -> x.getName().startsWith("A")).forEach(x-> System.out.println(x.getName()));
		double ortalama1 = students.get(0).notlar.stream().mapToDouble(x->x).average().getAsDouble();
		System.out.println(ortalama1);
		double ortalama2 = students.get(1).notlar.stream().mapToDouble(x->x).average().getAsDouble();
		System.out.println(ortalama2);
		double ortalama3 = students.get(2).notlar.stream().mapToDouble(x->x).average().getAsDouble();
		System.out.println(ortalama3);
		double ortalama4 = students.get(3).notlar.stream().mapToDouble(x->x).average().getAsDouble();
		System.out.println(ortalama4);
		double ortalama5 = students.get(4).notlar.stream().mapToDouble(x->x).average().getAsDouble();
		System.out.println(ortalama5);
		double ortalama6 = students.get(5).notlar.stream().mapToDouble(x->x).average().getAsDouble();
		System.out.println(ortalama6);
		notOrtalamaları.add(ortalama1);
		notOrtalamaları.add(ortalama2);
		notOrtalamaları.add(ortalama3);
		notOrtalamaları.add(ortalama4);
		notOrtalamaları.add(ortalama5);
		notOrtalamaları.add(ortalama6);
		double sinifOrt=notOrtalamaları.stream().mapToDouble(x->x).average().getAsDouble();
		System.out.println("sinifOrt= "+sinifOrt);
		
//		double ortalama1 = numaralar.stream().filter(x -> x * 2 < 70).mapToInt(x -> x).average().getAsDouble();
//        System.out.println("Ortalama 1: " + ortalama1);
		
		for (int i = 0; i < deneme2.students.size(); i++) {
			ogrenciBolum.put(deneme2.students.get(i), deneme2.students.get(i).bolum);
		}
		for(Entry<Student, String> deger : ogrenciBolum.entrySet()) {
			System.out.println(deger.getKey().getName()+ " nin bolumu ===>" + deger.getValue() );
		
		}
		
		System.out.println(ogrenciBolum);
//	ortalaması 50 den buyuk olanların durumu gecti kucuklerin durumu kaldı olarak guncellensin
		notOrtalamaları.stream().map(x-> (x<50)? "kaldi" : "gecti").forEach(System.out::println);
//		notOrtalamaları.stream().map(x-> (x<50)? x.set ).forEach(null);
		
		
		/*her ogrenciye 4 uncu notuda ekleyelim*/
		students.stream().forEach(x->x.notlar.add(60.0));
		System.out.println(students);
		/*her ogrencinin herbir notuna 15 puan daha ekleyelim*/
		students.stream().map(x->(x.notlar)).forEach(System.out::println);
		System.out.println("Birinci notlar");
		students.stream().map(x-> (x.notlar.get(0)+15.0)).forEach(System.out::println);
		System.out.println("İkinci notlar");
		students.stream().map(x-> (x.notlar.get(1)+15.0)).forEach(System.out::println);
		System.out.println("Üçüncü notlar");
		students.stream().map(x-> (x.notlar.get(2)+15.0)).forEach(System.out::println);
		System.out.println("Dördüncü notlar");
		students.stream().map(x-> (x.notlar.get(3)+15.0)).forEach(System.out::println);
//		students.stream().map(x-> (x.notlar.get(0)>=85)? (x.notlar.get(0)=100) : (x.notlar.get(0)+15.0)).forEach(System.out::println);
	
		
		System.out.println("Id ve Ogrenci adi yazdırma Map");
		for (int i = 0; i < deneme2.students.size(); i++) {
			ogrenciID.put(students.get(i).id,students.get(i).name);
		}
		for(Entry<Integer, String> deger : ogrenciID.entrySet()) {
			System.out.println(deger.getKey()+ " numaralı ogrenci===>" + deger.getValue() );
		
		}
	
		
	}
	public Deneme2() {
		Student student = new Student();
		student.name = "Ali";
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.bolum = "tm";
		student.id = 1;
		Student student2 = new Student();
		student2.name = "Ayşe";
		student2.notlar.add(80.0);
		student2.notlar.add(55.5);
		student2.notlar.add(79.4);
		student2.bolum = "mat";
		student2.id = 2;
		Student student3 = new Student();
		student3.name = "Hakan";
		student3.notlar.add(86.0);
		student3.notlar.add(97.5);
		student3.notlar.add(50.4);
		student3.bolum = "mat";
		student3.id = 3;
		Student student4 = new Student();
		student4.name = "Mert";
		student4.notlar.add(10.0);
		student4.notlar.add(35.5);
		student4.notlar.add(58.4);
		student4.bolum = "tm";
		student4.id = 4;
		Student student5 = new Student();
		student5.name = "Gamze";
		student5.notlar.add(68.0);
		student5.notlar.add(23.5);
		student5.notlar.add(90.4);
		student5.bolum = "mat";
		student5.id = 5;
		Student student6 = new Student();
		student6.name = "Merve";
		student6.notlar.add(36.0);
		student6.notlar.add(23.5);
		student6.notlar.add(58.4);
		student6.bolum = "tm";
		student6.id = 6;
		students.add(student);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
	}

}
