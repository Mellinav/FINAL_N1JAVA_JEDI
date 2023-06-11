package org.example.servicios;

import org.example.domain.Equipo;
import org.example.domain.Jugador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ImportarServicio {
    Scanner scanner=new Scanner(System.in);
    EquipoServicio equipoServicio= new EquipoServicio();
    public void importarJugadoresDesdeArchivo(List<Equipo> equipos) {
        System.out.println("Nombre del equipo:  ");
        String nombreEquipo=scanner.nextLine();
        Equipo equipoEncontrado=null;
        for(Equipo equipo:equipos){
            if(equipo.getNombreDelEquipo().equalsIgnoreCase(nombreEquipo)){
                equipoEncontrado=equipo;
            }
        }
        try (BufferedReader br = new BufferedReader(new FileReader(".FINAL_N1JAVA_JEDI"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosJugador = linea.split(",");
                Integer identificador = Integer.parseInt(datosJugador[0]);
                String nombre = datosJugador[1];
                String apellido = datosJugador[2];
                Double altura = Double.parseDouble(datosJugador[3]);
                String posicion = datosJugador[4];
                Integer numeroDeCamiseta = Integer.parseInt(datosJugador[5]);
                Integer partidos = Integer.parseInt(datosJugador[6]);
                Integer goles = Integer.parseInt(datosJugador[7]);
                Boolean esCapitan = Boolean.parseBoolean(datosJugador[8]);

                Jugador jugador = new Jugador(identificador, nombre, apellido, altura, posicion,
                        numeroDeCamiseta, partidos, goles, esCapitan);

                equipoEncontrado.getListaDeJugadores().add(jugador);
                equipos.forEach(System.out::println);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
