package com.rawrstudio.fademac;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.widget.Toast;

import org.reactivestreams.Subscription;

import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Ricardo Rodriguez on 5/12/2017.
 */

public class LoginActivityPresenterImpl implements LoginActivityMVP.Presenter {

    private LoginActivityMVP.View view;
    private Activity context;
    private LoginActivityMVP.Model model;
    private Subscription subscription = null;



    public LoginActivityPresenterImpl(Activity view) {
        this.view = (LoginActivityMVP.View) view;
        this.context = view;
        model = new LoginActivityModel();
    }
    @Override
    public void validarCredenciales(String usuario, final String contrasenia) {
        if (view != null){
            view.muestraProgressbar();
            Toast.makeText(context, "ahuevo", Toast.LENGTH_SHORT).show();
            /*subscription =*/ model.validaUsuario(usuario,contrasenia).subscribe(new Observer<Usuario>() {

                @Override
                public void onSubscribe(@NonNull Disposable d) {

                }

                @Override
                public void onNext(@NonNull Usuario usuario) {


                    if (usuario.getNombre()== null){
                        Toast.makeText(context, "SIN USUARIO", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(context, "VALIDO", Toast.LENGTH_SHORT).show();
                    }

                    /////aqui va intent, aun trabbajo en como se valida
                }


                @Override
                public void onError(@NonNull Throwable e) {

                }


                @Override
                public void onComplete() {

                    new CountDownTimer(3000, 1000) {
                        public void onFinish() {
                            // When timer is finished
                            // Execute your code here
                            view.ocultaProgressbar();
                        }

                        public void onTick(long millisUntilFinished) {
                            // millisUntilFinished    The amount of time until finished.
                        }
                    }.start();

                }
            });
        }

    }
}
