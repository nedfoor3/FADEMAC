package com.rawrstudio.fademac;

import io.reactivex.Observable;

/**
 * Created by Ricardo Rodriguez on 5/11/2017.
 */
public interface LoginActivityMVP {

    /**
     * The interface Model.
     */
    interface Model{
        Observable<Usuario> validaUsuario(String usuario, String contrasenia);
    }

    /**
     * The interface View.
     */
    interface View {
        /**
         * Muestra error usuario.
         */
        void muestraErrorUsuario();

        /**
         * Muestra error contrasenia.
         */
        void muestraErrorContrasenia();

        /**
         * Muestra progressbar.
         */
        void muestraProgressbar();

        void ocultaProgressbar();
    }

    /**
     * The interface Presenter.
     */
    interface Presenter{

        void validarCredenciales(String usuario, String contrasenia);

    }
}
