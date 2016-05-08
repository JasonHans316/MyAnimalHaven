package com.animalhaven.hansportable.myanimalhaven.Repository.Implementations;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.animalhaven.hansportable.myanimalhaven.Config.DBConstants;
import com.animalhaven.hansportable.myanimalhaven.Domain.Schedule;
import com.animalhaven.hansportable.myanimalhaven.Repository.Interfaces.ScheduleRepository;

import java.util.Set;

/**
 * Created by Admin on 2016/04/24.
 */
public class ScheduleRepositoryImpl  extends SQLiteOpenHelper implements ScheduleRepository {

    public ScheduleRepositoryImpl(Context context) {
        super(context, DBConstants.DB_NAME, null, DBConstants.DB_VERSION);//Declared in Config package
    }
    @Override
    public Schedule findById(Long aLong) {
        return null;
    }

    @Override
    public Schedule save(Schedule entity) {
        return null;
    }

    @Override
    public Schedule update(Schedule entity) {
        return null;
    }

    @Override
    public Schedule delete(Schedule entity) {
        return null;
    }

    @Override
    public Set<Schedule> findAll() {
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
