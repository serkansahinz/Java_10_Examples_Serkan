package AraDönemOdeviSoru1;

import java.util.List;

public interface IMetodlar {
	 <T> void save(List<T> list,T t);
     <T> void delete(List<T> list,T t);
     <T> List<T> findAll(List<T> list,T t);
      void findById();
      void deleteById();

}
