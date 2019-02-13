import androidx.room.Dao;
import androidx.room.Insert;
import darkdesigner.apliacionroom.Ubicacion;

@Dao

public interface UbicacionDaO {

    @Insert

    public void insertUbicacion (Ubicacion miUbicacion);




}
