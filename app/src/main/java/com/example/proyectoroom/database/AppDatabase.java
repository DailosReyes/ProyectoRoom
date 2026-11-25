package com.example.proyectoroom.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.proyectoroom.dao.DaoCategoria;
import com.example.proyectoroom.dao.DaoTarea;
import com.example.proyectoroom.dao.DaoUsuario;
import com.example.proyectoroom.entity.Categoria;
import com.example.proyectoroom.entity.Tarea;
import com.example.proyectoroom.entity.Usuario;

@Database(
        entities = {Usuario.class, Categoria.class, Tarea.class},
        version = 1
)
public abstract class AppDatabase extends RoomDatabase {

    public abstract DaoUsuario daoUsuario();
    public abstract DaoCategoria daoCategoria();
    public abstract DaoTarea daoTarea();
}