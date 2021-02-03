package java_hotel_system;

import Connectors.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java_hotel_system_entities.Room;
import java_hotel_system_interfaces.I_RoomRepository;
import java.sql.PreparedStatement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ROOMS implements I_RoomRepository{

    private Connection conn;
    
    public ROOMS(Connection conn) {    
        this.conn = conn;
    }

    ROOMS() {
        
    }

    public void fillRooms_TYPE_JTable(JTable table) {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "select * from type";
        try {
            ps = Connector.getConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[3];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                tableModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  
//create a function to fill a combobox with the rooms-type id    
    public void fillRooms_TYPE_JCombobox(JComboBox combobox) {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "select * from type";
        try {
            ps = Connector.getConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
            while (rs.next()) {
                combobox.addItem(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //add a new room
    @Override
    public void save(Room room) {  
    if(room==null) return;
        try(PreparedStatement ps=conn.prepareStatement(
                "insert into Rooms (r_number,type,phone,reserved) values(?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS  
        )) {
            ps.setString(1, String.valueOf(room.getR_number()));
            ps.setString(2, String.valueOf(room.getType()));                           
            ps.setString(3, room.getPhone());   
            //when we add a new room the reserved column will be set to no
            ps.setString(4, "No");
            int res = ps.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "New Room Added Succesfully");
            } else{
                JOptionPane.showMessageDialog(null, "Room Not  Added");  
            }    
            ResultSet rs=ps.getGeneratedKeys();     
            if(rs.next()) room.setR_number(rs.getInt(1));            
        } catch (Exception e) {
          e.printStackTrace();
        }
    }

    @Override
    public void update(Room room) {
        if(room==null) return;
        try (PreparedStatement ps=conn.prepareStatement("update Rooms set type=?, phone=?, reserved=? where r_number=?")){
            ps.setString(1, String.valueOf(room.getType()));
            ps.setString(2, room.getPhone());   
            ps.setString(3, room.getReserved());
            ps.setString(4, String.valueOf(room.getR_number()));
            int res = ps.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Room Data Updated Succesfully");
            } else{
                JOptionPane.showMessageDialog(null, "Room Data Not Updated"); 
            }    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remove(Room room) {
        if(room==null) return;
        try(PreparedStatement ps=conn.prepareStatement("delete from Rooms where r_number=?")){
            ps.setInt(1, room.getR_number());
            int res = ps.executeUpdate();
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Room Deleted Succesfully");
            } else{
                JOptionPane.showMessageDialog(null, "Room Not Deleted");  
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<Room> getAll() {
        List<Room>lista=new ArrayList();  
        try (ResultSet rs=conn.createStatement().executeQuery("select * from rooms")) {  
            while(rs.next()){   
                lista.add(new Room(
                        rs.getInt("r_number"),
                        rs.getInt("type"),
                        rs.getString("phone"),
                        rs.getString("reserved")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public void isRoomReserved(Room room) {
       
        if(room==null) return;
        try (PreparedStatement ps=conn.prepareStatement("select reserved from rooms where r_number=?")){ 
            if(room.getReserved().equals("No")){
            //int res = ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "This Room is Already Reserved", "Room Reserved", JOptionPane.WARNING_MESSAGE);
            }    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

