package java_hotel_system_interfaces;

import java.util.List;
import java.util.stream.Stream;
import java_hotel_system_entities.Type;

public interface I_TypeRepository {
   void save(Type type);     
   void remove(Type type);   
   void update(Type type);
   List<Type> getAll();       
   default Stream<Type> getStream(){ 
       return getAll().stream();
   }    
}
