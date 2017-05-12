package com.rawrstudio.fademac;

import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * Created by Ricardo Rodriguez on 5/12/2017.
 */

public class Usuario{
    private String nombre;

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
