package java_hotel_system_swing;
import java.lang.reflect.Field;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table <E>{
    public void upload(JTable tbl, List<E> list){             
        if(tbl==null) return;
        DefaultTableModel dtm=new DefaultTableModel();
        tbl.setModel(dtm); 
        if(list==null || list.isEmpty()) return;
        E e=list.get(0); 
        Field[] fields=e.getClass().getDeclaredFields();    
        for(Field f:fields)dtm.addColumn(f.getName());    
        for(E ee:list){  
            Object[] record=new Object[fields.length];   
            for(int a=0;a<fields.length;a++){    
                Field f=fields[a];
                String metodo="get"+f.getName().substring(0,1).toUpperCase()+f.getName().substring(1);   
                try {                              
                    record[a]=e.getClass().getMethod(metodo, null).invoke(ee, null);  
                } catch (Exception ex) { ex.printStackTrace();}
            }
        dtm.addRow(record);   
        }
    }
}

