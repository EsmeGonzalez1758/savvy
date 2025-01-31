package es.proyect.savvy;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Memorama extends AppCompatActivity{

    private TextView timerText;
    private Button startButton;

    private FrameLayout[] cards;
    private boolean[] isFlipped;

    private List<String> cardContents;
    private int firstCardIndex = -1;
    private int secondCardIndex = -1;

    private CountDownTimer timer;
    private boolean isGameActive = false;

    private int matches = 0;
    private int errors = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorama);

        timerText = findViewById(R.id.timerText);
        startButton = findViewById(R.id.startButton);

        cards = new FrameLayout[]{
                findViewById(R.id.card1), findViewById(R.id.card2),
                findViewById(R.id.card3), findViewById(R.id.card4),
                findViewById(R.id.card5), findViewById(R.id.card6),
                findViewById(R.id.card7), findViewById(R.id.card8)
        };

        isFlipped = new boolean[cards.length];

        cardContents = new ArrayList<>();
        cardContents.add("Condensador");
        cardContents.add("Evaporador");
        cardContents.add("Válvula de Expansión");
        cardContents.add("Compresor");
        cardContents.add("Condensador");
        cardContents.add("Evaporador");
        cardContents.add("Válvula de Expansión");
        cardContents.add("Compresor");

        startButton.setOnClickListener(v -> startGame());

        for (int i = 0; i < cards.length; i++) {
            int finalI = i;
            cards[i].setOnClickListener(v -> onCardClicked(finalI));
        }
    }

    private void startGame() {
        if (isGameActive) return;

        matches = 0;
        errors = 0;
        Collections.shuffle(cardContents);
        for (int i = 0; i < cards.length; i++) {
            isFlipped[i] = false;
            showCardBack(i);
        }

        isGameActive = true;
        firstCardIndex = -1;
        secondCardIndex = -1;

        startTimer();
    }

    private void startTimer() {
        long totalTimeInMillis = 2 * 60 * 1000;

        timer = new CountDownTimer(totalTimeInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int minutes = (int) (millisUntilFinished / 1000) / 60;
                int seconds = (int) (millisUntilFinished / 1000) % 60;
                String timeFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
                timerText.setText("Tiempo: " + timeFormatted);
            }

            @Override
            public void onFinish() {
                timerText.setText("¡Tiempo agotado!");
                showResults();
            }
        }.start();
    }

    private void onCardClicked(int index) {
        if (!isGameActive || isFlipped[index]) return;

        showCardFront(index, cardContents.get(index));
        isFlipped[index] = true;

        if (firstCardIndex == -1) {
            firstCardIndex = index;
        } else if (secondCardIndex == -1) {
            secondCardIndex = index;
            checkForMatch();
        }
    }

    private void checkForMatch() {
        if (cardContents.get(firstCardIndex).equals(cardContents.get(secondCardIndex))) {
            matches++;
            firstCardIndex = -1;
            secondCardIndex = -1;
        } else {
            errors++;
            cards[firstCardIndex].postDelayed(() -> {
                showCardBack(firstCardIndex);
                showCardBack(secondCardIndex);

                isFlipped[firstCardIndex] = false;
                isFlipped[secondCardIndex] = false;

                firstCardIndex = -1;
                secondCardIndex = -1;
            }, 1000);
        }
    }

    private void showCardFront(int index, String content) {
        FrameLayout card = cards[index];
        ImageView cardBack = card.findViewById(getResources().getIdentifier("card_back" + (index + 1), "id", getPackageName()));
        TextView cardFrontText = card.findViewById(getResources().getIdentifier("card_front_text" + (index + 1), "id", getPackageName()));

        if (cardBack != null) cardBack.setVisibility(View.GONE);
        if (cardFrontText != null) {
            cardFrontText.setText(content);
            cardFrontText.setVisibility(View.VISIBLE);
        }
    }

    private void showCardBack(int index) {
        FrameLayout card = cards[index];
        ImageView cardBack = card.findViewById(getResources().getIdentifier("card_back" + (index + 1), "id", getPackageName()));
        TextView cardFrontText = card.findViewById(getResources().getIdentifier("card_front_text" + (index + 1), "id", getPackageName()));

        if (cardFrontText != null) {
            cardFrontText.setVisibility(View.GONE);
        }
        if (cardBack != null) cardBack.setVisibility(View.VISIBLE);
    }

    private void showResults() {
        new AlertDialog.Builder(this)
                .setTitle("Resultados")
                .setMessage("Aciertos: " + matches + "\nErrores: " + errors)
                .setPositiveButton("Aceptar", (dialog, which) -> dialog.dismiss())
                .show();
    }

    @Override
    protected void onDestroy() {
        if (timer != null) timer.cancel();
        super.onDestroy();
    }
}

