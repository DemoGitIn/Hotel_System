package java_hotel_system;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java_hotel_system_entities.Client;
import java_hotel_system_interfaces.I_ClientRepository;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CLIENT implements I_ClientRepository{
    private Connection conn;
    
    public CLIENT(Connection conn) {    
        this.conn = conn;
    }

    CLIENT() {
        
    }

    @Override
    public void save(Client client) {   //add a client
    if(client==null) return;
        try(PreparedStatement ps=conn.prepareStatement(
                "insert into Clients (first_name, last_name, phone, email) values(?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS  
        )) {
            ps.setString(1, client.getFirst_name());
            ps.setString(2, client.getLast_name());
            ps.setString(3, client.getPhone());   
            ps.setString(4, client.getEmail());
            int res = ps.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "New Client Added Succesfully");
            } else{
                JOptionPane.showMessageDialog(null, "Client Not  Added");  
            }    
            ResultSet rs=ps.getGeneratedKeys();     
            if(rs.next()) client.setId(rs.getInt(1));            
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
   
    @Override
    public void remove(Client client) {
        if(client==null) return;
        try(PreparedStatement ps=conn.prepareStatement("delete from Clients where id=?")){
            ps.setInt(1, client.getId());
            int res = ps.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Client Deleted Succesfully");
            } else{
                JOptionPane.showMessageDialog(null, "Client Not Deleted");  
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void update(Client client) {
        if(client==null) return;
        try (PreparedStatement ps=conn.prepareStatement("update Clients set first_name=?, last_name=?, phone=?, email=? where id=?")){
            ps.setString(1, client.getFirst_name());
            ps.setString(2, client.getLast_name());
            ps.setString(3, client.getPhone());   
            ps.setString(4, client.getEmail());
            ps.setString(5, String.valueOf(client.getId()));
            int res = ps.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Client Data Updated Succesfully");
            } else{
                JOptionPane.showMessageDialog(null, "Client Data Not Updated"); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<Client> getAll() {
        List<Client>lista=new ArrayList();  
        try (ResultSet rs=conn.createStatement().executeQuery("select * from clients")) {  
            while(rs.next()){  
                lista.add(new Client(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("phone"),
                        rs.getString("email")  
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}

    

