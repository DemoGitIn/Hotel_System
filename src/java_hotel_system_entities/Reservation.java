package java_hotel_system_entities;
import java.util.Date;

public class Reservation {
   private int id;
   private int client_id;
   private int room_number;
   private String date_in;
   private String date_out;

    public Reservation() {
    }

    public Reservation(int client_id, int room_number, String date_in, String date_out) {
        this.client_id = client_id;
        this.room_number = room_number;
        this.date_in = date_in;
        this.date_out = date_out;
    }

    public Reservation(int id, int client_id, int room_number, String date_in, String date_out) {
        this.id = id;
        this.client_id = client_id;
        this.room_number = room_number;
        this.date_in = date_in;
        this.date_out = date_out;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", client_id=" + client_id + ", room_number=" + room_number + ", date_in=" + date_in + ", date_out=" + date_out + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public String getDate_in() {
        return date_in;
    }

    public void setDate_in(String date_in) {
        this.date_in = date_in;
    }

    public String getDate_out() {
        return date_out;
    }

    public void setDate_out(String date_out) {
        this.date_out = date_out;
    }


   
}
