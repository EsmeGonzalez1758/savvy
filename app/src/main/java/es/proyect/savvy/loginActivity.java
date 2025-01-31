package es.proyect.savvy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);

        // listener para ajustar los insets (barras del sistema)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Obtener el botón de inicio de sesión
        Button btnIngresar = findViewById(R.id.btn_ingresar);

        // Configurar el evento onClick del botón
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para redirigir a la actividad apartadosActivity
                Intent intent = new Intent(loginActivity.this, apartadosActivity.class);
                startActivity(intent);
            }
        });
        // Obtener el TextView de "registrarme"
        TextView lblRegistrar = findViewById(R.id.lbl_registrar);
        lblRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para redirigir a la actividad registroActivity
                Intent intent = new Intent(loginActivity.this, registroActivity.class);
                startActivity(intent);
            }
        });
    }
}

