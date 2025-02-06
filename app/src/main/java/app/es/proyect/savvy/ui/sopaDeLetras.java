package app.es.proyect.savvy.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import es.proyect.savvy.R;

import java.util.ArrayList;



public class sopaDeLetras extends AppCompatActivity {

    private ArrayList<Button> selectedButtons = new ArrayList<>(); // Guarda los botones seleccionados

    private String selectedWord = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sop);

        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button22 = findViewById(R.id.button22);
        Button button23 = findViewById(R.id.button23);
        Button button24 = findViewById(R.id.button24);
        Button button25 = findViewById(R.id.button25);
        Button button26 = findViewById(R.id.button26);
        Button button27 = findViewById(R.id.button27);
        Button button28 = findViewById(R.id.button28);
        Button button29 = findViewById(R.id.button29);

        Button button34 = findViewById(R.id.button34);
        Button button35 = findViewById(R.id.button35);
        Button button36 = findViewById(R.id.button36);
        Button button37 = findViewById(R.id.button37);
        Button button38 = findViewById(R.id.button38);
        Button button39 = findViewById(R.id.button39);
        Button button40 = findViewById(R.id.button40);
        Button button41 = findViewById(R.id.button41);
        Button button42 = findViewById(R.id.button42);
        Button button43 = findViewById(R.id.button43);

        Button button49 = findViewById(R.id.button49);
        Button button50 = findViewById(R.id.button50);
        Button button51 = findViewById(R.id.button51);
        Button button52 = findViewById(R.id.button52);
        Button button53 = findViewById(R.id.button53);
        Button button54 = findViewById(R.id.button54);
        Button button55 = findViewById(R.id.button55);
        Button button56 = findViewById(R.id.button56);
        Button button57 = findViewById(R.id.button57);
        Button button58 = findViewById(R.id.button58);

        Button button62 = findViewById(R.id.button62);
        Button button63 = findViewById(R.id.button63);
        Button button64 = findViewById(R.id.button64);
        Button button65 = findViewById(R.id.button65);
        Button button66 = findViewById(R.id.button66);
        Button button67 = findViewById(R.id.button67);
        Button button68 = findViewById(R.id.button68);
        Button button69 = findViewById(R.id.button69);
        Button button70 = findViewById(R.id.button70);
        Button button71 = findViewById(R.id.button71);

        Button button75 = findViewById(R.id.button75);
        Button button76 = findViewById(R.id.button76);
        Button button77 = findViewById(R.id.button77);
        Button button78 = findViewById(R.id.button78);
        Button button79 = findViewById(R.id.button79);
        Button button80 = findViewById(R.id.button80);
        Button button81 = findViewById(R.id.button81);
        Button button82 = findViewById(R.id.button82);
        Button button83 = findViewById(R.id.button83);
        Button button84 = findViewById(R.id.button84);

        Button button88 = findViewById(R.id.button88);
        Button button89 = findViewById(R.id.button89);
        Button button90 = findViewById(R.id.button90);
        Button button91 = findViewById(R.id.button91);
        Button button92 = findViewById(R.id.button92);
        Button button93 = findViewById(R.id.button93);
        Button button94 = findViewById(R.id.button94);
        Button button95 = findViewById(R.id.button95);
        Button button96 = findViewById(R.id.button96);
        Button button97 = findViewById(R.id.button97);

        Button button101 = findViewById(R.id.button101);
        Button button102 = findViewById(R.id.button102);
        Button button103 = findViewById(R.id.button103);
        Button button104 = findViewById(R.id.button104);
        Button button105 = findViewById(R.id.button105);
        Button button106 = findViewById(R.id.button106);
        Button button107 = findViewById(R.id.button107);
        Button button108 = findViewById(R.id.button108);
        Button button109 = findViewById(R.id.button109);
        Button button112 = findViewById(R.id.button112);

        Button button116 = findViewById(R.id.button116);
        Button button117 = findViewById(R.id.button117);
        Button button118 = findViewById(R.id.button118);
        Button button119 = findViewById(R.id.button119);
        Button button120 = findViewById(R.id.button120);
        Button button121 = findViewById(R.id.button121);
        Button button122 = findViewById(R.id.button122);
        Button button123 = findViewById(R.id.button123);
        Button button124 = findViewById(R.id.button124);
        Button button125 = findViewById(R.id.button125);

        Button button129 = findViewById(R.id.button129);
        Button button130 = findViewById(R.id.button130);
        Button button131 = findViewById(R.id.button131);
        Button button132 = findViewById(R.id.button132);
        Button button133 = findViewById(R.id.button133);
        Button button134 = findViewById(R.id.button134);
        Button button135 = findViewById(R.id.button135);
        Button button136 = findViewById(R.id.button136);
        Button button137 = findViewById(R.id.button137);
        Button button138 = findViewById(R.id.button138);

        Button button148 = findViewById(R.id.button148);
        Button button149 = findViewById(R.id.button149);
        Button button150 = findViewById(R.id.button150);
        Button button151 = findViewById(R.id.button151);
        Button button152 = findViewById(R.id.button152);
        Button button154 = findViewById(R.id.button154);
        Button button155 = findViewById(R.id.button155);
        Button button156 = findViewById(R.id.button156);
        Button button157 = findViewById(R.id.button157);
        Button button158 = findViewById(R.id.button158);

        Button button162 = findViewById(R.id.button162);
        Button button163 = findViewById(R.id.button163);
        Button button164 = findViewById(R.id.button164);
        Button button165 = findViewById(R.id.button165);
        Button button166 = findViewById(R.id.button166);
        Button button167 = findViewById(R.id.button167);
        Button button168 = findViewById(R.id.button168);
        Button button169 = findViewById(R.id.button169);
        Button button170 = findViewById(R.id.button170);
        Button button171 = findViewById(R.id.button171);

        Button button175 = findViewById(R.id.button175);
        Button button176 = findViewById(R.id.button176);
        Button button177 = findViewById(R.id.button177);
        Button button178 = findViewById(R.id.button178);
        Button button179 = findViewById(R.id.button179);
        Button button180 = findViewById(R.id.button180);
        Button button181 = findViewById(R.id.button181);
        Button button182 = findViewById(R.id.button182);
        Button button183 = findViewById(R.id.button183);
        Button button184 = findViewById(R.id.button184);

        Button button188 = findViewById(R.id.button188);
        Button button189 = findViewById(R.id.button189);
        Button button190 = findViewById(R.id.button190);
        Button button191 = findViewById(R.id.button191);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button9 = findViewById(R.id.button9);

        Button button18 = findViewById(R.id.button18);
        Button button19 = findViewById(R.id.button19);
        Button button20 = findViewById(R.id.button20);
        Button button21 = findViewById(R.id.button21);
        Button button30 = findViewById(R.id.button30);
        Button button47 = findViewById(R.id.button47);
        Button button48 = findViewById(R.id.button48);
        Button button110 = findViewById(R.id.button110);
        Button button111 = findViewById(R.id.button111);
        Button button142 = findViewById(R.id.button142);
        

        setButtonClickListener(button7);
        setButtonClickListener(button8);
        setButtonClickListener(button22);
        setButtonClickListener(button23);
        setButtonClickListener(button24);
        setButtonClickListener(button25);
        setButtonClickListener(button26);
        setButtonClickListener(button27);
        setButtonClickListener(button28);
        setButtonClickListener(button29);

        setButtonClickListener(button34);
        setButtonClickListener(button35);
        setButtonClickListener(button36);
        setButtonClickListener(button37);
        setButtonClickListener(button38);
        setButtonClickListener(button39);
        setButtonClickListener(button40);
        setButtonClickListener(button41);
        setButtonClickListener(button42);
        setButtonClickListener(button43);

        setButtonClickListener(button49);
        setButtonClickListener(button50);
        setButtonClickListener(button51);
        setButtonClickListener(button52);
        setButtonClickListener(button53);
        setButtonClickListener(button54);
        setButtonClickListener(button55);
        setButtonClickListener(button56);
        setButtonClickListener(button57);
        setButtonClickListener(button58);

        setButtonClickListener(button62);
        setButtonClickListener(button63);
        setButtonClickListener(button64);
        setButtonClickListener(button65);
        setButtonClickListener(button66);
        setButtonClickListener(button67);
        setButtonClickListener(button68);
        setButtonClickListener(button69);
        setButtonClickListener(button70);
        setButtonClickListener(button71);

        setButtonClickListener(button75);
        setButtonClickListener(button76);
        setButtonClickListener(button77);
        setButtonClickListener(button78);
        setButtonClickListener(button79);
        setButtonClickListener(button80);
        setButtonClickListener(button81);
        setButtonClickListener(button82);
        setButtonClickListener(button83);
        setButtonClickListener(button84);

        setButtonClickListener(button88);
        setButtonClickListener(button89);
        setButtonClickListener(button90);
        setButtonClickListener(button91);
        setButtonClickListener(button92);
        setButtonClickListener(button93);
        setButtonClickListener(button94);
        setButtonClickListener(button95);
        setButtonClickListener(button96);
        setButtonClickListener(button97);

        setButtonClickListener(button101);
        setButtonClickListener(button102);
        setButtonClickListener(button103);
        setButtonClickListener(button104);
        setButtonClickListener(button105);
        setButtonClickListener(button106);
        setButtonClickListener(button107);
        setButtonClickListener(button108);
        setButtonClickListener(button109);
        setButtonClickListener(button112);

        setButtonClickListener(button116);
        setButtonClickListener(button117);
        setButtonClickListener(button118);
        setButtonClickListener(button119);
        setButtonClickListener(button120);
        setButtonClickListener(button121);
        setButtonClickListener(button122);
        setButtonClickListener(button123);
        setButtonClickListener(button124);
        setButtonClickListener(button125);

        setButtonClickListener(button129);
        setButtonClickListener(button130);
        setButtonClickListener(button131);
        setButtonClickListener(button132);
        setButtonClickListener(button133);
        setButtonClickListener(button134);
        setButtonClickListener(button135);
        setButtonClickListener(button136);
        setButtonClickListener(button137);
        setButtonClickListener(button138);

        setButtonClickListener(button148);
        setButtonClickListener(button149);
        setButtonClickListener(button150);
        setButtonClickListener(button151);
        setButtonClickListener(button152);
        setButtonClickListener(button154);
        setButtonClickListener(button155);
        setButtonClickListener(button156);
        setButtonClickListener(button157);
        setButtonClickListener(button158);

        setButtonClickListener(button162);
        setButtonClickListener(button163);
        setButtonClickListener(button164);
        setButtonClickListener(button165);
        setButtonClickListener(button166);
        setButtonClickListener(button167);
        setButtonClickListener(button168);
        setButtonClickListener(button169);
        setButtonClickListener(button170);
        setButtonClickListener(button171);

        setButtonClickListener(button175);
        setButtonClickListener(button176);
        setButtonClickListener(button177);
        setButtonClickListener(button178);
        setButtonClickListener(button179);
        setButtonClickListener(button180);

        setButtonClickListener(button181);
        setButtonClickListener(button182);
        setButtonClickListener(button183);
        setButtonClickListener(button184);

        setButtonClickListener(button188);
        setButtonClickListener(button189);
        setButtonClickListener(button190);
        setButtonClickListener(button191);

        setButtonClickListener(button);
        setButtonClickListener(button2);
        setButtonClickListener(button4);
        setButtonClickListener(button5);
        setButtonClickListener(button6);
        setButtonClickListener(button9);

        setButtonClickListener(button18);
        setButtonClickListener(button19);
        setButtonClickListener(button20);
        setButtonClickListener(button21);
        setButtonClickListener(button30);

        setButtonClickListener(button47);
        setButtonClickListener(button48);
        setButtonClickListener(button110);
        setButtonClickListener(button111);
        setButtonClickListener(button142);







}
    private void setButtonClickListener(Button button) {
            button.setOnClickListener(v -> {
                button.setBackgroundColor(Color.LTGRAY);
                selectedButtons.add(button);
                selectedWord += button.getText();
                checkWord(selectedWord);
            });
        }


    // Método para verificar si la palabra seleccionada es correcta
    private void checkWord(String word) {
        String[] validWords = {"ENFRIAMIENTO", "TEMPERATURA", "HUMEDAD", "RELATIVA", "HUMEDO", "ABSOLUTA", "ENTALPIA", "CALOR", "AUMENTO"};

        for (String validWord : validWords) {
            if (word.equals(validWord)) {
                System.out.println("¡Increíble, palabra capturada: " + word + "!");
                break;
            }
        }
    }

    private void highlightCorrectWord() {
        // Verificar que la lista de botones seleccionados no esté vacía
        if (!selectedButtons.isEmpty()) {
            for (Button button : selectedButtons) {
                button.setBackgroundColor(Color.GREEN); // Resalta en verde los botones de la palabra encontrada
            }
        }

        // Reiniciar la palabra seleccionada y la lista de botones seleccionados
        selectedWord = "";
        selectedButtons.clear();
    }
}

// Método para cambiar el color de los botones seleccionados cuando se encuentra una palabra correcta



