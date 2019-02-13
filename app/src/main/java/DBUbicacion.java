import androidx.room.Database;
import androidx.room.RoomDatabase;
import darkdesigner.apliacionroom.Ubicacion;

@Database(entities = (Ubicacion.class),version = 1)

//clase abstracta  se definen pero no se implementa
public abstract class DBUbicacion extends RoomDatabase {

    public abstract UbicacionDaO ubicacionDaO();







}
