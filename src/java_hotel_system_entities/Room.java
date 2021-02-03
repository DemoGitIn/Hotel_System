package java_hotel_system_entities;
public class Room {
   private int r_number;
   private int type;
   private String phone;
   private String reserved;

    public Room() {
    }

    public Room(int type, String phone) {
        this.type = type;
        this.phone = phone;
    }

    public Room(int type, String phone, String reserved) {
        this.type = type;
        this.phone = phone;
        this.reserved = reserved;
    }

    public Room(int r_number, int type, String phone, String reserved) {
        this.r_number = r_number;
        this.type = type;
        this.phone = phone;
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return "Room{" + "r_number=" + r_number + ", type=" + type + ", phone=" + phone + ", reserved=" + reserved + '}';
    }

    public int getR_number() {
        return r_number;
    }

    public void setR_number(int r_number) {
        this.r_number = r_number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }
   
}
