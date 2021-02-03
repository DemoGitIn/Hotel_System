package java_hotel_system_interfaces;
import java.util.List;
import java.util.stream.Stream;
import java_hotel_system_entities.Reservation;

public interface I_ReservationRepository {
   void save(Reservation reservation);     
   void remove(Reservation reservation);   
   void update(Reservation reservation);
   List<Reservation> getAll();       
   default Stream<Reservation> getStream(){ 
       return getAll().stream();
   }  
   default Reservation getById(int id){            
       return getStream().filter(r->r.getId()==id).findAny().orElse(new Reservation()); 
   }
}
