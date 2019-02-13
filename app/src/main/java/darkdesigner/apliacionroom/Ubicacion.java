package darkdesigner.apliacionroom;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Ubicacion {
    //identificadir id llave primaria
    @PrimaryKey                   //LLAVE PRIMARIA

    private int id;
    private int salon;
    private String ubicacion;

    public int getId() {
        return id;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setId(int id) {

        this.id = id;

    }
}
