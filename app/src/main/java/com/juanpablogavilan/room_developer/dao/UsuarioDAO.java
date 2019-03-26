package com.juanpablogavilan.room_developer.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.juanpablogavilan.room_developer.model.Usuario;

import java.util.List;

@Dao
public interface UsuarioDAO {
    @Query("SELECT * FROM usuario")
    public List<Usuario> getUsers();

    @Query("SELECT * FROM USUARIO WHERE uid = :id")
    public Usuario getUserById(Long id);
    @Insert
    public void insert(Usuario... usuarios);
    @Update
    public void update(Usuario... usuarios);
    @Delete
    public void delete(Usuario usuario);
}
