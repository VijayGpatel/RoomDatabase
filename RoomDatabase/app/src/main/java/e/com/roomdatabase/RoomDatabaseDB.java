package e.com.roomdatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {UserDetail.class}, version = 1)
public abstract class RoomDatabaseDB extends RoomDatabase {

    public abstract UserDetailDAO userDetailDAO();
}
