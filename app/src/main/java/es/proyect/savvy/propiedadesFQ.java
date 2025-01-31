package es.proyect.savvy;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class propiedadesFQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_propiedades_fq);

        // Asegúrate de que el ID sea correcto
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.propiedadesFQ), (v, insets) -> {
            // Recupera los márgenes de las barras del sistema
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            // Establece el padding de la vista con los márgenes recuperados
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
