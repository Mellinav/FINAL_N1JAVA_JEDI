package org.example.servicios;

import org.example.domain.Entrenador;
import org.example.domain.Equipo;
import org.example.domain.Jugador;

import java.util.List;
import java.util.Scanner;

public class JugadorServicio {
    private final  Scanner scanner = new Scanner(System.in);

    public Jugador crearJugador(){
        Jugador nuevoJugador=null;
        int continuar=0;
        while (continuar!=2){
            System.out.println("Desea Agregar un jugador al equipo?   ");
            System.out.println("1 = Si");
            System.out.println("2 = No");
            continuar=scanner.nextInt();
            if (continuar==1){
                System.out.println("Nombre del Jugador: ");
                String nombreJugador= String.valueOf(scanner.next());

                System.out.println("Apellido del Jugador: ");
                String apellidoJugador= String.valueOf(scanner.next());

                System.out.println("Ingrese la Altura del jugador: ");
                Double alturaJugador= Double.valueOf(scanner.next());

                System.out.println("Posicion del Jugador: ");
                String posicionJugador= String.valueOf(scanner.next());

                System.out.println("Numero de la Camiseta del Jugador: ");
                Integer numeroDeCamiseta= Integer.valueOf(scanner.next());

                System.out.println("Cantidad de Partidos del Jugador: ");
                Integer partidos= Integer.valueOf(scanner.next());

                System.out.println("Cantidad de Goles:  ");
                Integer goles= Integer.valueOf(scanner.next());

                System.out.println("Es Capitan?(true o false)");
                Boolean esCapitan=Boolean.valueOf(scanner.next());
          nuevoJugador= new Jugador(1,nombreJugador, apellidoJugador,alturaJugador, posicionJugador, numeroDeCamiseta,partidos,goles,esCapitan);
        }

        }
        return nuevoJugador;
    }
    public void buscarJugadorPorNombre(List<Equipo> equipos) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        boolean jugadorEncontrado = false;
        for (Equipo equipo : equipos) {
            for (Jugador jugador : equipo.getListaDeJugadores()) {
                if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("===> Información del jugador <===");
                    System.out.println("Nombre: " + jugador.getNombre());
                    System.out.println("Apellido: " + jugador.getApellido());
                    System.out.println("Posición: " + jugador.getPosicion());
                    System.out.println("Es capitán: " + (jugador.isCapitan() ? "Sí" : "No"));
                    System.out.println("Equipo: " + equipo.getNombreDelEquipo());
                    jugadorEncontrado = true;
                    break;
                }
            }
        } if(!jugadorEncontrado){
            System.out.println("No se encontró ningún jugador con ese nombre.");
        }
    }



}





