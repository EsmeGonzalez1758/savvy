package es.proyect.savvy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class contenidoextraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);  // Habilitar el diseño edge-to-edge
        setContentView(R.layout.activity_contenidoextra);  // Establecer el layout

        // Aplicar el listener para ajustar los márgenes según las insets del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Extra), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configurar el botón "Regresar"
        Button btnRegresar = findViewById(R.id.btnregresar);  // Obtener el botón por su ID
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear el intent para abrir la actividad ApartadosActivity
                Intent intent = new Intent(contenidoextraActivity.this, apartadosActivity.class);
                startActivity(intent);  // Iniciar la actividad
                finish();  // Finalizar la actividad actual
            }
        });
    }
}
