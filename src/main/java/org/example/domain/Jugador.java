package org.example.domain;

import java.util.List;

public class Jugador {
    private Integer Identificador;
    private String nombre;
    private String apellido;
    private Double altura;
    private String posicion;
    private Integer numeroDeCamiseta;
    private Integer partidos;
    private Integer goles;
    private Boolean esCapitan;

    public Jugador(Integer identificador, String nombre, String apellido, Double altura, String posicion, Integer numeroDeCamiseta, Integer partidos, Integer goles, Boolean esCapitan) {
        Identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.posicion = posicion;
        this.numeroDeCamiseta = numeroDeCamiseta;
        this.partidos = partidos;
        this.goles = goles;
        this.esCapitan = esCapitan;
        }
    public Jugador() {
    }

    public Integer getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(Integer identificador) {
        Identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public void setNumeroDeCamiseta(Integer numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    public Integer getPartidos() {
        return partidos;
    }

    public void setPartidos(Integer partidos) {
        this.partidos = partidos;
    }

    public Integer getGoles() {
        return goles;
    }

    public void setGoles(Integer goles) {
        this.goles = goles;
    }

    public Boolean getEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(Boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "Identificador=" + Identificador +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", altura=" + altura +
                ", posicion='" + posicion + '\'' +
                ", numeroDeCamiseta=" + numeroDeCamiseta +
                ", partidos=" + partidos +
                ", goles=" + goles +
                ", esCapitan=" + esCapitan +
                '}';
    }

    public boolean isCapitan() {
        return esCapitan;
    }
}
