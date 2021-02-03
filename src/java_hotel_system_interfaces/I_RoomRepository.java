package java_hotel_system_interfaces;
import java_hotel_system_entities.Room;
import java.util.List;
import java.util.stream.Stream;

public interface I_RoomRepository {
   void save(Room room);     
   void remove(Room room);   
   void update(Room room);
   List<Room> getAll();       
   default Stream<Room> getStream(){ 
       return getAll().stream();
   }   
   default Room getByR_number(int number){            
       return getStream().filter(r->r.getR_number()==number).findAny().orElse(new Room()); 
   }
}
