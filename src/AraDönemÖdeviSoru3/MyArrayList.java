package AraDönemÖdeviSoru3;

import java.util.Arrays;

public class MyArrayList<T> {
	
	private Object[] dizi;
    private int kapasite;
    
    public MyArrayList() {
        dizi = new Object[5];
        kapasite = 0;
    }

	public void add(T element) {
		 if (kapasite == dizi.length) {
	            increaseCapacity();
	        }
	        dizi[kapasite] = element;
	        kapasite++;
	}
	
	public void add(int index, T element) {
		if (index < 0 || index > kapasite) {        
            throw new IndexOutOfBoundsException();
        }
        if (kapasite == dizi.length) {
            increaseCapacity();
        }
        for (int i = kapasite; i > index; i--) { 
            dizi[i] = dizi[i - 1];
        }
        dizi[index] = element;
        kapasite++;
	}										// int[] array={0,1,2};
	
	public T get(int index) {
		 if (index < 0 || index >= kapasite) {
	            throw new IndexOutOfBoundsException();
	        }
	        return (T) dizi[index];
	}
	
	public void set(int index, T element) {
		if (index < 0 || index >= kapasite) {
            throw new IndexOutOfBoundsException();
        }
        dizi[index] = element;
	}
	
	public void remove(int index) {
		  if (index < 0 || index >= kapasite) {
	            throw new IndexOutOfBoundsException();
	        }
	        for (int i = index; i < kapasite - 1; i++) { 
	            dizi[i] = dizi[i + 1];
	        }
	        dizi[kapasite - 1] = null;
	        kapasite--;
	}
	
	public boolean contains(T element) {
		 for (int i = 0; i < kapasite; i++) {
	            if (dizi[i].equals(element)) {
	                return true;
	            }
	        }
	        return false;
	}
	
	public int size() {      
		return kapasite;
		
	}
	
	public boolean isEmpty() {
		
		return kapasite==0;
		 
		 
	}
	
	private void increaseCapacity() {
		 int newCapacity = dizi.length * 2;
//	        dizi = Arrays.copyOf(dizi, newCapacity);
	        Object[] dizi2= new Object[newCapacity];
	       for (int i = 0; i < dizi2.length; i++) {
			dizi2[i]= dizi[i];
		}
	       dizi=dizi2;
	}

	@Override
	public String toString() {
		return "MyArrayList [dizi=" + Arrays.toString(dizi) + ", kapasite=" + kapasite + "]";
	}
	
	
//    public String toString() {
//        String className = MyArrayList.class.getSimpleName();
//        StringBuilder result = new StringBuilder(className + "[");
//
//        if (kapasite > 0) {
//            boolean isFirstElement = true;
//            for (int i = 0; i < kapasite; i++) {
//                if (dizi[i] != null) {
//                    if (!isFirstElement) {
//                        result.append(", ");
//                    }
//                    result.append(dizi[i].toString());
//                    isFirstElement = false;
//                }
//            }
//        } else {
//            result.append("empty");
//        }
//
//        result.append("], kapasite=" + kapasite + "]");
//
//        return result.toString();
//    }
	
	
}
