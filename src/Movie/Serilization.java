package Movie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Optional;

public class Serilization {
	
	public static void main(String[] args) {
		Movie movie = new Movie("Küçük Prens", "Felsefe", LocalDate.of(2016, 05, 05));
//		serilization(movie);
		Optional <Movie> movie2= deserilization();
		if (movie2.isEmpty()) {
			System.out.println("deserilize işlemi başarısız");
		} else {
			System.out.println(movie2.get());
		}
	} public static void serilizationList(List<Movie> movieList) {
		ObjectOutputStream oos= new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\avgam\\Desktop\\fileyolu\\objeyaz.txt"))) {
					
				}
	} 
	
	
	public static void serilization(Movie movie) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"C:\\Users\\avgam\\Desktop\\fileyolu\\objeyaz.txt"))) {
			
			oos.writeObject(movie);
			System.out.println("Serileştirme işlemi başarılı");
			
		} catch (FileNotFoundException e) {
			System.out.println("Serileştirme işlemi başarısız!!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Serileştirme işlemi başarısız!!!");
			e.printStackTrace();
		}
	} public static Optional <Movie> deserilization() {
		Movie movie = null;
		Optional <Movie> movieOptional;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\avgam\\Desktop\\fileyolu\\objeyaz.txt")))
		 {
			 
			 
				movie = (Movie) ois.readObject();
				System.out.println("deserilize işlemi başarılı");
			} catch (ClassNotFoundException e) {
				 System.out.println("deserilize işlemi başarılı");
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				System.out.println("deserilize işlemi başarısız");
			e.printStackTrace();
		} catch (IOException e) {
			 System.out.println("deserilize işlemi başarısız");
			e.printStackTrace();
		} {
			
			
		}
		return Optional.ofNullable(movie);
			
	}

}
