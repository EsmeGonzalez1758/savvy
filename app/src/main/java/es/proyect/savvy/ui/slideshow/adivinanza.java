package es.proyect.savvy.ui.slideshow;

import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import es.proyect.savvy.R;

public class adivinanza extends AppCompatActivity {

    TextView adivinanza;
    Button respuestaAanz, respuestaBanz, respuestaCanz, respuestaDanz;
    Button botonanz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anz);

        adivinanza = findViewById(R.id.adivinanza);
        respuestaAanz = findViewById(R.id.respuestaAanz);
        respuestaBanz = findViewById(R.id.respuestaBanz);
        respuestaCanz = findViewById(R.id.respuestaCanz);
        respuestaDanz = findViewById(R.id.respuestaDanz);
        botonanz = findViewById(R.id.botonanz);
    }
}
