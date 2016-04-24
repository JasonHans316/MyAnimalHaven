package com.animalhaven.hansportable.myanimalhaven.Repository.Implementations;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.animalhaven.hansportable.myanimalhaven.Config.DBConstants;
import com.animalhaven.hansportable.myanimalhaven.Domain.User;
import com.animalhaven.hansportable.myanimalhaven.Repository.Interfaces.UserRepository;

import java.util.Set;

/**
 * Created by Admin on 2016/04/24.
 */
public class UserRepositoryImpl extends SQLiteOpenHelper implements UserRepository {

    public UserRepositoryImpl(Context context) {
        super(context, DBConstants.DB_NAME, null, DBConstants.DB_VERSION);//Declared in Config package
    }
    @Override
    public User findById(Long aLong) {
        return null;
    }

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public User delete(User entity) {
        return null;
    }

    @Override
    public Set<User> findAll() {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
