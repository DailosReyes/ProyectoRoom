package com.example.proyectoroom.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "usuario")
public class Usuario {

    @PrimaryKey
    @NonNull
    public String idUsuario;
    public String nombre;
    public String email;

    public Usuario(@NonNull String idUsuario, String nombre, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
    }

    @NonNull
    public String getIdUsuario() { return idUsuario; }
    public void setIdUsuario(@NonNull String idUsuario) { this.idUsuario = idUsuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}