package java_hotel_system_interfaces;
import java_hotel_system_entities.Client;
import java.util.List;
import java.util.stream.Stream;

public interface I_ClientRepository {  
   void save(Client client);     
   void remove(Client client);   
   void update(Client client);
   List<Client> getAll();       
   default Stream<Client> getStream(){ 
       return getAll().stream();
   }
   default Client getById(int id){            
       return getStream().filter(c->c.getId()==id).findAny().orElse(new Client()); 
   }
}
