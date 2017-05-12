package com.rawrstudio.fademac;

import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import io.reactivex.Observable;

/**
 * Created by Ricardo Rodriguez on 5/12/2017.
 */

public class LoginActivityModel implements LoginActivityMVP.Model {

    private String mUser = "richardo";
    private String mPass = "123";
    @Override
    public Observable<Usuario> validaUsuario(String usuario, String contrasenia) {
        Usuario usuario1 = new Usuario();


        Log.v("TAGGGG", usuario + "  " + contrasenia);
        if (mUser.compareTo(usuario) == 0 && mPass.compareTo(contrasenia) == 0){



            usuario1.setNombre("RICH");

        }
        return Observable.just(usuario1);
    }
}
