package org.example.servicios;

import org.example.domain.Entrenador;
import org.example.domain.Equipo;
import org.example.servicios.impl.EquipoServicioImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppServicio {
    List<Equipo>equipos=new ArrayList<>();
    public List<Entrenador>entrenador=new ArrayList<>();

    EquipoServicioImpl equipoServicio= new EquipoServicioImpl();

    JugadorServicio jugadorServicio= new JugadorServicio();

    ImportarServicio importarServicio=new ImportarServicio();
    Scanner scanner=new Scanner(System.in);


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
                case "1" -> equipoServicio.cargarEquipo(equipos);
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

