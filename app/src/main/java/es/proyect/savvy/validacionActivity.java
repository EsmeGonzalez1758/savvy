package es.proyect.savvy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class validacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_validacion); // Asegúrate de que el layout sea el correcto (activity_validacion)

        // Ajustar insets para las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.validacion), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configurar el evento onClick del layout (cualquier parte de la pantalla)
        View layout = findViewById(R.id.validacion); // Referencia al layout principal

        layout.setOnClickListener(v -> {
            // Crear un Intent para redirigir a la actividad loginActivity
            Intent intent = new Intent(validacionActivity.this, loginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
