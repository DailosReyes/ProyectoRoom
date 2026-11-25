package com.example.proyectoroom.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Tarea {

    @PrimaryKey
    @NonNull
    public String idTarea;
    public String titulo;
    public String descripcion;
    public String fecha;
    public boolean completada;
    @NonNull
    public String idCategoria;
    @NonNull
    public String idUsuario;

    public Tarea(@NonNull String idTarea, String titulo, String descripcion, String fecha, boolean completada, String idCategoria, String idUsuario) {
        this.idTarea = idTarea;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.completada = completada;
        this.idCategoria = idCategoria;
        this.idUsuario = idUsuario;
    }

    @NonNull
    public String getIdTarea() { return idTarea; }
    public void setIdTarea(@NonNull String idTarea) { this.idTarea = idTarea; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public boolean isCompletada() { return completada; }
    public void setCompletada(boolean completada) { this.completada = completada; }

    public String getIdCategoria() { return idCategoria; }
    public void setIdCategoria(String idCategoria) { this.idCategoria = idCategoria; }

    public String getIdUsuario() { return idUsuario; }
    public void setIdUsuario(String idUsuario) { this.idUsuario = idUsuario; }
}