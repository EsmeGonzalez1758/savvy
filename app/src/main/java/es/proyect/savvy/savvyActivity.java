package es.proyect.savvy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class savvyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_savvy);

        // Obtener una referencia al ImageButton
        ImageButton backArrowButton = findViewById(R.id.backArrow);

        // Asignar un OnClickListener para redirigir a la nueva actividad
        backArrowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(savvyActivity.this, apartadosActivity.class);
                startActivity(intent);
            }
        });

        // Resto de tu código para manejar los Insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.secsavvy), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

