package com.juanpablogavilan.room_developer;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.juanpablogavilan.room_developer.dao.UsuarioDAO;
import com.juanpablogavilan.room_developer.model.Usuario;



@Database(entities = {Usuario.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UsuarioDAO getUsuarioDao();
}
