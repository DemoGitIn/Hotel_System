package java_hotel_system;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java_hotel_system_entities.Reservation;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java_hotel_system_interfaces.I_ReservationRepository;
import javax.swing.JOptionPane;

public class RESERVATION implements I_ReservationRepository{
  //in the reservation table we need to add two foreign keys:
    //1 for the client
    // -> alter table reservations add constraint fk_client_id foreign key(client_id) references clients(id) on delete cascade;
    //2 for the room
    // -> alter table reservations add constraint fk_room_id foreign key(room_number) references rooms(r_number) on delete cascade; 

    //another foregin key between table types and rooms
    // -> alter table rooms add constraint fk_type_id foreign key(type) references type(id) on delete cascade; 
    
    //1- when adding a new reservation the room associated with it should be set to reserved = YES
    //   when deleting a new reservation the room associated with it should be set to reserved = NO
    //2- when adding a new reservation check if the room is already reserved
    //3- check if the date in is > the current date 
    //4- check if the date out is > the date in
            
    private Connection conn;
    
    public RESERVATION(Connection conn) {    
        this.conn = conn;
    }

    RESERVATION() {
        
    }
    
    @Override
    public void save(Reservation reservation) {  
    if(reservation==null);
        try(PreparedStatement ps=conn.prepareStatement(
                "insert into Reservations (id,client_id,room_number,date_in,date_out) values(?,?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS  
        )) {
            ps.setString(1, String.valueOf(reservation.getId()));
            ps.setString(2, String.valueOf(reservation.getClient_id()));                           
            ps.setString(3, String.valueOf(reservation.getRoom_number()));  
            ps.setString(4, String.valueOf(reservation.getDate_in()));
            ps.setString(5, String.valueOf(reservation.getDate_out()));           
            
            int res = ps.executeUpdate();
            if(res > 0){
                try (PreparedStatement st=conn.prepareStatement("update Rooms set reserved=? where r_number=?")){ 
                    st.setString(1, "Yes");
                    st.setString(2, String.valueOf(reservation.getRoom_number()));
                    st.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "New Reservation Added Succesfully");
            } else{
                JOptionPane.showMessageDialog(null, "Reservation Not Added"); 
            }    
            ResultSet rs=ps.getGeneratedKeys();     
            if(rs.next()) reservation.setId(rs.getInt(1));            
        } catch (Exception e) {
          e.printStackTrace();
        }
    }

    @Override
    public void update(Reservation reservation) {
        if(reservation==null) return;
        try (PreparedStatement ps=conn.prepareStatement("update reservations set client_id=?, room_number=?, date_in=? , date_out=? where id=?")){
            ps.setString(1, String.valueOf(reservation.getClient_id()));                           
            ps.setString(2, String.valueOf(reservation.getRoom_number()));  
            ps.setString(3, String.valueOf(reservation.getDate_in()));
            ps.setString(4, String.valueOf(reservation.getDate_out()));
            ps.setString(5, String.valueOf(reservation.getId()));
            int res = ps.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Reservation Data Updated Succesfully");
            } else{
                JOptionPane.showMessageDialog(null, "Reservation Data Not Updated");  
            }    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remove(Reservation reservation) {
        if(reservation==null) return;
        try(PreparedStatement ps=conn.prepareStatement("delete from reservations where id=?")){
            ps.setInt(1, reservation.getId());
            int res = ps.executeUpdate();
            if(res > 0){
                try (PreparedStatement st=conn.prepareStatement("update Rooms set reserved=? where r_number=?")){ 
                    st.setString(1, "No");
                    st.setString(2, String.valueOf(reservation.getRoom_number()));
                    st.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Reservation Deleted Succesfully");
            } else{
                JOptionPane.showMessageDialog(null, "Reservation Not Deleted");  
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    @Override
    public List<Reservation> getAll() {
        List<Reservation>lista=new ArrayList();  
        try (ResultSet rs=conn.createStatement().executeQuery("select * from reservations")) {  
            while(rs.next()){   
                lista.add(new Reservation(
                        rs.getInt("id"),
                        rs.getInt("client_id"),
                        rs.getInt("room_number"),
                        rs.getDate("date_in").toString(),
                        rs.getDate("date_out").toString()                     
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
