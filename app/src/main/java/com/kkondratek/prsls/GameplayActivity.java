package com.kkondratek.prsls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GameplayActivity extends AppCompatActivity {

    private ImageView botChoiceView;
    private TextView resultText;

    private TextView playerScoreText;
    private TextView botScoreText;

    private int playerScore;
    private int botScore;

    private String botScoreStr;
    private String playerScoreStr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        botChoiceView = findViewById(R.id.botChoiceView);
        resultText = findViewById(R.id.gameResultsText);
        playerScoreText = findViewById(R.id.playerScoreText);
        playerScoreStr = getResources().getString(R.string.player_score);
        botScoreText = findViewById(R.id.botScoreText);
        botScoreStr = getResources().getString(R.string.bot_score);

        playerScore = 0;
        playerScoreText.setText(playerScoreStr + playerScore);
        botScore = 0;
        botScoreText.setText(botScoreStr + botScore);
    }

    public void playerChoice(View view) {
        int playerChoice = view.getId();
        int score = getGameScore(playerChoice);
        if (score > 0) {
            playerScore++;
            playerScoreText.setText(playerScoreStr + playerScore);
        } else if (score < 0) {
            botScore++;
            botScoreText.setText(botScoreStr + botScore);
        }
    }


    public void resetScore(View view) {
        playerScore = 0;
        playerScoreText.setText(playerScoreStr + playerScore);

        botScore = 0;
        botScoreText.setText(botScoreStr + botScore);
    }


    private int getGameScore(int playerChoice) {
        int score = 0;

        Random random = new Random();
        int botChoice = random.nextInt(5);

        String gameResultText;
        //resultText.setVisibility(View.VISIBLE);
        switch (botChoice) {
            case 0: //rock
                botChoiceView.setImageResource(R.drawable.rock_button);
                switch (playerChoice) {
                    case R.id.paperButton:
                        gameResultText = getResources().getString(R.string.paper_rock) + getResources().getString(R.string.player_won);
                        resultText.setText(gameResultText);
                        score = 1;
                        break;
                    case R.id.scissorsButton:
                        gameResultText = getResources().getString(R.string.rock_scissors) + getResources().getString(R.string.bot_won);
                        resultText.setText(gameResultText);
                        score = -1;
                        break;
                    case R.id.lizardButton:
                        gameResultText = getResources().getString(R.string.rock_lizard) + getResources().getString(R.string.bot_won);
                        resultText.setText(gameResultText);
                        score = -1;
                        break;
                    case R.id.spockButton:
                        gameResultText = getResources().getString(R.string.spock_rock) + getResources().getString(R.string.player_won);
                        resultText.setText(gameResultText);
                        score = 1;
                        break;
                    default:
                        resultText.setText(getResources().getString(R.string.draw));
                        score = 0;
                        break;
                }
                break;
            case 1: //paper
                botChoiceView.setImageResource(R.drawable.paper_button);
                switch (playerChoice) {
                    case R.id.rockButton:
                        gameResultText = getResources().getString(R.string.paper_rock) + getResources().getString(R.string.bot_won);
                        resultText.setText(gameResultText);
                        score = -1;
                        break;
                    case R.id.scissorsButton:
                        gameResultText = getResources().getString(R.string.scissors_paper) + getResources().getString(R.string.player_won);
                        resultText.setText(gameResultText);
                        score = 1;
                        break;
                    case R.id.lizardButton:
                        gameResultText = getResources().getString(R.string.lizard_paper) + getResources().getString(R.string.player_won);
                        resultText.setText(gameResultText);
                        score = 1;
                        break;
                    case R.id.spockButton:
                        gameResultText = getResources().getString(R.string.paper_spock) + getResources().getString(R.string.bot_won);
                        resultText.setText(gameResultText);
                        score = -1;
                        break;
                    default:
                        resultText.setText(getResources().getString(R.string.draw));
                        score = 0;
                        break;
                }
                break;
            case 2: //scissors
                botChoiceView.setImageResource(R.drawable.scissors_button);
                switch (playerChoice) {
                    case R.id.paperButton:
                        gameResultText = getResources().getString(R.string.scissors_paper) + getResources().getString(R.string.bot_won);
                        resultText.setText(gameResultText);
                        score = -1;
                        break;
                    case R.id.rockButton:
                        gameResultText = getResources().getString(R.string.rock_scissors) + getResources().getString(R.string.player_won);
                        resultText.setText(gameResultText);
                        score = 1;
                        break;
                    case R.id.lizardButton:
                        gameResultText = getResources().getString(R.string.scissors_lizard) + getResources().getString(R.string.bot_won);
                        resultText.setText(gameResultText);
                        score = -1;
                        break;
                    case R.id.spockButton:
                        gameResultText = getResources().getString(R.string.spock_scissors) + getResources().getString(R.string.player_won);
                        resultText.setText(gameResultText);
                        score = 1;
                        break;
                    default:
                        resultText.setText(getResources().getString(R.string.draw));
                        score = 0;
                        break;
                }
                break;
            case 3: //lizard
                botChoiceView.setImageResource(R.drawable.lizard_button);
                switch (playerChoice) {
                    case R.id.paperButton:
                        gameResultText = getResources().getString(R.string.lizard_paper) + getResources().getString(R.string.bot_won);
                        resultText.setText(gameResultText);
                        score = -1;
                        break;
                    case R.id.scissorsButton:
                        gameResultText = getResources().getString(R.string.scissors_lizard) + getResources().getString(R.string.player_won);
                        resultText.setText(gameResultText);
                        score = 1;
                        break;
                    case R.id.rockButton:
                        gameResultText = getResources().getString(R.string.rock_lizard) + getResources().getString(R.string.player_won);
                        resultText.setText(gameResultText);
                        score = 1;
                        break;
                    case R.id.spockButton:
                        gameResultText = getResources().getString(R.string.lizard_spock) + getResources().getString(R.string.bot_won);
                        resultText.setText(gameResultText);
                        score = -1;
                        break;
                    default:
                        resultText.setText(getResources().getString(R.string.draw));
                        score = 0;
                        break;
                }
                break;
            case 4: //spock
                botChoiceView.setImageResource(R.drawable.spock_button);
                switch (playerChoice) {
                    case R.id.paperButton:
                        gameResultText = getResources().getString(R.string.paper_spock) + getResources().getString(R.string.player_won);
                        resultText.setText(gameResultText);
                        score = 1;
                        break;
                    case R.id.scissorsButton:
                        gameResultText = getResources().getString(R.string.spock_scissors) + getResources().getString(R.string.bot_won);
                        resultText.setText(gameResultText);
                        score = -1;
                        break;
                    case R.id.lizardButton:
                        gameResultText = getResources().getString(R.string.lizard_spock) + getResources().getString(R.string.player_won);
                        resultText.setText(gameResultText);
                        score = 1;
                        break;
                    case R.id.rockButton:
                        gameResultText = getResources().getString(R.string.spock_rock) + getResources().getString(R.string.bot_won);
                        resultText.setText(gameResultText);
                        score = -1;
                        break;
                    default:
                        resultText.setText(getResources().getString(R.string.draw));
                        score = 0;
                        break;
                }
                break;
        }
        return score;
    }
}
