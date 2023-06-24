package trials;

import java.io.File;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\avgam\\Desktop\\fileyolu\\deneme3");
		
			try {
				if (file.createNewFile()) {
					System.out.println("yeni dosya olustu");
					
				} else {
					System.out.println("dosya zaten mevcut");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
