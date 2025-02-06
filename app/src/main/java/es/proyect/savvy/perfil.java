package es.proyect.savvy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_perfil);

        // Ajustar insets para evitar superposición con la barra de estado y navegación
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.perfil), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Botón de cerrar sesión
        ImageButton cerrarSesionButton = findViewById(R.id.cerrarsesion);
        cerrarSesionButton.setOnClickListener(v -> {
            Intent intent = new Intent(perfil.this, loginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        });

        // Botón de retroceso (backArrow)
        ImageButton backArrowButton = findViewById(R.id.backArrow);
        backArrowButton.setOnClickListener(v -> {
            Intent intent = new Intent(perfil.this, apartadosActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
