package es.proyect.savvy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class apartadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_apartados);

        // Ajustar el padding según la visibilidad de la barra de sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.apartados), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Referencias a los botones del layout principal
        ImageButton contenidoExtraButton = findViewById(R.id.contenidoextra);
        ImageButton perfilButton = findViewById(R.id.perfil);
        ImageButton infoButton = findViewById(R.id.info);

        // 1. Al hacer clic en el botón "contenidoextra", abrir la actividad activity_contenidoExtra
        contenidoExtraButton.setOnClickListener(v -> {
            Intent intent = new Intent(apartadosActivity.this, contenidoextraActivity.class);
            startActivity(intent);
        });

        // 2. Al hacer clic en el botón "perfil", abrir la actividad de perfil en lugar de Navigation Drawer
        perfilButton.setOnClickListener(v -> {
            Intent intent = new Intent(apartadosActivity.this, perfil.class);
            startActivity(intent);
        });

        // 3. Al hacer clic en el botón "info", abrir la actividad activity_savvy
        infoButton.setOnClickListener(v -> {
            Intent intent = new Intent(apartadosActivity.this, savvyActivity.class);
            startActivity(intent);
        });
    }
}


