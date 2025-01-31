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

public class registroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);

        // Aquí aplicamos el listener para ajustar los insets (barras del sistema)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.registro), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Obtener el botón de registro
        Button btnRegistrar = findViewById(R.id.btnregistrar);

        // Configurar el evento onClick del botón
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para redirigir a la actividad validacionActivity
                Intent intent = new Intent(registroActivity.this, validacionActivity.class);
                startActivity(intent);
            }
        });
    }
}
