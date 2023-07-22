package org.example.servicios.impl;

import org.example.domain.Entrenador;
import org.example.servicios.EntrenadorServicio;

import java.util.Scanner;

public class EntrenadorServicioImpl implements EntrenadorServicio {
    Scanner sc = new Scanner(System.in);
    @Override
    public Entrenador crearEntrenador() {
        System.out.println("Nombre del Entrenador: ");
        String nombre = sc.nextLine();
        System.out.println("Apellido del Entrenador: ");
        String apellido = sc.nextLine();
        System.out.println("Edad del Entrenador: ");
        Integer edad = sc.nextInt();
        return new Entrenador(nombre,apellido,edad);
    }
}
