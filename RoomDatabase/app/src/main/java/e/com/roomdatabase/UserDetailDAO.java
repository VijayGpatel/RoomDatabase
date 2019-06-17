package e.com.roomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface UserDetailDAO {

    // insert the data in db
    @Insert
    void insert(UserDetail userDetail);

    // Get All data from database Userdetail Table
    @Query("select * from UserDetail")
    List<UserDetail> getUserDetail();

    // Delete user from userdetail table using id
    @Query("DELETE FROM UserDetail WHERE id = :id")
    void deleteByUserId(int id);

    // Get All data from database Userdetail Table
    @Query("UPDATE UserDetail SET name= :name,email= :email,phoneNumber= :phoneNumber,city= :city,state= :state WHERE id LIKE :id")
    void updateUserDetailById(int id, String name, String email, String phoneNumber, String city, String state);


}
