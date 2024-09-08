package com.mycompany.biblioteca.java;

public class Revista extends Publicacion {
    private final int numeroRevista;
    private final String nombreRevista;

    // Constructor que inicializa los atributos y usa el constructor de la clase base
    public Revista(String titulo, int añoPublicacion, int numeroRevista, String nombreRevista) {
        super(titulo, añoPublicacion);  // Llamada al constructor de Publicacion
        this.numeroRevista = numeroRevista;
        this.nombreRevista = nombreRevista;
    }

    // Sobrescribir el método mostrarInfo para incluir más detalles
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llamar al método de la clase base
        System.out.println("Número de revista: " + numeroRevista);
        System.out.println("Nombre de la revista: " + nombreRevista);
    }

    // Getters (pueden ser útiles para las pruebas)
    public int getNumeroRevista() {
        return numeroRevista;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }
}
