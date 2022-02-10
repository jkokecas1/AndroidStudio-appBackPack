package com.shool.backpack.Class;

public class Linea {

    private String titulo;
    private String año;
    private int imagen;

    public Linea(String titulo, String año, int imagen) {
        this.titulo = titulo;
        this.año = año;
        this.imagen = imagen;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
