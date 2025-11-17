package views;

import models.Persona;

public class ShowConsole {
    public void showResult(int resultado, int valorBuscado){
        if (resultado != -1) {
            System.out.println("Número " + valorBuscado + " encontrado en el índice: " + resultado);
        } else {
            System.out.println("Número " + valorBuscado + " no encontrado en el arreglo.");
        }

    }

    public void showResult(Persona persona, String nombreBuscado){
        if (persona != null) {
            System.out.println("Persona encontrada: " + persona);
        } else {
            System.out.println("No se encontró una persona con el nombre: " + nombreBuscado);
        }
    }
    
}
