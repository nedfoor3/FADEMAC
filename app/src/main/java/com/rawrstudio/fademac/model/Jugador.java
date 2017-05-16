package com.rawrstudio.fademac.model;

/**
 * Created by Tonatiuh on 15/05/2017.
 */

public class Jugador {
    private String equipoJugdador, categoriaJugador, edadJugador, pesoJugador, posicionJugador, curpJugador,
    primerNombreJugador, segundoNombreJugador, apellidoPaternoJugador, apellidoMaternoJugador, fechaDeNacimiento,
    genero, poblacion, homoclave;

    public Jugador(String equipoJugdador, String categoriaJugador, String edadJugador, String pesoJugador, String posicionJugador, String curpJugador, String primerNombreJugador, String segundoNombreJugador, String apellidoPaternoJugador, String apellidoMaternoJugador, String fechaDeNacimiento, String genero, String poblacion, String homoclave) {
        this.equipoJugdador = equipoJugdador;
        this.categoriaJugador = categoriaJugador;
        this.edadJugador = edadJugador;
        this.pesoJugador = pesoJugador;
        this.posicionJugador = posicionJugador;
        this.curpJugador = curpJugador;
        this.primerNombreJugador = primerNombreJugador;
        this.segundoNombreJugador = segundoNombreJugador;
        this.apellidoPaternoJugador = apellidoPaternoJugador;
        this.apellidoMaternoJugador = apellidoMaternoJugador;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.poblacion = poblacion;
        this.homoclave = homoclave;
    }

    public String getEquipoJugdador() {
        return equipoJugdador;
    }

    public void setEquipoJugdador(String equipoJugdador) {
        this.equipoJugdador = equipoJugdador;
    }

    public String getCategoriaJugador() {
        return categoriaJugador;
    }

    public void setCategoriaJugador(String categoriaJugador) {
        this.categoriaJugador = categoriaJugador;
    }

    public String getEdadJugador() {
        return edadJugador;
    }

    public void setEdadJugador(String edadJugador) {
        this.edadJugador = edadJugador;
    }

    public String getPesoJugador() {
        return pesoJugador;
    }

    public void setPesoJugador(String pesoJugador) {
        this.pesoJugador = pesoJugador;
    }

    public String getPosicionJugador() {
        return posicionJugador;
    }

    public void setPosicionJugador(String posicionJugador) {
        this.posicionJugador = posicionJugador;
    }

    public String getCurpJugador() {
        return curpJugador;
    }

    public void setCurpJugador(String curpJugador) {
        this.curpJugador = curpJugador;
    }

    public String getPrimerNombreJugador() {
        return primerNombreJugador;
    }

    public void setPrimerNombreJugador(String primerNombreJugador) {
        this.primerNombreJugador = primerNombreJugador;
    }

    public String getSegundoNombreJugador() {
        return segundoNombreJugador;
    }

    public void setSegundoNombreJugador(String segundoNombreJugador) {
        this.segundoNombreJugador = segundoNombreJugador;
    }

    public String getApellidoPaternoJugador() {
        return apellidoPaternoJugador;
    }

    public void setApellidoPaternoJugador(String apellidoPaternoJugador) {
        this.apellidoPaternoJugador = apellidoPaternoJugador;
    }

    public String getApellidoMaternoJugador() {
        return apellidoMaternoJugador;
    }

    public void setApellidoMaternoJugador(String apellidoMaternoJugador) {
        this.apellidoMaternoJugador = apellidoMaternoJugador;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getHomoclave() {
        return homoclave;
    }

    public void setHomoclave(String homoclave) {
        this.homoclave = homoclave;
    }
}
