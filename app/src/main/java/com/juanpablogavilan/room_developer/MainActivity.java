package com.juanpablogavilan.room_developer;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.juanpablogavilan.room_developer.dao.UsuarioDAO;
import com.juanpablogavilan.room_developer.model.Usuario;

import java.util.List;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppDatabase db = Room.databaseBuilder(this, AppDatabase.class, "mydb")
                .allowMainThreadQueries()
                .build();
        UsuarioDAO usuarioDAO = db.getUsuarioDao();
        Usuario usuario = new Usuario();
        usuario.setUid(1);
        usuario.setFirstName("Alan");
        usuario.setLastName("Brito");

        Usuario usuario1 = new Usuario();
        usuario.setUid(1);
        usuario.setFirstName("Pedro");
        usuario.setLastName("Perez");

        usuarioDAO.insert(usuario);
        List<Usuario> usuarios = usuarioDAO.getUsers();

        usuarioDAO.update(usuario1);
        usuarios = usuarioDAO.getUsers();

        usuarioDAO.delete(usuario);
        usuarios = usuarioDAO.getUsers();


    }
}
