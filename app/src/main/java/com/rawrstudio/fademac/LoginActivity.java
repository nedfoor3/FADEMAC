package com.rawrstudio.fademac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View {

    @BindView(R.id.tv_usuario)
    EditText tvUsuario;
    @BindView(R.id.tv_contrasenia)
    EditText tvContrasenia;
    @BindView(R.id.btn_ingresar)
    Button btnIngresar;
    @BindView(R.id.progressbar)
    ProgressBar progressbar;
    @BindView(R.id.layout_principal)
    LinearLayout layoutPrincipal;

    LoginActivityMVP.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        presenter = new LoginActivityPresenterImpl(this);

        Button buttonDummy;
        buttonDummy = (Button)findViewById(R.id.buttonDummy);
        buttonDummy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });

    }

    /**
     * Muestra error usuario.
     */
    @Override
    public void muestraErrorUsuario() {
        tvUsuario.setError(getString(R.string.error_nombre_usuario));

    }

    /**
     * Muestra error contrasenia.
     */
    @Override
    public void muestraErrorContrasenia() {
        tvContrasenia.setError(getString(R.string.error_contrasenia));

    }

    /**
     * Muestra progressbar.
     */
    @Override
    public void muestraProgressbar() {
        progressbar.setVisibility(View.VISIBLE);
    }

    @Override
    public void ocultaProgressbar() {
        progressbar.setVisibility(View.INVISIBLE);
    }

    public void validaUsuario(View view){
        Toast.makeText(this, "Validar", Toast.LENGTH_SHORT).show();
        presenter.validarCredenciales(tvUsuario.getText().toString(), tvContrasenia.getText().toString());
    }
}
