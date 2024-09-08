package com.mycompany.biblioteca.java;

public class Publicacion {
    private final String titulo;
    private final int añoPublicacion;

    public Publicacion(String titulo, int añoPublicacion) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + añoPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }
}
