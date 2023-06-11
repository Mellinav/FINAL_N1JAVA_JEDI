package org.example.servicios;

import org.example.domain.Entrenador;
import org.example.domain.Equipo;
import org.example.domain.Jugador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EquipoServicio {
    private final Scanner scanner = new Scanner(System.in);

    public Equipo crearEquipo(String nombreDelEquipo, LocalDate fechaCreacion, List<Jugador> listaDeJugadores, Entrenador entrenador){
        Equipo nuevoEquipo = new Equipo(nombreDelEquipo, fechaCreacion, listaDeJugadores,entrenador);
        return nuevoEquipo;
            }
    public void buscarEquipoPorNombreEntrenadorCapitan(List<Equipo> equipos) {
        String capitanVerdadero = "";
        System.out.print("Ingrese el nombre del Equipo: ");
        String nombre = scanner.nextLine();
        boolean equipoEncontrado = false;
        for (Equipo equipo : equipos) {
            if (equipo.getNombreDelEquipo().equalsIgnoreCase(nombre)){
                System.out.println("Ingrese el Nombre del Capitan:  ");
                String nombreCapitan=scanner.nextLine();
                System.out.println("Ingrese el Nombre del entrenador:  ");
                String nombreEntrenador=scanner.nextLine();
                for(Jugador capi:equipo.getListaDeJugadores()){
                    if(capi.getEsCapitan()){
                        capitanVerdadero=capi.getNombre();
                        break;
                    }
                }
                if (nombreCapitan.equalsIgnoreCase(capitanVerdadero)&&nombreEntrenador.equalsIgnoreCase(equipo.getEntrenador().getNombre())) {
                        System.out.printf("""
                        nombre del equipo.:  %s
                        entrenador del equipo.: %s
                        capitan del equipo.:  %s
                        """,equipo.getNombreDelEquipo(),equipo.getEntrenador().getNombre(),capitanVerdadero);
                }
            }
        }
    }
     public void buscarEquipoPorNombre (List<Equipo> equipos){
        System.out.println("Ingrese el nombre del Equipo a buscar: ");
        String nombreDelEquipo = scanner.nextLine();
         boolean equipoEncontrado = false;
         for (Equipo equipo :equipos){
             if(equipo.getNombreDelEquipo().equalsIgnoreCase(nombreDelEquipo)){
                 System.out.println("Nombre del equipo: "+ equipo.getNombreDelEquipo());
                 System.out.println("Nombre del entrenador: "+ equipo.getEntrenador().getNombre());
                 System.out.println("La lista de jugadores es:  "+equipo.getListaDeJugadores());
                 equipoEncontrado = true;
                 break;
             }
             }
         if(!equipoEncontrado){
             System.out.println("No se encontro el equipo");
         }
       }

    public void eliminarEquipoPorNombre(List<Equipo> equipos){
        System.out.println("Ingrese el Nombre del equipo que desea eliminar:  ");
        String eliminarEquipoPorNombre = scanner.nextLine();
        Equipo equipo = null;
        for(Equipo equipoEliminar : equipos){
            if (equipo.getNombreDelEquipo().equalsIgnoreCase(eliminarEquipoPorNombre)){
                equipo = equipoEliminar;
                break;
            }
        }
        if (equipo!= null){
            equipos.remove(equipo);
            System.out.println("Equipo ELIMINADO!");
        } else {
            System.out.println("No se encontro ningun equipo con ese nombre");
        }
    }

}



