package java_hotel_system_swing;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Validator {
    private JTextField txt;
    public Validator(JTextField txt) {
        this.txt = txt;
    }
    private boolean error(String msj){
        txt.requestFocus();;
        JOptionPane.showMessageDialog(txt, msj, "error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    public boolean length(int min, int max){
        if(txt==null) return true;
        return error("Fill required fields");
    }
}