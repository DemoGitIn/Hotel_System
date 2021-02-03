package test;
import Connectors.Connector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class TestConnector {

    public static void main(String[] args) throws Exception{
    Connection conn=Connector.getConnection();  
        String query="insert into Clients (first_name, last_name, phone, email) values('Alicia','Spinnet','1566452315','al_00@live.com')";   
        Statement st=conn.createStatement();  
        st.execute(query);
        
        Connector                                   
                .getConnection()
                .createStatement()
                .execute("insert into Clients (first_name, last_name, phone, email) values('Oliver','Wood','1596324578','ol_00@live.com')");   
        ResultSet rs=Connector.getConnection().createStatement().executeQuery("select * from cursos");
        while(rs.next()){  
            System.out.println(
                    rs.getInt("id")+", "+
                    rs.getString("first_name")+", "+
                    rs.getString("last_name")+", "+
                    rs.getInt("phone")+", "+
                    rs.getString("email")
            );        
        }
    }
}
