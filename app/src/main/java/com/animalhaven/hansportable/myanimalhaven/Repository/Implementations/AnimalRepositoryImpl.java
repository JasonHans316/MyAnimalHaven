package com.animalhaven.hansportable.myanimalhaven.Repository.Implementations;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.animalhaven.hansportable.myanimalhaven.Config.DBConstants;
import com.animalhaven.hansportable.myanimalhaven.Domain.Animal;
import com.animalhaven.hansportable.myanimalhaven.Repository.Interfaces.AnimalRepository;

import java.util.Set;

/**
 * Created by Admin on 2016/04/24.
 */
public class AnimalRepositoryImpl extends SQLiteOpenHelper implements AnimalRepository {

    public AnimalRepositoryImpl(Context context) {
        super(context, DBConstants.DB_NAME, null, DBConstants.DB_VERSION);
    }

    @Override
    public Animal findById(Long aLong) {
        return null;
    }

    @Override
    public Animal save(Animal entity) {
        return null;
    }

    @Override
    public Animal update(Animal entity) {
        return null;
    }

    @Override
    public Animal delete(Animal entity) {
        return null;
    }

    @Override
    public Set<Animal> findAll() {
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
