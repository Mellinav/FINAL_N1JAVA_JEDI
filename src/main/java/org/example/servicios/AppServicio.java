package org.example.servicios;

import org.example.domain.Entrenador;
import org.example.domain.Equipo;
import org.example.domain.Jugador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {

    EntrenadorServicio entrenadorServicio= new EntrenadorServicio();
    EquipoServicio equipoServicio= new EquipoServicio();
    JugadorServicio jugadorServicio= new JugadorServicio();
    Scanner scanner=new Scanner(System.in);
    public void cargarEquipo(List<Equipo>equipos){
        List<Jugador> jugadores= new ArrayList<>();
        System.out.println("Ingresar Nombre del equipo:  ");
        String nombreEquipo= scanner.nextLine();

        LocalDate fechaDeCreacion = LocalDate.now();

        System.out.println("Ingrese el Nombre del entrenador: ");
        String nombreEntrenador= scanner.nextLine();

        System.out.println("Ingrese el Apellido del entrenador: ");
        String apellidoEntrenador= scanner.nextLine();

        System.out.println("Ingrese la Edad del entrenador: ");
        Integer edadEntrenador= Integer.valueOf(scanner.next());

        Entrenador entrenador= entrenadorServicio.crearEntrenador(nombreEntrenador, apellidoEntrenador,edadEntrenador);

        jugadores.add(jugadorServicio.crearJugador());
        equipos.add(equipoServicio.crearEquipo(nombreEquipo, fechaDeCreacion,new ArrayList<>(),entrenador));
    }
}

