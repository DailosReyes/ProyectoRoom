package com.example.proyectoroom.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "categoria")
public class Categoria {

    @PrimaryKey
    @NonNull
    public String idCategoria;
    public String nombre;
    public String descripcion;

    public Categoria(@NonNull String idCategoria, String nombre, String descripcion) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @NonNull
    public String getIdCategoria() { return idCategoria; }
    public void setIdCategoria(@NonNull String idCategoria) { this.idCategoria = idCategoria; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}