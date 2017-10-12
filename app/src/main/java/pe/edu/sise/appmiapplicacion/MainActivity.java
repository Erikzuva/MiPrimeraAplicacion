package pe.edu.sise.appmiapplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText nombre,correo,telefono;
    RadioButton rbMasculino,rbFemenino;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre= (EditText) findViewById(R.id.txtNombre);
        correo= (EditText) findViewById(R.id.txtCorreo);
        telefono= (EditText) findViewById(R.id.txtTelefono);

    }
}
