package java_hotel_system;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java_hotel_system_entities.Type;
import java_hotel_system_interfaces.I_TypeRepository;

public class TYPE implements I_TypeRepository{
    private Connection conn;
    
    public TYPE(Connection conn) {    
        this.conn = conn;
    }

    TYPE() {
        
    }

    @Override
    public void save(Type type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Type type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Type type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Type> getAll() {
            List<Type>lista=new ArrayList();  
        try (ResultSet rs=conn.createStatement().executeQuery("select * from type")) {  
            while(rs.next()){   
                lista.add(new Type(
                        rs.getInt("id"),
                        rs.getString("label"),
                        rs.getString("price")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
