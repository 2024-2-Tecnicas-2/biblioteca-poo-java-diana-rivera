package com.mycompany.biblioteca.java;

public class Libro extends Publicacion {
    private final String autor;
    private final int numPaginas;

    public Libro(String titulo, int añoPublicacion, String autor, int numPaginas) {
        super(titulo, añoPublicacion);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llamar al método de la clase base
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }
}
