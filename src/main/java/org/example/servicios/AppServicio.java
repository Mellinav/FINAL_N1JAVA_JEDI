package org.example.servicios;

import org.example.domain.Entrenador;
import org.example.domain.Equipo;
import org.example.domain.Jugador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    List<Equipo>equipos=new ArrayList<>();


    EntrenadorServicio entrenadorServicio= new EntrenadorServicio();
    EquipoServicio equipoServicio= new EquipoServicio();
    JugadorServicio jugadorServicio= new JugadorServicio();

    ImportarServicio importarServicio=new ImportarServicio();
    Scanner scanner=new Scanner(System.in);
    public void cargarEquipo(List<Equipo>equipos){
        List<Jugador> jugadores= new ArrayList<>();

        System.out.println("Ingresar Nombre del equipo:  ");
        String nombreEquipo= scanner.next();

        LocalDate fechaDeCreacion = LocalDate.now();

        System.out.println("Ingrese el Nombre del entrenador: ");
        String nombreEntrenador= scanner.next();

        System.out.println("Ingrese el Apellido del entrenador: ");
        String apellidoEntrenador= scanner.next();

        System.out.println("Ingrese la Edad del entrenador: ");
        Integer edadEntrenador= Integer.valueOf(scanner.next());

        Entrenador entrenador= entrenadorServicio.crearEntrenador(nombreEntrenador, apellidoEntrenador,edadEntrenador);

        jugadores.add(jugadorServicio.crearJugador());
        equipos.add(equipoServicio.crearEquipo(nombreEquipo, fechaDeCreacion,new ArrayList<>(),entrenador));
    }

    public void menu (){
            while (true) {
                System.out.println("""
                        1.Crear Equipo
                        2.Buscar un jugador por su nombre
                        3.Buscar un equipo por su nombre, nombre de entrenador y nombre del capitán del equipo.
                        4.Buscar un equipo por su nombre
                        5.Eliminar Equipo por nombre
                        6.Importar lista de jugadores
                        7.Exportar lista de jugadores
                        8.Salir
                        """);
                String opcion = scanner.next();
                switch (opcion) {
                    case "1" -> cargarEquipo(equipos);
                    case "2" -> jugadorServicio.buscarJugadorPorNombre(equipos);
                    case "3" -> equipoServicio.buscarEquipoPorNombreEntrenadorCapitan(equipos);
                    case "4" -> equipoServicio.buscarEquipoPorNombre(equipos);
                    case "5" -> equipoServicio.eliminarEquipoPorNombre(equipos);
                    case "6" -> importarServicio.importarJugadoresDesdeArchivo(equipos);
                    case "7" -> {}
                    case "8" -> {}
                }
            }
    }
}

