package e.com.roomdatabase;

import android.annotation.SuppressLint;
import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {

    RoomDatabaseDB roomDatabase;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createDataBase();
    }

    public void createDataBase() {
        roomDatabase = Room.databaseBuilder(getApplicationContext(), RoomDatabaseDB.class, "UserDetailDB").allowMainThreadQueries().build();
    }

    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
